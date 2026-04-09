package util;

import java.io.IOException;
import java.util.Scanner;

public class Terminal {
    public static void clear() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void pause() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static String readString(String message) {
        Scanner input = new Scanner(System.in);
        String userInput;

        System.out.print(message);
        userInput = input.next();

        return userInput;
    }

    public static int readInt(String message) {
        Scanner input = new Scanner(System.in);
        int userInput;

        System.out.print(message);
        userInput = input.nextInt();

        return userInput;
    }

    public static int readIntInRange(int from, int to) {
        int choice = readInt("Enter a number [" + from + "-" + to + "]: ");

        while (choice > to || choice < from) 
            choice = readInt("Please enter a number between " + from + " and " + to + ": ");

        return choice;
    }
}
