package com.homework;

public class Main {

    public static void main(String[] args) {
        Fruit lemon = new Fruit(FruitType.LEMON, FruitColor.YELLOW, 218, 49.99);
        System.out.println(lemon);
        System.out.println();

        Fruit banana = new Fruit(FruitType.BANANA, FruitColor.YELLOW, 266, 24.99);
        System.out.println(banana);
        System.out.println();

        Fruit greenApple = new Fruit(FruitType.APPLE, FruitColor.GREEN, 126, 15.99);
        System.out.println(greenApple);
        System.out.println();

        Fruit redApple = new Fruit(FruitType.APPLE, FruitColor.RED, 204, 15.99);
        System.out.println(greenApple);
        System.out.println();


        Fruit[] arr = new Fruit[4];
        arr[0] = lemon;
        arr[1] = banana;
        arr[2] = greenApple;
        arr[3] = redApple;

        System.out.println("//===========================");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.print(arr[i] + "\n\r");
            }
        }

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                sum += arr[i].getPrice();
            }
        }
        sum = Math.round(sum * 100d) / 100d;
        System.out.println("Сумма всех покупок: " + sum + " ₴");
    }
}
