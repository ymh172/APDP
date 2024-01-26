package week1;


    import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the ticket number (10 to 12 characters): ");
            String ticketNumber = scanner.nextLine();

            if (isValidTicketNumber(ticketNumber)) {
                System.out.println("Valid ticket number. Thank you!");
                break;
            } else {
                System.out.println("Invalid ticket number. Please check and reenter.");
            }
        }

        scanner.close();
    }

    private static boolean isValidTicketNumber(String ticketNumber) {
        // Check if the ticket number is 10 to 12 characters long
        if (ticketNumber.length() < 10 || ticketNumber.length() > 12) {
            return false;
        }

        // Extract the last digit
        int lastDigit = Character.getNumericValue(ticketNumber.charAt(ticketNumber.length() - 1));

        // Remove the last digit and convert the remaining part to an integer
        int remainingPart = Integer.parseInt(ticketNumber.substring(0, ticketNumber.length() - 1));

        // Check if the remainder of the division is identical to the last dropped digit
        return remainingPart % 7 == lastDigit;
    }
}

 
