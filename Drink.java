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
    int tries = 0;
    GreenfootSound baseSfx = new GreenfootSound ("sounds/base_sfx.mp3");
    GreenfootSound conSfx = new GreenfootSound ("sounds/condiment_sfx.mp3");
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
                baseSfx.play();
                ingredients[0] = "milk";
                numIngredients++;
                addedBase = true;
            }
            else if (Greenfoot.mouseClicked(water))
            {
                baseSfx.play();
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
        Object choco = world.getChocolate();
        Object tea = world.getTea();
        Object chili = world.getChili();
        Object veggie = world.getVeggie();
        if (!addedCondiment)
        {
            if (condimentCount==2)
            {
                if (Greenfoot.mouseClicked(fruit))
                {
                    conSfx.stop();
                    conSfx.play();
                    ingredients[1] = "fruits";
                    numIngredients++;
                    condimentCount--;
                }
                else if (Greenfoot.mouseClicked(choco))
                {
                    conSfx.stop();
                    conSfx.play();
                    ingredients[1] = "choco";
                    numIngredients++;
                    condimentCount--;
                }
                else if (Greenfoot.mouseClicked(tea))
                {
                    conSfx.stop();
                    conSfx.play();
                    ingredients[1] = "tea";
                    numIngredients++;
                    condimentCount--;
                }
                else if (Greenfoot.mouseClicked(chili))
                {
                    conSfx.stop();
                    conSfx.play();
                    ingredients[1] = "chili";
                    numIngredients++;
                    condimentCount--;
                }
                else if (Greenfoot.mouseClicked(veggie))
                {
                    conSfx.stop();
                    conSfx.play();
                    ingredients[1] = "veggie";
                    numIngredients++;
                    condimentCount--;
                }
            }
            else if (condimentCount==1)
            {
                if (Greenfoot.mouseClicked(fruit))
                {
                    conSfx.stop();
                    conSfx.play();
                    ingredients[2] = "fruits";
                    numIngredients++;
                    condimentCount--;
                    tries++;
                }
                else if (Greenfoot.mouseClicked(choco))
                {
                    conSfx.stop();
                    conSfx.play();
                    ingredients[2] = "choco";
                    numIngredients++;
                    condimentCount--;
                    tries++;
                }
                else if (Greenfoot.mouseClicked(tea))
                {
                    conSfx.stop();
                    conSfx.play();
                    ingredients[2] = "tea";
                    numIngredients++;
                    condimentCount--;
                    tries++;
                }
                else if (Greenfoot.mouseClicked(chili))
                {
                    conSfx.stop();
                    conSfx.play();
                    ingredients[2] = "chili";
                    numIngredients++;
                    condimentCount--;
                    tries++;
                }
                else if (Greenfoot.mouseClicked(veggie))
                {
                    conSfx.stop();
                    conSfx.play();
                    ingredients[2] = "veggie";
                    numIngredients++;
                    condimentCount--;
                    tries++;
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
    
    public int getTries()
    {
        return tries;
    }
    
    public void resetTries()
    {
        tries = 0;
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
