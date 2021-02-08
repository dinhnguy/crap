
/**
 * The Die class creates a six-sided die and allows for rolling.
 * 
 * @author Richard White 
 * @version 2013-11-25
 */

import java.util.Random;

public class GDie
{
    private int die;
    Random generator;

    /**
     * Constructor for objects of class Die
     */
    public GDie()
    {
        generator = new Random();
        die = 0;
    }

    /**
     * roll method rolls the dice and returns the result
     * 
     * @return     the roll, a value from 1-6 inclusive
     */
    public int roll()
    {
        die = generator.nextInt(6) + 1;
        return die;
    }

    /**
     * toString returns a graphical representation of a Die roll
     */
    public String toString()
    {
        if (die != 0)
        {
            String result = "+-------+";
            //First line of die
            if (die == 2 || die == 3)
                result += "\n|     o |";
            else if (die > 3)
                result += "\n| o   o |";
            else result += "\n|       |";
            //Second line of die
            if (die == 1 || die == 3 || die == 5)
                result += "\n|   o   |";
            else if (die == 6)
                result +=  "\n| o   o |";
            else result += "\n|       |";
            //Third line
            if (die == 2 || die == 3)
                result += "\n| o     |";
            else if (die > 3)
                result += "\n| o   o |";
            else result += "\n|       |"; 
            result += "\n+-------+";
            return result;
        }
        else return null;
    }
}
