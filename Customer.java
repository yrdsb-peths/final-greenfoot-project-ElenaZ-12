import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer extends Actor
{
    boolean swap1 = false;
    boolean swap2 = false;
    boolean satisfied = false;
    boolean makeMoney = false;
    String wantedDrink = "waterfruitstea";
    String wantedDrink1 = "waterteafruits";
    public void act()
    {
        makeMoney = false;
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
        if (getX()<=200)
        {
            move();
        }
        else
        {
            if (!swap1)
            {
                setImage ("images/blackcat2.png");
                setLocation(301, getY());
                swap1 = true;
            }
        }
    }
    
    public void satisfiedDrink()
    {
        Game world = (Game) getWorld();
        String[] drink = world.getDrink();
        String madeDrink = drink[0]+drink[1]+drink[2];
        if (wantedDrink.equals(madeDrink)||wantedDrink1.equals(madeDrink))
        {
            satisfied = true;
            makeMoney = true;
        }
    }
    
    public void leave()
    {
        if (satisfied)
        {
            Game world = (Game) getWorld();
            if (!swap2)
            {
                setImage ("images/blackcat3.png");
                setLocation(221, getY());
                swap2 = true;
            }
            move();
            if(getX()>world.getWidth()+500)
            {
                world.removeObject(this);
                world.newCustomer();
            }
        }
    }
    
    public boolean getSatisfied()
    {
        return satisfied;
    }
    
    public boolean getMakeMoney()
    {
        return makeMoney;
    }
}
