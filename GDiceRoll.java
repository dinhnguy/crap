
/**
 * Write a description of class DiceRoll here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class GDiceRoll
{
    Scanner in = new Scanner(System.in);
    private GDie d1;
    private GDie d2;
    
    public GDiceRoll()
    {
        d1 = new GDie();
        d2 = new GDie();
    }
    
    public int rollThem()
    {
        System.out.print("Press <Enter> to roll the dice...");
        in.nextLine();
        int r1 = d1.roll();
        int r2 = d2.roll();
        // System.out.println(d1.toString());
        System.out.println(d1);
        System.out.println(d2.toString());
        return r1 + r2;
    }
    
    
    
}
