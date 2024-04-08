package game;

import util.Input;

public abstract class Program {
    public static void runGame() {
        int answer;
        String[] answers;

        System.out.println("Welcome to the Arena!");
        answers = new String[]{"Warrior", "Scout", "Wizard"};
        answer = Input.question("Choose your player class", answers);
    }
}
