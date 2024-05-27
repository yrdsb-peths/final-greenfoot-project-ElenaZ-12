import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer extends Actor
{
    boolean satisfied = false;
    public void act()
    {
        if (getX()<=100)
        {
            move();
        }
        if (Greenfoot.isKeyDown("t"))
        {
            satisfied = true;
        }
        if (satisfied)
        {
            move();
            Game world = (Game) getWorld();
            if(getX()>world.getWidth()+300)
            {
                world.removeObject(this);
                world.newCustomer();
            }
        }
    }
    
    public void move()
    {
        setLocation(getX()+5, getY());
    }
}
