package game;

import players.Player;
import players.Scout;
import players.Warrior;
import players.Wizard;
import races.*;
import util.Input;

import java.util.Scanner;

public abstract class Program {

    public static Player player;

    public static void runGame() {
        String[] answers;

        System.out.println("Welcome to the Arena!");
        String name = Input.getString("Enter your name: ");
        answers = new String[]{
                "Warrior - +3 strength points, utilizes strength",
                "Scout - +3 agility points, utilizes agility",
                "Wizard - +3 intelligence, utilizes intelligence"
        };
        int playerClass = Input.question("Choose your player class", answers);
        answers = new String[]{
                "Man - +3% strength, +3% intelligence, +4% agility",
                "Elf - +6% intelligence, +4% agility",
                "Dwarf - +7% strength, +3% endurance",
                "Troll - +10% strength",
                "Dark elf - +4% intelligence, +6% agility",
                "Undead - +10% intelligence"
        };
        IRace race = getRace(Input.question("Choose your race", answers));
        player = getPlayer(name, playerClass, race);
    }

    private static Player getPlayer(String name, int playerClass, IRace race) {
        switch (playerClass) {
            case 1 -> {
                return new Warrior(name, race);
            }
            case 2 -> {
                return new Scout(name, race);
            }
            case 3 -> {
                return new Wizard(name, race);
            }
        }
        throw new IllegalArgumentException("Invalid player class!");
    }

    private static void startGame() {

    }

    private static Player generateEnemy(Player player) {

    }

    private static IRace getRace(int race) {
        switch (race) {
            case 1 -> {
                return new Man();
            }
            case 2 -> {
                return new Elf();
            }
            case 3 -> {
                return new Dwarf();
            }
            case 4 -> {
                return new Troll();
            }
            case 5 -> {
                return new DarkElf();
            }
            case 6 -> {
                return new Undead();
            }
        }
        throw new IllegalArgumentException("Invalid race!");
    }
}
