package com.DWiZero.resources;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ResourceService
{
    public void fileUpload(List<MultipartFile> files) throws IOException;
}
