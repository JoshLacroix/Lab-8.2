import java.util.Random;

public class Die {
    /**
     * Create a variable for the die
     */
    private int dieSide;

    /**
     * Used to roll the die and get a side randomly (6 sides)
     */
    public void roll(){
        dieSide = (int) Math.round(Math.random() * 6) + 1 ;
    }

    /**
     * used to retrieve the side given and used for reading
     * @return
     */
    public double getDieSide(){
        return dieSide;
    }
}