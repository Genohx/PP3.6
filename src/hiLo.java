import java.util.Scanner;
import java.util.Random;
public class hiLo
{
    //-----------------------------------------------------------------
    //  Plays a simple guessing game with the user.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {
        final int MAX = 100;
        int answer, guess;
        Scanner scan = new Scanner (System.in);
        Random generator = new Random();
        answer = generator.nextInt(MAX) + 1;
        String again;
        System.out.println("(Correct answer is: " + answer + ")");
        System.out.print ("I'm thinking of a number between 1 and "
                + MAX + ". Guess what it is(-1 to quit): ");
        guess = scan.nextInt();
        while (guess != -1)
        {
            if(guess > answer)
            {
                System.out.println("That guess is too high.");
                System.out.print("\nGuess again: ");
                guess = scan.nextInt();
            }//end greater than if
            else if (guess < answer)
            {
                System.out.println("That guess is too low.");
                System.out.print("\nGuess again: ");
                guess = scan.nextInt();
            }//end less than if
            else
            {
                System.out.println("Congratulations! You guessed the number!");
            }
            System.out.print("Would you like to play again?(yes or no?)");
            again = scan.nextLine();
            if(again.equals("yes"))
            {
                System.out.print("Playing again,");
            }
            else if(again.equals("no"))
            {
                return;
            }
        }//end validation loop

    }//end main method
}//end class hiLo

