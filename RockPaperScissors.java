import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] options = {"Rock", "Paper", "Scissors"};
        int userScore = 0, computerScore = 0;

        System.out.println("Welcome to Rock, Paper, Scissors!");
        
        while (true) {
            System.out.print("Enter Rock, Paper, or Scissors (or Exit to quit): ");
            String userInput = scanner.nextLine();
            
            if (userInput.equalsIgnoreCase("Exit")) {
                System.out.println("Thank you for playing!");
                break;
            }
            
            int computerChoice = random.nextInt(3);
            String computerInput = options[computerChoice];
            
            System.out.println("Computer chose: " + computerInput);

            if (userInput.equalsIgnoreCase(computerInput)) {
                System.out.println("It's a tie!");
            } else if (
                (userInput.equalsIgnoreCase("Rock") && computerInput.equals("Scissors")) ||
                (userInput.equalsIgnoreCase("Paper") && computerInput.equals("Rock")) ||
                (userInput.equalsIgnoreCase("Scissors") && computerInput.equals("Paper"))
            ) {
                System.out.println("You win this round!");
                userScore++;
            } else {
                System.out.println("Computer wins this round!");
                computerScore++;
            }

            System.out.println("Score: You " + userScore + " - " + computerScore + " Computer");
        }
        
        scanner.close();
    }
}