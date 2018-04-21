import greenfoot.Actor;
import greenfoot.Greenfoot;




public class Pika extends Actor
{
  int x = 0;
   

  public Pika() {}
  
  public void act()
  {
    if ((Greenfoot.isKeyDown("Right")) || (Greenfoot.isKeyDown("d")))
    {
      move(3);
    }
    
    if ((Greenfoot.isKeyDown("Left")) || (Greenfoot.isKeyDown("a")))
    {
      move(-3);
    }
    
    if ((Greenfoot.isKeyDown("Up")) || (Greenfoot.isKeyDown("w")))
    {
      setLocation(getX(), getY() - 3);
    }
    
    if ((Greenfoot.isKeyDown("Down")) || (Greenfoot.isKeyDown("s")))
    {
      setLocation(getX(), getY() + 3);
    }
    
    if (isTouching(Maze.class))
    {
      setLocation(87, 85);
    }
    
    if (isTouching(Pokeball.class)) {
      Greenfoot.playSound("Next.mp3");
      Back1.counter.add(1);
      Greenfoot.setWorld(new LevelComplete());
    }
    x += 1;
    if (x == 1)
    {
      newImage();
    }
  }
  


  private void newImage()
  {
    int choice = Greenfoot.getRandomNumber(15);
    
    switch (choice) {
    case 0: 
      setImage("Bulbasaur.png");
      break;
    case 1: 
      setImage("Butterfree.png");
      break;
    case 2: 
      setImage("Chenipan.png");
      break;
    case 3: 
      setImage("Chikorita.png");
      break;
    case 4: 
      setImage("corphish.png");
      break;
    case 5: 
      setImage("Espurr.png");
      break;
    case 6: 
      setImage("Fennekin.png");
      break;
    case 7: 
      setImage("Glaceon.png");
      break;
    case 8: 
      setImage("Palpitoad.png");
      break;
    case 9: 
      setImage("Pansage.png");
      break;
    case 10: 
      setImage("Pichu.png");
      break;
    case 11: 
      setImage("Pika.png");
      break;
    case 12: 
      setImage("togepi.png");
      break;
    case 13: 
      setImage("Ivysaur.png");
      break;
    case 14: 
      setImage("Squirtle.png");
      break;
    case 15: 
      setImage("Wartortle.png");
    }
  }
}