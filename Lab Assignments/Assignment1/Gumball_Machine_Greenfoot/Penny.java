import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Penny here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Penny extends Coin
{
    /**
     * Act - do whatever the Penny wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Penny(){
    GreenfootImage image=getImage();
    image.scale(50,50);
    }
    public void act() 
    {
       int mouseX, mouseY ;

        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);

            
        } 
 // Add your action code here.
    }    
}
