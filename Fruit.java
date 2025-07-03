package com.dkte;

public class Fruit {
    private String name;
    private String color;
    private double weight;
    private boolean isFresh;

    public Fruit(String name, double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.isFresh = true;
    }

    public String getName() {
        return name;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    public String taste() {
        return "no specific taste";
    }

    @Override
    public String toString() {
        return name + " - Color: " + color + ", Weight: " + weight + "kg";
    }
}



class Apple extends Fruit {
    public Apple(String name, double weight, String color) {
        super(name, weight, color);
    }

    @Override
    public String taste() {
        return "sweet n sour";
    }
}



class Mango extends Fruit {
    public Mango(String name, double weight, String color) {
        super(name, weight, color);
    }

    @Override
    public String taste() {
        return "sweet";
    }
}



class Orange extends Fruit {
    public Orange(String name, double weight, String color) {
        super(name, weight, color);
    }

    @Override
    public String taste() {
        return "sour";
    }
}



