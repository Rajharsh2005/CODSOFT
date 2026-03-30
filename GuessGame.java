import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int totalScore = 0;
        int round = 1;
        String playAgain;
        System.out.println("--- Number Guessing Game ---");
        do {
            System.out.println("\nRound " + round);
            int number = rnd.nextInt(100) + 1;
            int attemptsLeft = 7;
            boolean guessedCorrectly = false;
            System.out.println("Guess a number between 1 and 100");
            System.out.println("Attempts allowed: " + attemptsLeft);

            while (attemptsLeft > 0) {
                System.out.print("Enter guess: ");
                int guess = input.nextInt();

                if (guess == number) {
                    System.out.println("Correct guess!");
                    totalScore += attemptsLeft;
                    guessedCorrectly = true;
                    break;
                } 
                else if (guess > number) {
                    System.out.println("Too high!");
                } 
                else {
                    System.out.println("Too low!");
                }

                attemptsLeft--;
                System.out.println("Attempts left: " + attemptsLeft);
            }

            if (!guessedCorrectly) {
                System.out.println("You lost! Number was: " + number);
            }

            System.out.println("Score: " + totalScore);

            System.out.print("Play again? (yes/no): ");
            playAgain = input.next();

            round++;

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("\nGame Over");
        System.out.println("Final Score: " + totalScore);

        input.close();
    }
}