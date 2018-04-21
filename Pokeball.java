import greenfoot.*;
/**
 * Write a description of class Pokeball here.
 * 
 * @author Nishchhal Dixit 
 * @version (a version number or a date)
 */
public class Pokeball extends Actor
{  
    /**
     * Act - do whatever the Pokeball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Pika.class))
        {
            Greenfoot.setWorld(new LevelComplete());
        }        
    }    
}
