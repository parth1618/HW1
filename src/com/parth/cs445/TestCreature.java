package com.parth.cs445;

/**
 * Created by Parth on 1/29/2016.
 */
public class TestCreature {

    public static final int THING_COUNT = 6;
    public static final int CREATURE_COUNT = 4;

    private Thing[] thingArray = new Thing[THING_COUNT];
    private Creature[] creatureArray = new Creature[CREATURE_COUNT];

    private Thing banana;
    private Thing locomotive;

    private Tiger tiger;
    private Ant ant;
    private Fly fly;
    private Bat bat;

    public TestCreature(){

    }

    private void init(){
        banana = new Thing("Bananas");
        locomotive = new Thing("Locomotive");

        tiger = new Tiger("SherKahn");
        ant = new Ant("Bully");
        fly = new Fly("Joe");
        bat = new Bat("BruceWayne");
    }

    private void createThings(){
        thingArray[0] = banana;
        thingArray[1] = tiger;
        thingArray[2] = ant;
        thingArray[3] = locomotive;
        thingArray[4] = fly;
        thingArray[5] = bat;
    }

    private void createCreatures(){
        creatureArray[0] = tiger;
        creatureArray[1] = ant;
        creatureArray[2] = fly;
        creatureArray[3] = bat;
    }

    private void printThingsAndCreatures(){
        System.out.println("Things:");
        for (Thing thing:thingArray) {
            System.out.println(thing);
        }
        System.out.println("\nCreatures:");
        for (Creature creature:creatureArray) {
            System.out.println(creature);
        }
        System.out.println();
    }

    private void testCreaturesMethod() {
        System.out.println("\nTesting Creature Methos:\n");

        for (Creature creature:creatureArray) {

            creature.whatDidYouEat();//to check message when stomach is empty
            creature.eat(banana);// to check message when creature eats aThing
            creature.eat(tiger);// to check message when creature eats aCreature
            creature.whatDidYouEat();// to check what did aCreature last eat
            creature.move();// to check message when creature is told to move
            System.out.println();
        }

        fly.fly(); //to check fly method on Fly Creature
        bat.fly(); // to check fly method on bat Creature

    }

    public static void main(String argsp[]){
        TestCreature tc = new TestCreature();

        tc.init();

        tc.createThings();
        tc.createCreatures();
        tc.printThingsAndCreatures();

        tc.testCreaturesMethod();
    }



}
