import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int playerNumber, computerNumber;
        String again;
        Random rand = new Random();
        Scanner read = new Scanner(System.in);

        do {

            computerNumber = rand.nextInt(99) + 1;

            do {


                System.out.println("Please pick a number from 1 to 100.");
                playerNumber = read.nextInt();
                read.nextLine();

                if (playerNumber < computerNumber) {
                    System.out.println("Higher!");
                } else if (playerNumber > computerNumber) {
                    System.out.println("Lower!");
                } else if (playerNumber == computerNumber) {
                    System.out.println("Correct!");
                }
            } while (computerNumber != playerNumber);

            System.out.println("You won!");

            System.out.println("Would you like to play again? Enter Y or N");

            again = read.nextLine();

        }while(again.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing");
    }
    
}

