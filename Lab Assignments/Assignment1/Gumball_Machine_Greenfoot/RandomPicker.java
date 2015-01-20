import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void RandomPicker()
    {
       GreenfootImage setImage=getImage();
       setImage.scale(150,150);
    }

    public void pick()
    {
        Greenfoot.delay(25);
        getWorld().addObject(new pickMessage("Random Picker"), 710,40);
        int randomnumber;
        randomnumber=Greenfoot.getRandomNumber(4);

        if(randomnumber==0)
        {
             getWorld().addObject(new Red(),350,570);
        }
        
        else if (randomnumber==1)
        {
           getWorld().addObject(new Blue(),350,570);
        }
        else if (randomnumber==2) 
        {
            getWorld().addObject(new Yellow(),350,570);
        }
        else if (randomnumber==3) 
        {
             getWorld().addObject(new Green(),350,570);
        }
    }
}

