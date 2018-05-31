import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public ArrayList <Robot> robotList;
    private int cntr;
    private Spaceship ship = new Spaceship();
    private Boss boss = new Boss();
    private int cont;
    private int level;
    private int difficult;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld(int difficulty)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 880, 1);

        addObject( ship, 450, 800);
        difficult = difficulty;
        cont = 2;
        level = 0;
        Greenfoot.playSound("Music.wav");
    }
    
    private void createRobots()
    {
        
        if(numberOfObjects() <= 1)
        {
            
           if(level == 10 )
           {
               addObject(boss,200,200);
               level++;
           }
           else
           {
               int rand = (int) ((Math.random()*difficult)+level);
               for(int index = 1; index< rand;index++)
               {
                   for(int i = 1; i<rand; i++)
                   {
                       addObject(new Robot(),100*index,50*i);
                    }
                }
           }
           cont++;
           level++;
        }
       
    }
    
    public void act()
    {
        showText("Health: "+ship.getHealth(),50,800);
        showText("Level: "+level,50,750);
        isShipAlive();
        createRobots();
       
    }
    
    public void shoot(int x, int y)
    {
       String key = Greenfoot.getKey();
       
       if(key != null && key.equals("space"))
       {
           addObject(new Bullet(),x,y);
           Greenfoot.playSound("shipLaser.aiff");
       }
    }
    
    public void robotShoot(int x,int y)
    {
        addObject(new RoboBullet(),x,y);
    }
    
    public void hitShip()
    {
        ship.hitOne();
    }
    
    public void hitBoss()
    {
        boss.hitOne();
    }
    
    public boolean isShipAlive()
    {
        if(ship.getHealth() > 0)
        {
            return true;
        }
        else
        {
            removeObject(ship);
            showText("You Lost!",450,440);
            return false;
        }
    }

}

