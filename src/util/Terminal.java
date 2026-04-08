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

    public static String readString(String message) {
        Scanner input = new Scanner(System.in);
        String userInput;

        System.out.print(message);
        userInput = input.next();

        input.close();

        return userInput;
    }

    public static int readInt(String message) {
        Scanner input = new Scanner(System.in);
        int userInput;

        System.out.print(message);
        userInput = input.nextInt();

        input.close();

        return userInput;
    }

    public static int readIntInRange(int from, int to) {
        int choice = readInt("Enter a number [" + from + "-" + to + "]: ");

        while (choice > to || choice < from) 
            choice = readInt("Please enter a number between " + from + " and " + to + ": ");

        return choice;
    }
}
