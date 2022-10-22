package com.APIRest.Client.controller;

public class ResourceNotFoundException extends Exception{
    public  ResourceNotFoundException(String msg){
        super(msg);
    }
}
