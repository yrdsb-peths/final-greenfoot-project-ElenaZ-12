import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Drink here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Drink extends Actor
{
    String[] ingredients = new String [3];
    boolean addedBase = false;
    public void act()
    {
        Game world = (Game) getWorld();
        Object milk = world.getMilk();
        Object water = world.getWater();
        
        if (!addedBase)
        {
            if (Greenfoot.mouseClicked(milk))
            {
                ingredients[0] = "milk";
                setImage(new GreenfootImage("images/bread.png"));
            }
            else if (Greenfoot.mouseClicked(water))
            {
                ingredients[0] = "water";
                setImage(new GreenfootImage("images/bread.png"));
            }
        }
        
    }
    
}
