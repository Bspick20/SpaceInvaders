import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DifficultyMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public DifficultyMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 880, 1); 
        addObject(new Easy(),450,440);
        showText("Easy",360,440);
        addObject(new Medium(),450,520);
        showText("Medium",360,520);
        addObject(new Hard(),450, 600);
        showText("Hard",360,600);
    }
}
