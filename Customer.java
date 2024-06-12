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
        arrival();
        satisfiedDrink();
        leave();
    }
    
    public void move()
    {
        setLocation(getX()+5, getY());
    }
    
    public void arrival()
    {
        if (getX()<=100)
        {
            move();
        }
    }
    
    public void satisfiedDrink()
    {
        if (Greenfoot.isKeyDown("t"))
        {
            satisfied = true;
        }
    }
    
    public void leave()
    {
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
}
