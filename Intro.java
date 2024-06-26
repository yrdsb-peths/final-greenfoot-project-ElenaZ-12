import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends World
{
    MyWorld nextMyWorld;
    GreenfootSound mouseClick = new GreenfootSound ("sounds/mouseclick.mp3");
    /**
     * Makes objects and adds them to world
     */
    public Intro()
    {    
        super(600, 400, 1); 

        Label story1 = new Label("You��re suffering from kitty cancer,\nmake 200 dollars by the end of the \nweek to pay for your medical fee!", 40);
        addObject(story1,300,70);

        Cancer cancer = new Cancer();
        addObject(cancer,200,320);
        
        Label label = new Label("<Click anywhere to proceed>", 30);
        addObject(label,300,170);
    }
    
    /**
     * Changes world if mouse click
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(null))
        {
            mouseClick.stop();
            mouseClick.play();
            Game currentWorld = new Game();
            currentWorld.nextMyWorld=nextMyWorld;
            Greenfoot.setWorld(currentWorld);
        }
    }
}
