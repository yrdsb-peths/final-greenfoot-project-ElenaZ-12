import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Milk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Milk extends Actor
{
    boolean clickedMilk = false;
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            setImage(new GreenfootImage("images/bread.png"));
            clickedMilk = true;
        }
    }
    
    public boolean getClicked()
    {
        return clickedMilk;
    }
}
