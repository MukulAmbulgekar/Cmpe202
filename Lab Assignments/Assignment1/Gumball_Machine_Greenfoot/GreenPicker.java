import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenPicker extends Picker
{
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GreenPicker()
    {
        GreenfootImage setImage=getImage();
        setImage.scale(150,150);
    }
    public void pick()
    {   
        Greenfoot.delay(25);
        getWorld().addObject(new pickMessage("Green Picker"),720,450);
        getWorld().addObject(new Green(), 350,570);
    }
    
}

