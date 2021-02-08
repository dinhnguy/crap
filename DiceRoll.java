
/**
 * The DiceRoll class creates a pair of Die objects and
 * uses them to model rolling a pair of dice.
 * 
 * @author Richard White 
 * @version 2018-09-10
 */

import java.util.Scanner;

public class DiceRoll
{
    Scanner in = new Scanner(System.in);
    private Die d1;
    private Die d2;
    
    /**
     * Creates a pair of dice for rolling.
     */
    public DiceRoll()
    {
        d1 = new Die();
        d2 = new Die();
    }
    
    /**
     * Rolls the dice, prints out the results, and returns the sum of the two dice.
     * @return the total of the two dice rolled (a value 2-12)
     */
    public int rollThem()
    {
        System.out.print("Press <Enter> to roll the dice...");
        in.nextLine();
        int d1Result = d1.roll();
        int d2Result = d2.roll();
        System.out.println("You rolled a " + d1Result + " and " + d2Result);
        return d1Result + d2Result;
    }
    
    
    
}
