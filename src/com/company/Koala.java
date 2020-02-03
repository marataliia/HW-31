package com.company;

public class Koala implements Climbable {
    private static String name;

    public Koala(String name) {
        this.name = name;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
