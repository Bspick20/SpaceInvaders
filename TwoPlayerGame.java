import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TwoPlayerGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TwoPlayerGame extends World
{
    private Player1 pOne = new Player1();
    private Player2 pTwo = new Player2();
    /**
     * Constructor for objects of class TwoPlayerGame.
     * 
     */
    public TwoPlayerGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 880, 1);
        addObject(pOne,450,200);
        addObject(pTwo,450,700);
    }
    
    public void act()
    {
        if(pOne.getHealth() <= 0 && pTwo != null)
        {
            removeObject(pOne);
            showText("Player Two Won!!!!",450,440);
        }
        if(pTwo.getHealth() <= 0 && pOne != null)
        {
            removeObject(pTwo);
            showText("Player One Won!!!!",450,440);
        }
      
        
    }
    
    public void shoot(int x, int y)
    {
       String key = Greenfoot.getKey();
       
       if(key != null && key.equals("w"))
       {
           addObject(new P1Bullet(),pOne.getX(),pOne.getY());
       }
       if(key != null && key.equals("up"))
       {
           addObject(new P2Bullet(),pTwo.getX(),pTwo.getY());
        }
    }
    
    public void hitOne()
    {
        pOne.hit();
    }
    
    public void hitTwo()
    {
        pTwo.hit();
    }
}
