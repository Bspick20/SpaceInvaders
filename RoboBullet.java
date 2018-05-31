import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RoboBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoboBullet extends Actor
{
    /**
     * Act - do whatever the RoboBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        try{
            if(isAtEdge())
            {
                getWorld().removeObject(this);
            }
            setRotation(90);   
            move(10);
           
        
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
        }catch(Exception o){
        }
    }    
}
