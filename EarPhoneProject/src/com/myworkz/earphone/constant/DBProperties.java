package com.myworkz.earphone.constant;

public enum DBProperties {

    URL("jdbc:mysql://localhost:3306/xworkz"),
    USER_NAME("root"),
    SECRET("8970020170D@d"),
    VERSION_8;

    private String prop;

    private DBProperties(String prop){
        this.prop=prop;
    }
    private DBProperties(){

    }
    public  String getProp(){
        return prop;
    }
}