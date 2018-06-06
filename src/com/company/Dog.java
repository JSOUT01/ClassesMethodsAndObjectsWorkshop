package com.company;

public class Dog {

    String name;
    boolean fur;
    boolean tail;
    char gender;
    double weight;
    int legs;


    public Dog(String name, char gender, double weight, int legs) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
