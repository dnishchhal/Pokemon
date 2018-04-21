import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import java.awt.Color;
import java.util.List;



public class Enemy extends Actor
{
  int speed = 2 + Greenfoot.getRandomNumber(6);
  int ch = Greenfoot.getRandomNumber(2);
  

  public Enemy() {}
  
  public void act()
  {
     
    
      
    switch (ch) {
    case 0: 
      if ((getX() >= 216) && (getX() <= 686))
      {
        speed = speed;
      }
      else
      {
        speed = (-speed);
      }
      move(speed);
      
      break;
    case 1: 
      if ((getY() >= 89) && (getY() <= 377))
      {
        speed = speed;
      }
      else
      {
        speed = (-speed);
      }
      setLocation(getX(), getY() + speed);
    }
    
    

    if (getOneTouchedObject(Pika.class) != null)
    {
      Back1.counter.setValue(1);
      Greenfoot.setWorld(new GameOver());
      Greenfoot.stop();
    }
  }
  


  public Actor getOneTouchedObject(Class clss)
  {
    List<Actor> list = getIntersectingObjects(clss);
    List<Actor> list2 = getIntersectingObjects(clss);
    list2.clear();
    GreenfootImage i = new GreenfootImage(getImage());
    i.rotate(getRotation());
    int w = i.getWidth();int h = i.getHeight();int x = getX();int y = getY();
    for (Actor A : list)
    {
      GreenfootImage Ai = new GreenfootImage(A.getImage());GreenfootImage i2 = new GreenfootImage(w, h);
      Ai.rotate(A.getRotation());
      int Aw = Ai.getWidth();int Ah = Ai.getHeight();int Ax = A.getX();int Ay = A.getY();
      i2.drawImage(Ai, Ax - x - (Aw / 2 - w / 2), Ay - y - (Ah / 2 - h / 2));
      for (int yi = 0; yi < h; yi++)
        for (int xi = 0; xi < w; xi++)
          if ((i2.getColorAt(xi, yi).getAlpha() > 0) && (i.getColorAt(xi, yi).getAlpha() > 0))
            return A;
    }
    return null;
  }
}