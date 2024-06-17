import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cancer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cancer extends Actor
{
    /**
     * Moves the paw left or right
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            if (getX()>=100)
            {
                setLocation(getX()-5, getY());
            }
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            if (getX()<=500)
            {
                setLocation(getX()+5, getY());
            }
        }
    }
}
