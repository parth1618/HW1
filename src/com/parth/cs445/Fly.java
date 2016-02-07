package com.parth.cs445;

/**
 * Created by Parth on 1/29/2016.
 */
public class Fly extends Creature implements Flyer{

    public Fly(String name) {
        super(name);
    }

    @Override
    public void eat(Thing thing) {
        String className = thing.getClass().getSimpleName();
        if (className.equals("Thing")) {
            super.eat(thing);
        }else{
            System.out.println(this + " won't eat a " + thing.getName());
        }
    }

    @Override
    public void move() {
        fly();
    }

    @Override
    public void fly(){
        System.out.println(this + " is buzzing around in flight.");
    }


}
