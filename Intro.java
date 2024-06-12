import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends World
{
    int textSize = 40;
    /**
     * Constructor for objects of class Intro.
     * 
     */
    public Intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Label story1 = new Label("You¡¯re suffering from kitty cancer,\nmake 150 dollars by the end of the \nweek to pay for your medical fee!", textSize);
        addObject(story1,300,180);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("n"))
        {
            Game currentWorld = new Game();
            Greenfoot.setWorld(currentWorld);
        }
    }
}
