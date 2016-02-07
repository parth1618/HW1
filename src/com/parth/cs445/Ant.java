package com.parth.cs445;

/**
 * Created by Parth on 1/29/2016.
 */
public class Ant extends Creature{

    public Ant(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(this + " is crawling around.");
    }
}
