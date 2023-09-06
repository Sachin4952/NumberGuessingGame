import java.util.Random;
import java.util.Scanner;

public class Numberguessinggame {

    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;
        int score = 0;
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        System.out.println("Welcome to Guess the Number game!");
        System.out.println("Try to guess the number between " + lowerBound + " and " + upperBound);
        
        for (int attempts = 1; attempts <= maxAttempts; attempts++) {
            System.out.print("Attempt " + attempts + "/" + maxAttempts + ": Enter your guess: ");
            int guess = scanner.nextInt();
            
            if (guess < lowerBound || guess > upperBound) {
                System.out.println("Please enter a valid number between " + lowerBound + " and " + upperBound);
                continue;
            }
            
            if (guess == targetNumber) {
                score += maxAttempts - attempts + 1;
                System.out.println("Congratulations! You guessed the number " + targetNumber
                        + " in " + attempts + " attempts.\nYour current score: " + score);
                break;
            } else if (guess < targetNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }
        
        System.out.println("Game over. Your final score: " + score);
        scanner.close();
    }
}
