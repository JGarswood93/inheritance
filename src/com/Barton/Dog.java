package com.Barton;

public class Dog extends animal { //extends the state of behaviour defined in the animal class to be used in the dog
    //need a constructor for another class

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) { //parameters have been added from animal class
            super(name, 1, 1, size, weight);//super calls constructor from the class we are calling from

        //example of inheritance
        //we can add more features that are characteristics of a dog

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    //private method unique to a certain class of a certain behaviour
    private void chew() {
        System.out.println("Dog.chew() called");

    }

    @Override
    public void eat() {
        System.out.println("Dog.chew( called");
        chew();
        super.eat(); //call the super equivalent
    }
    public void walk() {
        System.out.println("Dog.walk().called");
        super.move(5);
    }
    public void run() {
        System.out.println("Dog.run() called");
        move(10);

    }
    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}