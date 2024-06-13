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
    Customer customer;
    Label instructions;
    Trash trash;
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
        addObject(water, 70, 170);

        milk = new Milk();
        addObject(milk, 70, 320);

        drink = new Drink();
        addObject(drink, 260, 275);

        fruit = new Fruit();
        addObject(fruit,430,210);

        chocolate = new Chocolate();
        addObject(chocolate,540,210);

        tea = new Tea();
        addObject(tea,430,280);

        chili = new Chili();
        addObject(chili,540,280);

        veggie = new Veggie();
        addObject(veggie,485,345);

        instructions = new Label("Make drinks for your customers!\nAdd 1 base and 2 condiments\nto complete a drink!", 40);
        addObject(instructions,315,230);
        
        trash = new Trash();
        addObject(trash,565,35);
    }

    public void act()
    {
        if (Greenfoot.mouseClicked(null))
        {
            removeObject(instructions);
        }
        if (Greenfoot.mouseClicked(trash))
        {
            drink.reset();
        }
    }

    public void newCustomer()
    {
        customer = new Customer();
        addObject(customer,0,77);
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

    public String[] getDrink()
    {
        return drink.getDrink();
    }

    public boolean customerSatisfied()
    {
        return customer.getSatisfied();
    }
    
}
