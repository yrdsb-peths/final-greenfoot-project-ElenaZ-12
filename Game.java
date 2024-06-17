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
    Label moneyMade;
    Trash trash;
    int money = 0;
    int numCustomers = 0;
    int days = 0;
    Label week;
    MyWorld nextMyWorld;
    String dayWeek = "Monday";
    GreenfootSound mouseClick = new GreenfootSound ("sounds/mouseclick.mp3");
    /**
     * Makes objects and add them to world
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
        
        moneyMade = new Label ("$"+money, 40);
        addObject(moneyMade,50,30);
        
        trash = new Trash();
        addObject(trash,565,35);
    }

    /**
     * Main game loop; changes day and score and checks for mouse clicks
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(null))
        {
            mouseClick.stop();
            mouseClick.play();
            removeObject(instructions);
        }
        if (Greenfoot.mouseClicked(trash))
        {
            drink.reset();
        }
        if (customer.getMakeMoney())
        {
            if(drink.getTries()==1)
            {
                money+=10;
                drink.resetTries();
            }
            else
            {
                money+=5;
                drink.resetTries();
            }
            removeObject(moneyMade);
            moneyMade = new Label ("$"+money, 40);
            addObject(moneyMade,50,30);
        }
        dayOfWeek();
    }

    /**
     * Determines the day of the week based on days passed
     */
    public void dayOfWeek()
    {
        if (days == 0)
        {
            dayWeek = "Monday";
        }
        else if (days == 1)
        {
            dayWeek = "Tuesday";
        }
        else if (days == 2)
        {
            dayWeek = "Wednesday";
        }
        else if (days == 3)
        {
            dayWeek = "Thursday";
        }
        else if (days == 4)
        {
            dayWeek = "Friday";
        }
        else if (days == 5)
        {
            dayWeek = "Saturday";
        }
        else if (days == 6)
        {
            dayWeek = "Sunday";
        }
    }
    
    /**
     * Makes a new customer and updates day and check for game over
     */
    public void newCustomer()
    {
        updateDay();
        if (days == 7)
        {
            endGame();
        }
        customer = new Customer();
        addObject(customer,0,77);
        numCustomers++;
        if (numCustomers%3 == 0)
        {
            days ++;
        }
    }
    
    /**
     * Updates the text/label that shows the day of the week
     */
    public void updateDay()
    {
        removeObject(week);
        week = new Label (dayWeek, 50);
        addObject(week,270,380);
    }
    
    /**
     * Switches to one of the ending worlds based on the money made
     */
    public void endGame()
    {
        if (money >= 200)
        {
            GoodEnd nextWorld = new GoodEnd();
            nextWorld.nextMyWorld=nextMyWorld;
            Greenfoot.setWorld(nextWorld);
        }
        else
        {
            BadEnd nextWorld = new BadEnd();
            nextWorld.nextMyWorld=nextMyWorld;
            Greenfoot.setWorld(nextWorld);
        }
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
