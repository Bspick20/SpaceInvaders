import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TheActualMainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class TheActualMainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 880, 1); 
        addObject(new SinglePlayer(),450,400);
        addObject(new TwoPlayers(),450,500);
        showText("Invaders of Space" ,450,200);
    }
}
