package com.DWiZero.resources;

import java.io.IOException;

public interface ResourceService
{
    public void fileUpload(String fileName,byte[] file) throws IOException;
}
