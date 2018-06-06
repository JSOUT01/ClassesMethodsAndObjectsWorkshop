package com.company;

public class Cat {

    String name;
    boolean wiskers;
    boolean fur;
    int legs;
    double weight;
    String furColor;

    public Cat(String name, int legs, double weight) {
        this.name = name;
        this.legs = legs;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWiskers() {
        return wiskers;
    }

    public void setWiskers(boolean wiskers) {
        this.wiskers = wiskers;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}