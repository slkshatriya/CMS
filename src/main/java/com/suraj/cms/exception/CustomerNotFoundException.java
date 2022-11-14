package com.suraj.cms.exception;

public class CustomerNotFoundException extends RuntimeException{

    public CustomerNotFoundException(String message){

        super(message);
    }
}
