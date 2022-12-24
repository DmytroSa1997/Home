package org.example;

import Home2.Animal;
import Home2.Cat;
import Home2.Dog;
import Home2.Veterinarian;

public class Main {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        myCat.getVoice();
        myCat.eat();
        myCat.sleep();
        myDog.getVoice();
        myDog.eat();
        myDog.sleep();
        veterinarian.treatment();

    }
}