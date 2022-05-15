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

    public void addFruid(T... f) {
        fruits.addAll(List.of(f));
    }

    public float getWeight() {
        if (this.fruits.size() > 0) {
            return fruits.get(0).weight() * fruits.size();
        } else return 0;
    }

    public boolean compare(Box<?> another) {
        return this.getWeight() == another.getWeight();
    }

    //пересыпать фрукты из этой коробки в другую
    public void pourOverTo(Box<T> another) {
        another.fruits.addAll(this.fruits);
        this.fruits.clear();
    }


    //пересыпать фрукты из другой в эту
    public void pourOverFrom(Box<T> another) {
        this.fruits.addAll(another.fruits);
        another.fruits.clear();
    }


    public String getName() {
        return name;
    }
}
