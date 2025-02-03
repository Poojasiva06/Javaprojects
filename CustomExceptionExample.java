import java.util.*;
class AgeNotEligibleException extends Exception {
    public AgeNotEligibleException(String message) {
        super(message); // Passes message to the Exception class
    }
}

// Main class to test the custom exception
public class CustomExceptionExample {
    // Method to check voting eligibility
    static void checkEligibility(int age) throws AgeNotEligibleException {
        if (age < 18) {
            throw new AgeNotEligibleException("Not eligible to vote. Age must be 18 or above.");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        int userAge = 16;  // Change this to test different ages

        try {
            checkEligibility(userAge);
        } catch (AgeNotEligibleException e) {
            System.out.println("Exception Caught: " + e.getMessage()); // getMessage() works correctly
        } finally {
            System.out.println("Program execution continues...");
        }
    }
}
