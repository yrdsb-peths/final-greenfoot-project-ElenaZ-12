import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    Milk milk;
    Water water;
    Drink drink;
    String[] ingredients = new String [3];
    boolean addedBase = false;
    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        newCustomer();
        
        Water water = new Water();
        addObject(water, 100, 200);
        
        Milk milk = new Milk();
        addObject(milk, 100, 300);
        
        Drink drink = new Drink();
        addObject(drink, 300, 200);
    }
    
    public void act()
    {
        if (!addedBase)
        {
            if (milk.getClicked())
            {
                ingredients[0] = "milk";
                drink.setImage(new GreenfootImage("images/bread.png"));
            }
            else if(water.getClicked())
            {
                ingredients[0] = "water";
                drink.setImage(new GreenfootImage("images/bread.png"));
            }
            addedBase = true;
        }
    }
    
    public void newCustomer()
    {
        Customer customer = new Customer();
        addObject(customer,0,100);
    }
}
