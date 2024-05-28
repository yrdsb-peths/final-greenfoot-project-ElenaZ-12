import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends Actor
{
    boolean clickedWater = false;
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            setImage(new GreenfootImage("images/bread.png"));
            clickedWater = true;
        }
    }
    
    public boolean getClicked()
    {
        return clickedWater;
    }
}
