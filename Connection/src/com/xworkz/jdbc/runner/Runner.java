package com.xworkz.jdbc.runner;

import com.xworkz.jdbc.external.*;
import com.xworkz.jdbc.internal.*;

public class Runner {
    public static void main(String[] args){

        JDBC jdbc=new MysqlJDBC();

        Mongo mongo=new Mongo(jdbc);
        mongo.mongoInfo();


    }
}
