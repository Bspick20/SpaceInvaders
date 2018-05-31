import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    public int destroyed;
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
        setRotation(270);   
        move(15);
           
        try{
            Actor Robot;
            Robot = getOneObjectAtOffset(0,0,Robot.class);
            if(Robot != null)
            {
                World world;
                world = getWorld();
                Greenfoot.playSound("explodingShip.mp3");
                world.addObject(new Explosion(), Robot.getX(),Robot.getY());
                world.removeObject(Robot);
                world.removeObject(this);
                
                
            }
            
            Actor Boss;
            Boss = getOneObjectAtOffset(0,0,Boss.class);
            if(Boss != null)
            {
                MyWorld myWorld = (MyWorld)getWorld();
                myWorld.hitBoss();
                Greenfoot.playSound("explodingShip.mp3");
                World world;
                world = getWorld();
                world.removeObject(this);
                
            }
        }catch(Exception o){
        }
    }    
}
