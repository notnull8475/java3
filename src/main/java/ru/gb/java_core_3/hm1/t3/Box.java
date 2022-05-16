package ru.gb.java_core_3.hm1.t3;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private final String name;
    private ArrayList<T> fruits;

    public Box(String name) {
        fruits = new ArrayList<>();
        this.name = name;
    }

    public void addFruit(T... f) {
        fruits.addAll(List.of(f));
    }

    public double getWeight() {
//        if (this.fruits.size() > 0) {
//            return fruits.get(0).weight() * fruits.size();
//        } else return 0;
        double w = 0;
        for (Fruit f : this.fruits) {
            w += f.weight();
        }
        return w;
    }

    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    //пересыпать фрукты из этой коробки в другую
    public void pourOverTo(Box<T> another) {
        if (this == another) return;
        another.fruits.addAll(this.fruits);
        this.fruits.clear();
    }


    //пересыпать фрукты из другой в эту
    public void pourOverFrom(Box<T> another) {
        if (this == another) return;
        this.fruits.addAll(another.fruits);
        another.fruits.clear();
    }


    public String getName() {
        return name;
    }
}
