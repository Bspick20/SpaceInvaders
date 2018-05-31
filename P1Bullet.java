import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P1Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P1Bullet extends Bullet
{
    /**
     * Act - do whatever the P1Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
        setRotation(90);
        move(15);
           
        try{
            Actor Player2;
            Player2 = getOneObjectAtOffset(0,0,Player2.class);
            if(Player2 != null)
            {
                TwoPlayerGame twoGame = (TwoPlayerGame)getWorld();
                twoGame.hitTwo();
                
                World world;
                world = getWorld();
                world.removeObject(this);
                
                
            }
        }catch(Exception o){
        }
    }    
}
