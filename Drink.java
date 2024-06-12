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
    boolean addedCondiment = false;
    int condimentCount = 2;
    public void act()
    {
        addBase();
        if (addedBase)
        {
            addCondiment();
        }
    }
    
    public void addBase()
    {
        Game world = (Game) getWorld();
        Object milk = world.getMilk();
        Object water = world.getWater();
        if (!addedBase)
        {
            if (Greenfoot.mouseClicked(milk))
            {
                ingredients[0] = "milk";
                setImage("images/bread.png");
                addedBase = true;
            }
            else if (Greenfoot.mouseClicked(water))
            {
                ingredients[0] = "water";
                setImage("images/apple.png");
                addedBase = true;
            }
        }
    }
    
    public void addCondiment()
    {
        Game world = (Game) getWorld();
        Object fruit = world.getFruit();
        Object chocolate = world.getChocolate();
        Object tea = world.getTea();
        Object chili = world.getChili();
        Object veggie = world.getVeggie();
        if (!addedCondiment)
        {
            if (Greenfoot.mouseClicked(fruit))
            {
                ingredients[1] = "fruit";
                setImage(new GreenfootImage("images/bread.png"));
                condimentCount--;
            }
            else if (Greenfoot.mouseClicked(chocolate))
            {
                ingredients[1] = "chocolate";
                setImage(new GreenfootImage("images/apple.png"));
                condimentCount--;
            }
            else if (Greenfoot.mouseClicked(tea))
            {
                ingredients[1] = "tea";
                setImage(new GreenfootImage("images/apple.png"));
                condimentCount--;
            }
            else if (Greenfoot.mouseClicked(chili))
            {
                ingredients[1] = "chili";
                setImage(new GreenfootImage("images/apple.png"));
                condimentCount--;
            }
            else if (Greenfoot.mouseClicked(veggie))
            {
                ingredients[1] = "veggie";
                setImage(new GreenfootImage("images/apple.png"));
                condimentCount--;
            }
        }
        if (condimentCount==0)
        {
            addedCondiment = true;
        }
    }
}
