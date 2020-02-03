package com.company;


public class Monkey implements Climbable {
    private static String name;

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monkey(String name) {
        this.name = name;
    }

    public void CarryOn(Object climbable) {
            if(climbable instanceof Koala){
                System.out.println("Monkey carry on "+Koala.getName());
            }else if(climbable instanceof Monkey){
                System.out.println("Monkey carry on "+Monkey.getName());
            }
            else{
                System.out.println("Monkey cant carry on unclimbable animals!");
            }
    }

    public void eat (Fruits fruits) {
             System.out.println("Monkey eats "+fruits.getName());
     }
 }
