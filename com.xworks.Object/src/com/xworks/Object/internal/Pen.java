package com.xworks.Object.internal;
import java.util.Objects;

public class Pen {
    private String name;
    private int cost;
    private String type;
    private String material;

    public Pen(String name,int cost,String type,String material){
        this.name=name;
        this.cost=cost;
        this.type=type;
        this.material=material;

    }
    @Override
    public String toString() {
        return "Pen{name='" + name + "', cost=" + cost + ", type='" + type + "', material='" + material + "'}";
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj!=null && obj instanceof Pen)
        {
            Pen pen=(Pen) obj;
            if( Objects.equals(this.cost,pen.cost))
            {
                System.out.println("bottle is matching..");
                return true;
            }
        }
        return false;
    }

}