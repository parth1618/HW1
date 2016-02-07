package com.parth.cs445;

/**
 * Created by Parth on 1/29/2016.
 */
public class Tiger extends Creature{

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(this + " has just pounced.");
    }
}
