import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P2Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P2Bullet extends Bullet
{
    /**
     * Act - do whatever the P2Bullet wants to do. This method is called whenever
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
            Actor Player1;
            Player1 = getOneObjectAtOffset(0,0,Player1.class);
            if(Player1 != null)
            {
                TwoPlayerGame twoGame = (TwoPlayerGame)getWorld();
                twoGame.hitOne();
                
                World world;
                world = getWorld();
                world.removeObject(this);
                
                
            }
        }catch(Exception o){
        }
    }    
}
