package com.DWiZero.Rest;

import com.DWiZero.resources.ResourceService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
@RequestMapping("/resource")
public class ResourceController
{
    @Reference
    private ResourceService resourceService;

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public void upload(HttpServletRequest request) throws IOException
    {
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");

        MultipartFile file = null;
        String fileName;
        InputStream in;
        for (int i = 0; i < files.size(); ++i)

        {
            file = files.get(i);
            if (!file.isEmpty()) {
                fileName = file.getOriginalFilename();
                in = file.getInputStream();
                resourceService.fileUpload(fileName, file.getBytes());
            }
        }
    }
}