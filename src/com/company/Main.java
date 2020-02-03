package com.company;

public class Main {

    public static void main(String[] args) {
        Monkey monkey = new Monkey("Monkey");
        Climbable Koala = new Koala("Koala");
        Kangaroo kangaroo = new Kangaroo();
        Fruits fruits = new Fruits("Banana");
        monkey.CarryOn(Koala);
        monkey.CarryOn(monkey);
        monkey.CarryOn(kangaroo);
        monkey.eat(fruits);


    }
}
