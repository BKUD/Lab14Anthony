package com.Lab1;

public class Main {
    public static void main(String[] args) {


        Hero hero1 = new Hero(new Flying());
        Hero hero2 = new Hero(new HorseRiding());
        Hero hero3 = new Hero(new Walking());

        hero1.move();
        hero2.move();
        hero3.move();


    }


}
