package project1;

import java.util.Scanner;

public class DataValidatorApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Input Type:");
        System.out.println("1. Text Input");
        System.out.println("2. Image Input");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline
        ValidationResult result = null;
        switch (choice) {
            case 1:
                System.out.print("Enter text: ");
                System.out.println("may be the email/phone number of india");
                System.out.println("any scentence you want gto store in system1");
                String text = sc.nextLine();
                result = TextValidator.validate(text);
                break;
            case 2:
                System.out.print("Enter image path: ");
                String imagePath = sc.nextLine();
                result = ImageValidator.validateImage(imagePath);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }
        System.out.println("\n--- Validation Result ---");
        System.out.println("Valid: " + result.isValid());
        System.out.println("Message: " + result.getMessage());
        sc.close();
    }
}
