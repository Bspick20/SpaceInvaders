import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spaceship extends Actor
{
    public int health;
    
    public Spaceship()
    {
        health = 5;
        
    }
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        
        
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(x-16,y);
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(x+16,y);
        }
        MyWorld myWorld = (MyWorld)getWorld();
        myWorld.shoot(this.getX(), this.getY()-50);
    }    
    
    public void hitOne()
    {
        health = health - 1;
    }
    
    public int getHealth()
    {
        return health;
    }
}


