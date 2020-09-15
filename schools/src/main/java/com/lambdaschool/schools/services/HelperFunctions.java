package com.lambdaschool.schools.services;

import com.lambdaschool.schools.models.ValidationError;

import java.util.List;

public interface HelperFunctions
{
    //step 2 to help us create our own exception/customerrordetails
    List<ValidationError> getConstraintViolations(Throwable cause);
}
