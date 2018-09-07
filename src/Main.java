import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int choice;
        String name = "";
        String company = "";
        String phone = "";


        do {
            System.out.println("Is this a business or personal account?");
            System.out.println("---------------------------------------");
            System.out.println("1: Business");
            System.out.println("2: Personal");
            choice = userInput.nextInt();
        }

        while (choice != 1 && choice != 2);
        {
            if (choice == 1) {
                contact(company ,name ,phone);
            }
            if (choice == 2) {
                contact(name ,phone);
            }
        }
    }
        private static void contact(String business, String contact , String digits){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Company Name: ");
            business = userInput.next();

            System.out.println("Contact Name: ");
            contact = userInput.next();

            System.out.println("Phone: ");
            digits = userInput.next();

            System.out.println("Company: " + business);
            System.out.println("Name: " + contact);
            System.out.println("Phone: " + digits);
        }

    private static void contact(String contact , String digits){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Contact Name: ");
        contact = userInput.next();

        System.out.println("Phone: ");
        digits = userInput.next();

        System.out.println("Name: " + contact);
        System.out.println("Phone: " + digits);
    }

        }
