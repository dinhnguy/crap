
/**
 * Play the game of Craps!
 * 
 * @author Richard White 
 * @version 2013-11-25
 */

import java.util.Scanner;

public class Craps
{
    public static void main(String[] args)
    {
        int gamesWon = 0;
        int gamesPlayed = 0;
        int point = 0;
        Scanner in = new Scanner(System.in);
        DiceRoll myRoll = new DiceRoll();
        
        System.out.println("LET'S PLAY CRAPS!");
        System.out.print("Do you need instructions (Y/n)? ");
        String needInstructions = in.nextLine();
        if (needInstructions.equals("") || 
            needInstructions.substring(0,1).equalsIgnoreCase("y"))
        {
            System.out.println("1. Roll two six-sided dice.");
            System.out.println("2. a. On first roll, if you get a 7 or 11 you win!");
            System.out.println("2. b. On first roll, if you get a 2, 3, or 12 you lose!");
            System.out.println("2. c. Any other number you don't win or lose. The die roll becomes your 'point.'");
            System.out.println("3. Keep rolling the dice again until:");
            System.out.println("4. a. You roll the point again and win!");
            System.out.println("4. b. or you roll a 7 and lose.");
            System.out.println();
            System.out.println("Good luck!");
            System.out.println();
        }
        
        boolean theyWantToPlay = true;
        while (theyWantToPlay)
        {
            // roll the dice
            int firstRoll = myRoll.rollThem();
            System.out.println("Your first roll is: " + firstRoll);
           
            if (firstRoll == 7 || firstRoll == 11)
                System.out.println("You won!");
            else if (firstRoll == 2 || firstRoll == 3 || firstRoll == 12)
                System.out.println("You lose!");
            else
            {   // try to roll point
                System.out.println("That's your point.");
                System.out.println("Let's see if you can roll it again before you roll a 7!");
                boolean stillRolling = true;
                while (stillRolling)
                {
                    int dieTotal = myRoll.rollThem();
                    System.out.println("You rolled: " + dieTotal);
                    if (dieTotal == firstRoll)
                    {
                        System.out.println("You rolled your point! You won!");
                        stillRolling = false;
                    }
                    else if (dieTotal == 7)
                    {
                        System.out.println("You rolled a 7! You lose!");
                        stillRolling = false;
                    }
                    else System.out.println("Keep rolling...");
                }
            }
            
            // ask if they want to play again
            System.out.print("Play again (Y/n)? ");
            String playAgain = in.nextLine();
            if ((!playAgain.equals("") && !playAgain.equalsIgnoreCase("y")))
                theyWantToPlay = false;
        }
        
        System.out.println("Thanks for playing Craps!");
    }

    
}
