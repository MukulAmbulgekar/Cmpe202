import greenfoot.*;
import java.awt.Color;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MessageDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pickMessage extends Actor
{
    /**
     * Act - do whatever the MessageDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
     public pickMessage(String msg)
    {  
        setMessage(msg);         
    }

    public void setMessage(String msg)
    {
        setImage(new GreenfootImage(msg,30,Color.red,Color.white));
    }

}
