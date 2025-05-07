package com.xworkz.jdbc.external;

import com.xworkz.jdbc.internal.JDBC;

public class Mongo {
    private JDBC jdbc;

    public Mongo(JDBC jdbc){
        this.jdbc=jdbc;
    }
    public void mongoInfo(){
        this.jdbc.save();
        if(this.jdbc!=null){
            System.out.println("running mongoinfo");
        }
        else{
            System.out.println("jdbc is null");
        }
    }
}
