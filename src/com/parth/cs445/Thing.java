package com.parth.cs445;

/**
 * Created by Parth on 1/29/2016.
 */
public class Thing {

    private String name;

    public Thing(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name =  name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        String className = this.getClass().getSimpleName();
        if (className.equals("Thing")){
            return name;
        }
        return name + " " + className;
    }
}
