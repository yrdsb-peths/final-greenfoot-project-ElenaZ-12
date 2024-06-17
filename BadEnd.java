import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BadEnd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BadEnd extends World
{
    GreenfootSound mouseClick = new GreenfootSound ("sounds/mouseclick.mp3");
    GreenfootSound badEnd = new GreenfootSound ("sounds/badend.mp3");
    int count = 1;
    MyWorld nextMyWorld;
    /**
     * Constructor for objects of class BadEnd.
     */
    public BadEnd()
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
            badEnd.play();
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
        addObject(label,190,185);
    }
}
