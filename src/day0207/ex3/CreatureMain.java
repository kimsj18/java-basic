package day0207.ex3;

import day10.A;
import day10.package2.C;

class Creture{
    int life;

    Creture(Animal animal){
        Animal animal1 = animal;
    }

    public void method1(){
       // Animal animal = new Animal();

    }
}

class Animal{}


public class CreatureMain {
    Animal animal = new Animal();
    Creture creture = new Creture(animal);

}
