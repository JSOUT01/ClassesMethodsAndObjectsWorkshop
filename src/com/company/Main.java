package com.company;

public class Main {

    public static void main(String[] args) {
Cat myCat = new Cat("Crystal","Abby", 3,'f',"Pikeville",true,10);

Cat jamesCat = new Cat("James","Maris",4,'f',"4621 Beaver Road",true, 11.5);

System.out.println("The name of my cat is: " + jamesCat.getPetName());

jamesCat.setWiskers(true);
        System.out.println("Does this cat have whiskers? " + jamesCat.isWiskers());

        System.out.println(jamesCat.makeSound());

        System.out.println(jamesCat.catYears());

        
    }
}
