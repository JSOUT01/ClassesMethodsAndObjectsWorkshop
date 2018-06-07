package com.company;

public class Monkey extends Pet{


    boolean fur;
    boolean tail;
    double weight;
    String furColor;
    char gender;

    public Monkey(String ownerName, String petName, int age, char gender, String homeAdress) {
        super(ownerName, petName, age, gender, homeAdress);
    }

//    public Monkey(double weight, String furColor, char gender) {
//        this.weight = weight;
//        this.furColor = furColor;
//        this.gender = gender;
//    }

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
