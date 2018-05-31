import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    private int cntr;
    private int hitCntr;
    private int move;
    public Robot()
    {
        move = 5;
    }
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        int rand = (int)((Math.random()*500)+50);
        cntr+=1;
        if(cntr == rand)
        {
            shootIt();
            cntr = 0;
        }
        
        pathOne();
        Actor Spaceship;
        Spaceship = getOneObjectAtOffset(0,0,Spaceship.class);
        if(Spaceship != null)
            {
                  MyWorld myWorld = (MyWorld)getWorld();
                  myWorld.hitShip();
                  World world;
                  world = getWorld();
                  world.removeObject(this);
            }
        
    }    
    
    private void shootIt()
    {
        MyWorld myWorld = (MyWorld)getWorld();
        myWorld.robotShoot(this.getX(), this.getY());
        Greenfoot.playSound("alienLaser.wav");
    }
    
    
    private void pathOne()
    {
        int x = getX();
        int y = getY();
        boolean thing = true;
        
        if(thing == true)
        {
            move(move);
            if((isAtEdge()) && (getX()==899))
            {
                setLocation(getX(),getY()+50);
                move = -5;
            }
            else
            {
                if((isAtEdge()) && (getX()==0))
                {
                    setLocation(getX(),getY()+50);
                    move = 5;
                    //turn(45);
                }
            }
        }

    }
    
}
