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
    boolean changeCat = false;
    String wantedDrink;
    String wantedDrink1;
    String cat;
    int random = Greenfoot.getRandomNumber(5);
    GreenfootSound blackCatSfx = new GreenfootSound ("sounds/blackcat_sfx.mp3");
    GreenfootSound whiteCatSfx = new GreenfootSound ("sounds/whitecat_sfx.mp3");
    GreenfootSound breadyCatSfx = new GreenfootSound ("sounds/breadycat_sfx.mp3");
    GreenfootSound tortCatSfx = new GreenfootSound ("sounds/tortcat_sfx1.mp3");
    GreenfootSound momoCatSfx = new GreenfootSound ("sounds/momocat_sfx.mp3");
    public void act()
    {
        makeMoney = false;
        randomCat();
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
                setImage ("images/"+cat+"2.png");
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
                happySound();
                setImage ("images/"+cat+"3.png");
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
    
    public void randomCat()
    {
        if (random == 0)
        {
            wantedDrink = "waterfruitstea";
            wantedDrink1 = "waterteafruits";
            cat = "blackcat";
        }
        else if (random == 1)
        {
            wantedDrink = "milkchocochoco";
            wantedDrink1 = "milkchocochoco";
            cat = "breadycat";
        }
        else if (random == 2)
        {
            wantedDrink = "waterteaveggie";
            wantedDrink1 = "waterveggietea";
            cat = "tortcat";
        }
        else if (random == 3)
        {
            wantedDrink = "milkchilichoco";
            wantedDrink1 = "milkchocochili";
            cat = "momocat";
        }
        else if (random == 4)
        {
            wantedDrink = "waterfruitsfruits";
            wantedDrink1 = "waterfruitsfruits";
            cat = "whitecat";
        }
        if (!changeCat)
        {
            setImage("images/"+cat+"1.png");
            changeCat = true;
        }
    }
    
    public void happySound()
    {
        if (cat.equals("blackcat"))
        {
            blackCatSfx.play();
        }
        else if (cat.equals("whitecat"))
        {
            whiteCatSfx.play();
        }
        else if (cat.equals("breadycat"))
        {
            breadyCatSfx.play();
        }
        else if (cat.equals("tortcat"))
        {
            tortCatSfx.play();
        }
        else if (cat.equals("momocat"))
        {
            momoCatSfx.play();
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
