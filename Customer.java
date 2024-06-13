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
    String wantedDrink = "waterfruitstea";
    String wantedDrink1 = "waterteafruits";
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
        //world.showText(madeDrink, 300, 200);
        //world.showText(wantedDrink, 300, 250);
        if (wantedDrink.equals(madeDrink)||wantedDrink1.equals(madeDrink))
        {
            satisfied = true;
        }
    }
    
    public void leave()
    {
        if (satisfied)
        {
            if (!swap2)
            {
                setImage ("images/blackcat3.png");
                setLocation(221, getY());
                swap2 = true;
            }
            move();
            Game world = (Game) getWorld();
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
}
