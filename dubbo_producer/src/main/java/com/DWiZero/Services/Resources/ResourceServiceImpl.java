package com.DWiZero.Services.Resources;

import com.DWiZero.Config.PropertyLoad;
import com.DWiZero.Resources.ResourceService;
import org.apache.dubbo.config.annotation.Service;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Service
@Component
public class ResourceServiceImpl implements ResourceService
{
    private Logger logger = LoggerFactory.getLogger(ResourceServiceImpl.class);
    @Autowired
    private PropertyLoad propertyLoad;

    @Override
    public void fileUpload(String fileName,byte[] file) throws IOException
    {
        fileName = propertyLoad.getBaseFilePath() + fileName;
        FileUtils.writeByteArrayToFile(new File(fileName),file);
    }

}
