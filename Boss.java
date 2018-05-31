import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    private int cntr;
    private int health;
    private int move;
    public Boss()
    {
        move = 5;
        health = 25;
    }
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        
        cntr+=1;
        if(cntr % 18 == 0)
        {
            
            shootIt();

            cntr = 0;
        }
        
        pathOne();
        
        Actor Spaceship;
        Spaceship = getOneObjectAtOffset(0,0,Spaceship.class);
        if(Spaceship != null)
            {
                  World world;
                  world = getWorld();
                  world.removeObject(Spaceship);
            }
        
        if(health <= 0)
        {
            World world;
            world = getWorld();
            
            world.removeObject(this);
        }
    }    
    
    private void shootIt()
    {
        MyWorld myWorld = (MyWorld)getWorld();
        myWorld.robotShoot(this.getX()-50, this.getY());
        myWorld.robotShoot(this.getX(), this.getY());
        myWorld.robotShoot(this.getX()+50, this.getY());
    }
    
        public void hitOne()
    {
        health = health - 1;
    }
    
    public int getHealth()
    {
        return health;
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
