import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final int MAX_ATTEMPTS = 5;

    private static int targetNum;
    private static int attempts;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("===== Guess the Number =====");
        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            System.out.println();
            System.out.println("New Game!");

            targetNum = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
            attempts = 0;

            while (true) {
                System.out.print("Enter your guess (between 1 and 100): ");
                int guess = scanner.nextInt();

                attempts++;

                if (guess == targetNum) {
                    System.out.println("Congratulations! You guessed the correct number!");
                    break;
                } else if (guess < targetNum) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                if (attempts >= MAX_ATTEMPTS) {
                    System.out.println("Sorry, you have reached the maximum number of attempts.");
                    break;
                }
            }

            System.out.print("Do you want to play again? (Y/N): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("Y")) {
                System.out.println("Thank you for playing the Number Guessing Game! Goodbye!");
                break;
            }
        }
    }
}