package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Fruit redApple = new Fruit(FruitType.APPLE, Color.RED, 0.146, 10.49);
        System.out.println("greenApple: " + redApple);

        Fruit greenApple = new Fruit(FruitType.APPLE, Color.GREEN, 0.056, 11.59);
        System.out.println("greenApple: " + greenApple);

        Fruit lemon = new Fruit(FruitType.LEMON, Color.YELLOW, 0.111, 35.50);
        System.out.println("lemon: " + lemon);


        Fruit banana = new Fruit(FruitType.BANANA, Color.YELLOW, 0.150, 20.00);;
        System.out.println("banana: " + banana);
        
        Fruit[] arr = new Fruit[4];
        arr[0] = redApple;
        arr[1] = greenApple;
        arr[2] = lemon;
        arr[3] = banana;

        printPrice(arr);

    }

    private static void printPrice(Fruit [] arr){
        double price = 0;
        for (int i = 0; i < arr.length; i++) {
            price = price + arr[i].price();
        }
        System.out.println("Sum price: " + price);
    }
}
