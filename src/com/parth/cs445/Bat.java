package com.parth.cs445;

/**
 * Created by Parth on 1/29/2016.
 */
public class Bat extends Creature implements Flyer{

    public Bat(String name) {
        super(name);
    }

    @Override
    public void eat(Thing thing) {
        String className = thing.getClass().getSimpleName();
        if (className.equals("Thing")) {
            System.out.println(this + " won't eat a " + thing.getName());
        }else{
            super.eat(thing);
        }
    }

    @Override
    public void move() {
        fly();
    }

    @Override
    public void fly(){
        System.out.println(this + " is swooping through the dark.");
    }


}
