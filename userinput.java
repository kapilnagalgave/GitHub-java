import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for user input

        // Input for integer
        System.out.print("Enter an integer: ");
        int num1 = scanner.nextInt();
        System.out.println("The entered integer is: " + num1);

        // Input for byte (assuming a value within the byte range)
        System.out.print("Enter a byte value (between -128 and 127): ");
        byte aByte = scanner.nextByte();
        System.out.println("The entered byte value is: " + aByte);

        // Input for long
        System.out.print("Enter a long number: ");
        long aLong = scanner.nextLong();
        System.out.println("The entered long number is: " + aLong);

        // Input for float
        System.out.print("Enter a decimal number: ");
        float aFloat = scanner.nextFloat();
        System.out.println("The entered decimal number is: " + aFloat);

        // Input for boolean (converted from String input)
        System.out.print("Enter true or false: ");
        String boolString = scanner.nextLine();  // Consume the newline character from previous input
        boolean aBoolean = Boolean.parseBoolean(boolString);  // Convert String to boolean
        System.out.println("The entered boolean value is: " + aBoolean);

        // Input for short (assuming a value within the short range)
        System.out.print("Enter a short value (between -32768 and 32767): ");
        short aShort = scanner.nextShort();
        System.out.println("The entered short value is: " + aShort);

        // Input for char (read as a single character String)
        System.out.print("Enter a single character: ");
        String charString = scanner.nextLine();  // Consume the newline character (reads only the first character)
        char aChar = charString.charAt(0);  // Extract the first character
        System.out.println("The entered character is: " + aChar);

        scanner.close();  // Close the Scanner resource (optional, but good practice)
    }
}
