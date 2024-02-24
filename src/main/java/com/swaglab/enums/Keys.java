package com.swaglab.enums;

public enum Keys {
    
    NAME("firstName"),
    LAST("lastName"),
    ZIPCODE("zipCode");

    private String key;


    Keys(String key){
        this.key=key;
    }

    public String getKey() {
        return key;
    }
  
}
