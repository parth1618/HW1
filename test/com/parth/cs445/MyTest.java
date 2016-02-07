package com.parth.cs445;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Parth on 1/29/2016.
 */
public class MyTest{
    Thing thing;
    Tiger tiger;
    Ant ant;
    Bat bat;
    Fly fly;

    @Before
    public void setup(){
        thing = new Thing("testThing");

        tiger = new Tiger("testTiger");
        ant = new Ant("testAnt");
        bat = new Bat("testBat");
        fly = new Fly("testFly");

    }

    @Test
    public void testThing_toString_message(){
        assertEquals("testThing",thing.toString());
    }

    @Test
    public void testCreature_toString_message(){
        assertEquals("testTiger Tiger",tiger.toString());
        assertEquals("testAnt Ant",ant.toString());
        assertEquals("testBat Bat",bat.toString());
        assertEquals("testFly Fly",fly.toString());
    }

    @Test
    public void testCreature_eatAnything(){
        assertNull(tiger.getLastEatenThing());
        tiger.eat(thing);
        assertNotNull(tiger.getLastEatenThing());
        tiger.eat(ant);
        assertEquals(ant,tiger.getLastEatenThing());
    }

    @Test
    public void testCreature_eatOnlyAThing(){
        fly.eat(ant);
        assertNull(fly.getLastEatenThing());
        fly.eat(thing);
        assertEquals(thing, fly.getLastEatenThing());
    }

    @Test
    public void testCreature_eatOnlyACreature(){
        bat.eat(thing);
        assertNull(bat.getLastEatenThing());
        bat.eat(tiger);
        assertEquals(tiger, bat.getLastEatenThing());
    }

    @Test
    public void testCreature_checkLastEatenThing(){
        tiger.eat(ant);
        tiger.eat(bat);
        assertEquals(bat,tiger.getLastEatenThing());
        assertNotEquals(ant,tiger.getLastEatenThing());
    }

    @Test(expected = Creature.ThingCanNotBeNullException.class)
    public void testCreature_eatNullThing(){
        Thing newThing = null;
        Tiger nullEater = new Tiger("nullEater");
        nullEater.eat(newThing);
        assertNotNull(nullEater.getLastEatenThing());
    }
}