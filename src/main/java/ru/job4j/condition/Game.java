package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if ("super mario".equals(name)) {
            System.out.println("Start - super mario");
        }
        if ("tanks".equals(name)) {
            System.out.println("Старт - танки");
        }
        if ("tetris".equals(name)) {
            System.out.println("Старт - тетрис");
        }
    }

    public static void main(String[] args) {
        Game.menu("tanks");
    }
}