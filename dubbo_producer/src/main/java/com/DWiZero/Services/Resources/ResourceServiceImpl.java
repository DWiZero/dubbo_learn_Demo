package com.DWiZero.Services.Resources;

import com.DWiZero.Config.PropertyLoad;
import com.DWiZero.resources.ResourceService;
import com.alibaba.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Service
@Component
public class ResourceServiceImpl implements ResourceService
{
    private Logger logger = LoggerFactory.getLogger(ResourceServiceImpl.class);
    @Autowired
    private PropertyLoad propertyLoad;

    @Override
    public void fileUpload(List<MultipartFile> files) throws IOException
    {
        MultipartFile file = null;
        BufferedOutputStream stream = null;
        String fileName;
        byte[] bytes;
        for (int i = 0; i < files.size(); ++i) {
            file = files.get(i);
            if (!file.isEmpty()) {
                fileName = propertyLoad.getBaseFilePath() + file.getOriginalFilename();
                try {
                    bytes = file.getBytes();
                    stream = new BufferedOutputStream(new FileOutputStream(new File(fileName)));
                    stream.write(bytes);
                } catch (IOException e) {
                    logger.error(e.getMessage());
                }finally {
                    stream.close();
                }
            }
        }
    }
}
