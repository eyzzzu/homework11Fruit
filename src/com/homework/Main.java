package com.homework;

public class Main {

    public static void main(String[] args) {
        Fruit lemon = new Fruit(FruitType.LEMON, FruitColor.YELLOW, 218, 49.99);

        Fruit banana = new Fruit(FruitType.BANANA, FruitColor.YELLOW, 266, 24.99);

        Fruit greenApple = new Fruit(FruitType.APPLE, FruitColor.GREEN, 126, 15.99);

        Fruit redApple = new Fruit(FruitType.APPLE, FruitColor.RED, 204, 15.99);

        Fruit[] arr = new Fruit[4];
        arr[0] = lemon;
        arr[1] = banana;
        arr[2] = greenApple;
        arr[3] = redApple;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.print(arr[i] + "\n\r");
            }
        }

        System.out.println("//===================================================================");

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                sum += arr[i].getPrice();
            }
        }
        sum = Math.round(sum * 100d) / 100d;

        System.out.println();
        System.out.println("                " + "вес" + "   " + "цена");
        System.out.println("Лимон:          " + arr[0].getWeight() + " " + Math.round(arr[0].getPrice() * 100d) / 100d + " грн");
        System.out.println("Банан:          " + arr[1].getWeight() + " " + Math.round(arr[1].getPrice() * 100d) / 100d + " грн");
        System.out.println("Зеленое яблоко: " + arr[2].getWeight() + " " + Math.round(arr[2].getPrice() * 100d) / 100d + " грн");
        System.out.println("Красное яблоко: " + arr[3].getWeight() + " " + Math.round(arr[3].getPrice() * 100d) / 100d + " грн");
        System.out.println("---------------//---------------");
        System.out.println("Сумма всех покупок: " + sum + "  грн");
    }
}
