    import greenfoot.*;
   
    import java.awt.Color;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class MessageDisplay here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Welcome extends Actor
    {
        /**
         * Act - do whatever the MessageDisplay wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        
         public Welcome(String msg)
        {   
            welcome(msg);         
        }
    
        public void welcome(String msg)
        {
            setImage(new GreenfootImage(msg,40,Color.orange,Color.gray));
              
        }
   
    }
