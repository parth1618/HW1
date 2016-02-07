package com.parth.cs445;

/**
 * Created by Parth on 1/29/2016.
 */
public abstract class Creature extends Thing{

    private Thing lastEatenThing = null;

    public Creature(String name) {
        super(name);
    }

    public void eat(Thing thing){
        if(thing == null)throw new ThingCanNotBeNullException();
        lastEatenThing = thing;
        System.out.println(this + " has just eaten " + thing.getName());
    }

    public abstract void move();

    public void whatDidYouEat(){
        if(isStomachEmpty()){
            System.out.println(this + " has had nothing to eat.");
        }else{
            System.out.println(this + " has eaten a " + lastEatenThing.getName());
        }
    }

    private boolean isStomachEmpty(){
        return (lastEatenThing == null)? true : false;
    }

    public Thing getLastEatenThing() {
        return lastEatenThing;
    }

    public class ThingCanNotBeNullException extends RuntimeException{
    }
}
