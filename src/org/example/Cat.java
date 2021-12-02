package org.example;

public class Cat {
    private String name;
    // Напишите ваш код здесь

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayMeow(){
        System.out.println(name + " says meow.");
    }

    public static void meowTheWorldDown(){
        System.out.println("All the cats in the world say meow at the same time. The world is destroyed.");
    }

    // Напишите ваш код здесь
}
