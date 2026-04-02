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
        System.out.println("\t[1] Faculty Menu");
        System.out.println("\t[2] Prof Menu");
        System.out.println("\t[3] Student Menu");
        System.out.println("\t[4] Subject Menu");
        System.out.println("=============================================");
        System.out.println("\t[0] Exit");
        System.out.println("=============================================");
    }

    public static void printFacultyMenu() {
        clear();
        System.out.println("==============================================");
        System.out.println("====             Faculty Menu             ====");
        System.out.println("==============================================");
        System.out.println("\t[1] Show Faculties");
        System.out.println("\t[2] Add Faculty");
        System.out.println("\t[3] Update Faculty");
        System.out.println("\t[4] Delete Faculty");
        System.out.println("\t[5] Register a Student");
        System.out.println("==============================================");
        System.out.println("\t[0] Return to main menu");
        System.out.println("==============================================");
    }

    public static void printProfMenu() {
        clear();
        System.out.println("==============================================");
        System.out.println("======             Prof Menu            ======");
        System.out.println("==============================================");
        System.out.println("\t[1] Show Proffesors");
        System.out.println("\t[2] Add Proffesor");
        System.out.println("\t[3] Update Proffesor");
        System.out.println("\t[4] Delete Proffesor");
        System.out.println("\t[5] Register in a Subject");
        System.out.println("==============================================");
        System.out.println("\t[0] Return to main menu");
        System.out.println("==============================================");
    }

    public static void printStudentMenu() {
        clear();
        System.out.println("==============================================");
        System.out.println("====             Student Menu             ====");
        System.out.println("==============================================");
        System.out.println("\t[1] Show Students");
        System.out.println("\t[2] Add Student");
        System.out.println("\t[3] Update Student");
        System.out.println("\t[4] Delete Student");
        System.out.println("\t[5] Register a Subject");
        System.out.println("==============================================");
        System.out.println("\t[0] Return to main menu");
        System.out.println("==============================================");
    }

    public static void printSubjectMenu() {
        clear();
        System.out.println("==============================================");
        System.out.println("====             Subject Menu             ====");
        System.out.println("==============================================");
        System.out.println("\t[1] Show Subjects");
        System.out.println("\t[2] Add Subject");
        System.out.println("\t[3] Update Subject");
        System.out.println("\t[4] Delete Subject");
        System.out.println("\t[5] Register a Subject");
        System.out.println("==============================================");
        System.out.println("\t[0] Return to main menu");
        System.out.println("==============================================");
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

    public static int readUserInput(String message) {
        int choice = readInt("Enter a number [1-5]: ");

        // here exit user, but make it later . . .
        if (choice == 0) {}

        while (choice > 5 || choice < 1) 
            choice = readInt("Please enter a number between 1 and 5: ");

        return choice;
    }

    public static void performUserInput(int choice) {
        switch (choice) {
            case 1:
                printFacultyMenu();
                break;
            case 2:
                printProfMenu();
                break;
            case 3:
                printStudentMenu();
                break;
            case 4:
                printSubjectMenu();
                break;
            default:
                break;
        }
    }
}
