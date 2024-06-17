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
    MyWorld nextMyWorld;
    /**
     * Constructor for objects of class GoodEnd.
     */
    public GoodEnd()
    {    
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Plays sound effect and restarts game if mouse click
     */
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
            Greenfoot.setWorld(nextMyWorld);
        }
    }
    
    private void prepare()
    {
        Label label = new Label("<Click anywhere to restart>", 30);
        addObject(label,300,370);
    }
}
