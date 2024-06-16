import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    GreenfootSound music = new GreenfootSound ("sounds/play_bgm.mp3");
    GreenfootSound mouseClick = new GreenfootSound ("sounds/mouseclick.mp3");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }
    
    /**
     * The main world act loop
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            mouseClick.stop();
            mouseClick.play();
            
            //music.stop();
            Intro nextWorld = new Intro();
            //nextWorld.parent_node=(World)this;
            Greenfoot.setWorld(nextWorld);
        }
        if (Greenfoot.mouseClicked(null))
        {
            mouseClick.stop();
            mouseClick.play();
        }
        music.playLoop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cat cat = new Cat();
        addObject(cat,200,310);

        Label title = new Label("Paws and Drink!", 80);
        addObject(title,300,70);
        
        Label start = new Label("Press <space> to start!", 40);
        addObject(start,300,140);
    }
}
