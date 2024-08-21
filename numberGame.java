import java.util.Scanner;
import java.util.Random;

public class numberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        boolean playAgain = true;
        
        while (playAgain) {
            int number = rd.nextInt(100);
            int chances = 5;
            int score = 0;
            boolean hasWon = false;

            System.out.println("--------- Welcome to Number Guessing Game ---------\n");
            System.out.println("Guess the number between 1 and 100. You have " + chances + " chances!");

            for (int i = 0; i < chances; i++) {
                System.out.print("Enter your Number:");
                int rand = sc.nextInt();
                
                if (rand == number) {
                    System.out.println("Congratulations! You guessed the number!");
                    score = (chances - i) * 20; 
                    hasWon = true;
                    break;

                } else if (rand < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!hasWon) {
                System.out.println("Sorry, Better luck next time. The correct number was: " + number);
            }
            System.out.println("Your score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            sc.nextLine();
            String response = sc.nextLine();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }
}
