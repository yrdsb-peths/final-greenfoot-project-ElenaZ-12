import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoodEnd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoodEnd extends World
{
    GreenfootSound mouseClick = new GreenfootSound ("sounds/mouseclick.mp3");
    GreenfootSound goodEnd = new GreenfootSound ("sounds/goodend.mp3");
    int count = 1;
    MyWorld nextmyWorld;
    /**
     * Constructor for objects of class GoodEnd.
     * 
     */
    public GoodEnd()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    public void act()
    {
        if (count>0)
        {
            goodEnd.play();
            count--;
        }
        if (Greenfoot.mouseClicked(null))
        {
            mouseClick.stop();
            mouseClick.play();
            //MyWorld nextWorld = new MyWorld();
            Greenfoot.setWorld(nextmyWorld);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("<Click anywhere to restart>", 30);
        addObject(label,300,370);
    }
}
