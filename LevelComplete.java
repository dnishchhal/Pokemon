import greenfoot.*;
/**
 * Write a description of class LevelComplete here.
 * 
 * @author Nishchhal Dixit 
 * @version (a version number or a date)
 */
public class LevelComplete extends World
{   
    
    /**
     * Constructor for objects of class LevelComplete.
     * 
     */
    public LevelComplete()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 550, 1); 
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
            {
                Greenfoot.setWorld(new Back1());
            }
    }
}
