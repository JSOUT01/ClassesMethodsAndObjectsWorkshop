package com.company;

public class Pet {

    String ownerName;
    String petName;
    int age;
    char gender;
    String homeAdress;

    public Pet(String ownerName, String petName, int age, char gender, String homeAdress) {
        this.ownerName = ownerName;
        this.petName = petName;
        this.age = age;
        this.gender = gender;
        this.homeAdress = homeAdress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    protected String makeSound() {

    return "pets have no sound";}


}
