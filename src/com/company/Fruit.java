package com.company;

import java.awt.*;

public class Fruit {
    public Fruit(FruitType type, Color color, double weight, double priseKg){
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.priceKg = priseKg;
    }

    //тип
    private FruitType type;
    //цвет
    private Color color;
    //вес
    private double weight;
    //цена за 1 кг
    private double priceKg;



    public FruitType getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public double getPriceKg() {
        return priceKg;
    }

    public void setType(FruitType type) {
        this.type = type;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPriceKg(double priceKg) {
        this.priceKg = priceKg;
    }

    public double price(){
        return weight * priceKg;
    }

    public String toString(){
        return "Pruit {" +
                "type='" + type + '\'' +
                ", color=" + color +
                ", weight=" + weight +
                ", priseKg=" + priceKg +
                '}';
    }

}
