import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The cat, the protagonist
 * 
 * @author Elena Zhong
 * @version May 2024
 */
public class Cat extends Actor
{
    GreenfootImage[] idle = new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    int imageIndex = 0;
    /**
     * Loads images and sets timer and intial image
     */
    public Cat()
    {
        for (int i = 0; i<idle.length; i++)
        {
            idle[i] = new GreenfootImage ("images/cat_idle/tile0"+i+".png");
            idle[i].scale(250,150);
        }
        
        // Resets timer
        animationTimer.mark();
        
        // Initial cat image
        setImage(idle[0]);
    }
    
    /**
     * Animates the cat
     */
    public void act()
    {
        animateCat();
    }

    /**
     * Switches the image to make animation
     */
    public void animateCat()
    {
        if (animationTimer.millisElapsed()<150)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex+1)% idle.length;
    }
}
