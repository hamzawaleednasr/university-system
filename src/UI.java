import java.util.Scanner;
import java.io.IOException;

public class UI {
    public static void clear() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void printMainMenu() {
        clear();
        System.out.println("=============================================");
        System.out.println("====    Welcome to University System!    ====");
        System.out.println("=============================================");
        System.out.println("\t[1] University Menu");
        System.out.println("\t[2] Faculty Menu");
        System.out.println("\t[3] Prof Menu");
        System.out.println("\t[4] Student Menu");
        System.out.println("\t[5] Subject Menu");
        System.out.println("=============================================");
        System.out.println("\t[0] Exit");
        System.out.println("=============================================");
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

    // public static void performUserInput() {
    // int choice = readInt("Enter a number [1-5]: ");

    // switch (choice) {
    // case 1:
    // printUniversityMenu();
    // break;
    // case 2:
    // printFacultyMenu();
    // break;
    // case 3:
    // printProfMenu();
    // break;
    // case 4:
    // printStudentMenu();
    // break;
    // case 5:
    // printSubjectMenu();
    // break;
    // default:
    // break;
    // }
    // }
}
