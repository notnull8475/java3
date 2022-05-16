package ru.gb.java_core_3.hm1;

import ru.gb.java_core_3.hm1.t3.Apple;
import ru.gb.java_core_3.hm1.t3.Box;
import ru.gb.java_core_3.hm1.t3.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork1 {

    public void swaper(Object[] arr, int a, int b){
        Object t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

//    2. Написать метод, который преобразует массив в ArrayList;
    public <T> ArrayList<T> arrToList (T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>("appleBox");
        Box<Orange> orangeBox = new Box<>("orangeBox");
        Box<Apple> appleBox1 = new Box<>("appleBox1");
        Box<Orange> orangeBox1 = new Box<>("orangeBox1");

        for (int i = 0; i < 10; i++) {
            appleBox.addFruit(new Apple());
            orangeBox.addFruit(new Orange());
        }
        for (int i = 0; i < 11; i++) {
            appleBox1.addFruit(new Apple());
            orangeBox1.addFruit(new Orange());
        }

        System.out.println(appleBox.compare(orangeBox));
        System.out.println(appleBox.compare(orangeBox1));
        System.out.println(appleBox.getName() + "  " + appleBox.getWeight());
        System.out.println(orangeBox.getName() + "  " + orangeBox.getWeight());
        System.out.println(appleBox1.getName() + "  " + appleBox1.getWeight());
        System.out.println(orangeBox1.getName() + "  " + orangeBox1.getWeight());

        appleBox.pourOverFrom(appleBox1);
        orangeBox.pourOverTo(orangeBox1);

        System.out.println(appleBox.getName() + " " + appleBox.getWeight());
        System.out.println(orangeBox.getName() + " " + orangeBox.getWeight());
        System.out.println(appleBox1.getName() + " " + appleBox1.getWeight());
        System.out.println(orangeBox1.getName() + " " + orangeBox1.getWeight());

    }
}
