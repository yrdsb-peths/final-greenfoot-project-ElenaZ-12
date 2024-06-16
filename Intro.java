import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends World
{
    MyWorld nextmyWorld;
    int textSize = 40;
    GreenfootSound mouseClick = new GreenfootSound ("sounds/mouseclick.mp3");
    /**
     * Constructor for objects of class Intro.
     * 
     */
    public Intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        Label story1 = new Label("You¡¯re suffering from kitty cancer,\nmake 200 dollars by the end of the \nweek to pay for your medical fee!", textSize);
        addObject(story1,300,70);

        Cancer cancer = new Cancer();
        addObject(cancer,200,320);
        prepare();
    }

    public void act()
    {
        if (Greenfoot.mouseClicked(null))
        {
            mouseClick.stop();
            mouseClick.play();
            Game currentWorld = new Game();
            currentWorld.nextmyWorld=nextmyWorld;
            Greenfoot.setWorld(currentWorld);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("<Click anywhere to proceed>", 30);
        addObject(label,300,170);
    }
}
