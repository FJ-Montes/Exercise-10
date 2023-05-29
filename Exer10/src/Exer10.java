import java.util.Random;
import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 5;
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
            
            if (attempts == maxAttempts) {
                System.out.println("Game over! You've reached the maximum number of attempts.");
                System.out.println("The number to guess was: " + numberToGuess);
            }
        }
        
        scanner.close();

    }

}
