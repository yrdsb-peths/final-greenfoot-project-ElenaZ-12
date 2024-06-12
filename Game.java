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
    Fruit fruit;
    Chocolate chocolate;
    Tea tea;
    Chili chili;
    Veggie veggie;
    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 

        newCustomer();

        water = new Water();
        addObject(water, 100, 200);

        milk = new Milk();
        addObject(milk, 100, 300);

        drink = new Drink();
        addObject(drink, 300, 200);
        
        fruit = new Fruit();
        addObject(fruit,395,180);
        
        chocolate = new Chocolate();
        addObject(chocolate,489,182);
        
        tea = new Tea();
        addObject(tea,560,178);
        
        chili = new Chili();
        addObject(chili,414,270);
        
        veggie = new Veggie();
        addObject(veggie,510,267);
    }

    public void act()
    {

    }

    public void newCustomer()
    {
        Customer customer = new Customer();
        addObject(customer,0,100);
    }
    
    public Object getMilk()
    {
        return milk;
    }
    public Object getWater()
    {
        return water;
    }
    public Object getFruit()
    {
        return fruit;
    }
    public Object getChocolate()
    {
        return chocolate;
    }
    public Object getTea()
    {
        return tea;
    }
    public Object getChili()
    {
        return chili;
    }
    public Object getVeggie()
    {
        return veggie;
    }
}
