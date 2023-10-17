
import java.util.Scanner;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;

public class SwitchExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;

        boolean inputBalance = false;
        double remainingBalance = 0.0;

    do {
        System.out.println("----- MENU SELECTION EXAMPLE -----");
        System.out.println("1. Set Balance");
        System.out.println("2. Use Balance");
        System.out.println("0. Exit");

        System.out.print("Choose an option: ");
        menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Setting Balance...");
                System.out.print("Do you want to enter the balance? (true/false): ");
                inputBalance = input.nextBoolean();
                if (inputBalance) {
                    System.out.print("Enter the balance amount: ");
                    remainingBalance = input.nextDouble();
                }
                System.out.println("Balance has been set.");
                break;

            case 2:
                System.out.println("Using Balance...");
                if (inputBalance) {
                    System.out.println("Your remaining balance: " + remainingBalance);
                } else {
                    System.out.println("No balance has been set.");
                }
                break;

            case 3:
                System.out.println("Exiting the program. Goodbye!");
                break;

            default:
                System.out.println("Invalid menu option.");
        }
    } while (menu != 3);

    }
}