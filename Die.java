
/**
 * The Die class creates a six-sided die and allows for rolling.
 * 
 * @author Richard White 
 * @version 2013-11-25
 */

import java.util.Random;

public class Die
{
    private int die;
    Random generator;

    /**
     * Constructor for objects of class Die
     */
    public Die()
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
}
