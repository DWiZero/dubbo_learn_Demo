package com.DWiZero.GlobleBean;

import java.io.Serializable;

public class ServiceException extends RuntimeException implements Serializable
{
    private static final long serialVersionUID = -74749435392649424L;

    public ServiceException(String msg, Integer code)
    {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;
    private String msg;

    public Integer getCode()
    {
        return code;
    }

    public void setCode(Integer code)
    {
        this.code = code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }
}
