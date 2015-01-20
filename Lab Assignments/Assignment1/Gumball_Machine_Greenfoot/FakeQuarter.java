import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FakeQuarter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FakeQuarter extends Quarter
{
    /**
     * Act - do whatever the FakeQuarter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public FakeQuarter(){
    GreenfootImage image=getImage();
    image.scale(70,70);
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
