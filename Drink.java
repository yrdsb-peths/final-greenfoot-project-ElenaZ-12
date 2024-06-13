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
    int numIngredients = 0;
    public void act()
    {
        Game world = (Game) getWorld();
        addBase();
        if (addedBase)
        {
            addCondiment();
        }
        if (world.customerSatisfied())
        {
            reset();
        }
        world.showText(numIngredients+"/3",260, 340);
        //world.showText(ingredients[0]+ingredients[1]+ingredients[2], 300, 150);
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
                numIngredients++;
                addedBase = true;
            }
            else if (Greenfoot.mouseClicked(water))
            {
                ingredients[0] = "water";
                numIngredients++;
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
            if (condimentCount==2)
            {
                if (Greenfoot.mouseClicked(fruit))
                {
                    ingredients[1] = "fruits";
                    numIngredients++;
                    condimentCount--;
                }
                else if (Greenfoot.mouseClicked(chocolate))
                {
                    ingredients[1] = "chocolate";
                    numIngredients++;
                    condimentCount--;
                }
                else if (Greenfoot.mouseClicked(tea))
                {
                    ingredients[1] = "tea";
                    numIngredients++;
                    condimentCount--;
                }
                else if (Greenfoot.mouseClicked(chili))
                {
                    ingredients[1] = "chili";
                    numIngredients++;
                    condimentCount--;
                }
                else if (Greenfoot.mouseClicked(veggie))
                {
                    ingredients[1] = "veggie";
                    numIngredients++;
                    condimentCount--;
                }
            }
            else if (condimentCount==1)
            {
                if (Greenfoot.mouseClicked(fruit))
                {
                    ingredients[2] = "fruits";
                    numIngredients++;
                    condimentCount--;
                }
                else if (Greenfoot.mouseClicked(chocolate))
                {
                    ingredients[2] = "chocolate";
                    numIngredients++;
                    condimentCount--;
                }
                else if (Greenfoot.mouseClicked(tea))
                {
                    ingredients[2] = "tea";
                    numIngredients++;
                    condimentCount--;
                }
                else if (Greenfoot.mouseClicked(chili))
                {
                    ingredients[2] = "chili";
                    numIngredients++;
                    condimentCount--;
                }
                else if (Greenfoot.mouseClicked(veggie))
                {
                    ingredients[2] = "veggie";
                    numIngredients++;
                    condimentCount--;
                }
            }
        }
        if (condimentCount==0)
        {
            addedCondiment = true;
        }
    }
    
    public String[] getDrink()
    {
        return ingredients;
    }
    
    public void reset()
    {
        ingredients = new String [3];
        addedBase = false;
        addedCondiment = false;
        condimentCount = 2;
        numIngredients = 0;
    }
}
