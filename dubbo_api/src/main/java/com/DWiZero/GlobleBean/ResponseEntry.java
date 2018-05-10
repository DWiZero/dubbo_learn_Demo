package com.DWiZero.GlobleBean;

import java.io.Serializable;

public class ResponseEntry<T> implements Serializable
{
    private static final long serialVersionUID = -2098954909611373376L;
    private Integer code = 200;
    private String message ="success";
    private T data;

    public Integer getCode()
    {
        return code;
    }

    public void setCode(Integer code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}
