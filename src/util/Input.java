package util;

import java.util.Scanner;

public abstract class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        int answer;
        while (true) {
            try {
                answer = scanner.nextInt();
                break;
            } catch (NumberFormatException e) {
                scanner.nextLine();
            }
        }
        return answer;
    }

    public static int getInt(int min, int max) {
        while (true) {
            int answer = getInt();
            if (!(answer < min || answer > max)) {
                return answer;
            }
        }
    }

    public static int question(String question, String[] answers) {
        System.out.println(question);
        int optionCount = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == null) {
                continue;
            } else {
                optionCount++;
            }
            System.out.println("\t" + optionCount + ") " + answers[i]);
        }
        return getInt(1, optionCount);
    }

    public static String getString() {
        return scanner.next();
    }

    public static String getString(String question) {
        System.out.println(question);
        return getString();
    }
}
