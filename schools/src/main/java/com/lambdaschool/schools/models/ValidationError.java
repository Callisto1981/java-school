package com.lambdaschool.schools.models;

public class ValidationError
{
    //Step 3 creating the model
    //this is a pojo, spring doesnt need to know about it/spring isn't using it
    private String code; //the thing that caused the problem /password/email

    private String message;//thats the problem it created/ explains what the problem is

    public ValidationError()
    {
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
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
}
