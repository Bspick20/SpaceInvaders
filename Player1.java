import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Actor
{
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 public int health;
    
    public Player1()
    {
        health = 5;
    }
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setRotation(270);
        int x = getX();
        int y = getY();
        
        
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(x-16,y);
        }
        
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(x+16,y);
        }
        TwoPlayerGame twoGame = (TwoPlayerGame)getWorld();
        twoGame.shoot(this.getX(), this.getY()-50);
    }    
    
    public void hit()
    {
        health = health - 1;
    }
    
    public int getHealth()
    {
        return health;
    }  
}
