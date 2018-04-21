import greenfoot.*;

/**
 * Write a description of class Back1 here.
 * 
 * @author Nishchhal Dixit
 * @version (a version number or a date)
 */
public class Back1 extends World
{

    /**
     * Constructor for objects of class Back1.
     * 
     */
    
    static Counter counter = new Counter("");
    
    //Play Music In Background
    /*public static GreenfootSound music = new GreenfootSound("Mere.mp3"); 
    static {
            music.playLoop();
        }*/
        
    public Back1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 550, 1);
           
         prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        //Pikachu
        Pika pika = new Pika();
        addObject(pika, 93, 93);
        pika.setLocation(87, 85);
        addPlayer();

        //Pokeball

        Pokeball pokeball = new Pokeball();
        addObject(pokeball, 806, 486);

        //Maze Creater

        Maze0 maze0 = new Maze0();
        addObject(maze0, 39, 280);

        Maze0 maze02 = new Maze0();
        addObject(maze02, 856, 286);

        Maze1 maze1 = new Maze1();
        addObject(maze1, 72, 514);

        Maze1 maze12 = new Maze1();
        addObject(maze12, 72, 44);

        Maze2 maze2 = new Maze2();
        addObject(maze2, 133, 214);

        Maze3 maze39 = new Maze3();
        addObject(maze39, 133, 411);

        Maze4 maze45 = new Maze4();
        addObject(maze45, 122, 44);

        Maze5 maze5 = new Maze5();
        addObject(maze5, 182, 224);

        Maze6 maze6 = new Maze6();
        addObject(maze6, 447, 58);

        Maze3 maze33 = new Maze3();
        addObject(maze33, 717, 80);

        Maze4 maze44 = new Maze4();
        addObject(maze44, 737, 191);

        Maze2 maze22 = new Maze2();
        addObject(maze22, 755,360);

        Maze3 maze34 = new Maze3();
        addObject(maze34, 756, 83);

        Maze1 maze13 = new Maze1();
        addObject(maze13, 789, 57);

        Maze1 maze14 = new Maze1();
        addObject(maze14, 789, 529);

        Maze4 maze46 = new Maze4();
        addObject(maze46, 122, 514);

        Maze1 maze15 = new Maze1();
        addObject(maze15, 172, 514);

        Maze1 maze16 = new Maze1();
        addObject(maze16, 229, 514);

        Maze4 maze47 = new Maze4();
        addObject(maze47, 838, 57);

        Maze4 maze48 = new Maze4();
        addObject(maze48, 171, 432);

        Maze4 maze49 = new Maze4();
        addObject(maze49, 745, 105);

        Maze3 maze36 = new Maze3();
        addObject(maze36, 261, 490);

        Maze3 maze37 = new Maze3();
        addObject(maze37, 261, 440);

        Maze3 maze310 = new Maze3();
        addObject(maze310, 182, 410);

        Maze1 maze19 = new Maze1();
        addObject(maze19, 294, 412);

        Maze1 maze110 = new Maze1();
        addObject(maze110, 366, 412);

        Maze1 maze111 = new Maze1();
        addObject(maze111, 436, 412);

        Maze1 maze112 = new Maze1();
        addObject(maze112, 648, 412);

        Maze1 maze113 = new Maze1();
        addObject(maze113, 578, 412);

        Maze1 maze115 = new Maze1();
        addObject(maze115, 507, 412);

        Maze4 maze410 = new Maze4();
        addObject(maze410, 146, 432);

        Maze3 maze311 = new Maze3();
        addObject(maze311, 720, 312);

        Maze3 maze312 = new Maze3();
        addObject(maze312, 720, 263);

        Maze3 maze313 = new Maze3();
        addObject(maze313, 720, 213);

        Maze3 maze314 = new Maze3();
        addObject(maze314, 720, 342);

        Maze4 maze411 = new Maze4();
        addObject(maze411, 697, 412);

        Maze4 maze412 = new Maze4();
        addObject(maze412, 839, 529);

        Maze3 maze315 = new Maze3();
        addObject(maze315, 856, 508);

        Maze3 maze316 = new Maze3();
        addObject(maze316, 720, 391);

        Maze4 maze42 = new  Maze4();
        addObject(maze42, 728,105); 

        Maze4 maze418 = new Maze4();
        addObject(maze418,707,412);
        
        addObject(counter,811,25);
    }
    
    private void addPlayer()
    {  
        for(int i=0;i<=2+Greenfoot.getRandomNumber(4);i++)
        {
            Enemy e = new Enemy();
            addObject(e,250 + (i*100),100 +(i*70));
            if(e.getX() > 650 )
                removeObject(e);
        }
    }
}
