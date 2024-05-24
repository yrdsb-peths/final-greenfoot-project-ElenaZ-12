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
     * Act - do whatever the Cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        animateCat();
    }
    
    int imageIndex = 0;
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
