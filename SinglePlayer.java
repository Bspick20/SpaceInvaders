import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SinglePlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SinglePlayer extends Button
{
    /**
     * Act - do whatever the SinglePlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            DifficultyMenu myWorld = new DifficultyMenu();
            Greenfoot.setWorld(myWorld);
        }
    }    
}
