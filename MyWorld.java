import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

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
        // Start the game if user presses space bar
        if (Greenfoot.isKeyDown("space"))
        {
            Game currentWorld = new Game();
            Greenfoot.setWorld(currentWorld);
        }
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
