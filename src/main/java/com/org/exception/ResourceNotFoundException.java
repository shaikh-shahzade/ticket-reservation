package com.org.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String resource, String value,Long id )
    {
        super(String.format("Resource: [%s] not available for %s:%d",resource,value,id));
    }

}
