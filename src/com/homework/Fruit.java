package com.homework;

public class Fruit {
    private FruitType type;
    private FruitColor color;
    private int weight; // in grams
    private double pricePerKg;

    public Fruit() {
    }

    public Fruit(FruitType type, FruitColor color, int weight, double pricePerKg) {
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    public double getPrice() {
        return pricePerKg * weight / 1000; // округлить до сотых
    }

    public FruitType getType() {
        return type;
    }

    public void setType(FruitType type) {
        this.type = type;
    }

    public FruitColor getColor() {
        return color;
    }

    public void setColor(FruitColor color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Fruit{");
        sb.append("type = ").append(type);
        sb.append(", color = ").append(color);
        sb.append(", weight = ").append(weight);
        sb.append(", pricePerKg = ").append(pricePerKg);
        sb.append('}');
        return sb.toString();
    }
}
