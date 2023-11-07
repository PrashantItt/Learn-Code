
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the entity type (email, server, something):");
        String entityType = input.next();

        switch (entityType) {
            case "email":
                processEmail(input);
                break;

            case "server":
                System.out.println("Server entity is not implemented yet.");
                break;

            case "something":
                System.out.println("Something entity is not implemented yet.");
                break;

            default:
                System.out.println("Unsupported entity type: " + entityType);
                break;
        }
    }

    private static void processEmail(Scanner input) {
        System.out.println("Please Enter the Email:");
        String email = input.next();
        System.out.println("Enter the number of emails:");
        int numberOfEmails = input.nextInt();
        System.out.println("Enter the number of sent emails:");
        int numberOfSentEmails = input.nextInt();
        System.out.println("Enter the number of spam emails:");
        int numberOfSpamEmails = input.nextInt();

        Email emailEntity = new Email(email, numberOfEmails, numberOfSpamEmails, numberOfSentEmails);
        emailEntity.calculateTotalCarbonFootprints();
        emailEntity.displayTotalCarbonFootprints();
    }
}

