import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String s;

    public Inspector()
    {
    GreenfootImage setImage=getImage();
    setImage.scale(150,150);
    }

    public void RandomGreen(Actor penny,Actor quarter, Actor fake)
    {
        int randomchoice=Greenfoot.getRandomNumber(2);
       
        Greenfoot.delay(25);
        if(penny!=null)
          {
               getWorld().addObject(new pickMessage("INSPECTOR"), 520,240);
              getWorld().addObject(new pickMessage("Penny not Accepted"), 675,337);
              getWorld().addObject(new pickMessage("Sorry No Gums..!! "), 675,367);
          }

        else if(quarter!=null)
        {
             TurnCrank tc= new TurnCrank();
                    getWorld().addObject(tc,350,439);
                    tc.turn(270);
                    getWorld().addObject(new CrankTurnMsg(), 220,415);
            getWorld().addObject(new pickMessage("INSPECTOR"), 520,240);
            getWorld().addObject(new pickMessage("Quarter Accepted"), 690,297);
          

            if(randomchoice==1)
            { 
               
                GumballWorldclass gw = (GumballWorldclass) getWorld();   
                RandomPicker randompicker = gw.getRandomPicker();
                randompicker.pick();

            }
            else
            {
                
                GumballWorldclass gw = (GumballWorldclass) getWorld();   
                GreenPicker greenpicker = gw.getGreenPicker();
                greenpicker.pick();
            }
            
        }
         else if(fake!=null)
            {
               
              getWorld().addObject(new pickMessage("INSPECTOR"), 520,240);
              getWorld().addObject(new pickMessage("Fake Coin"), 665,297);
              getWorld().addObject(new pickMessage("No Gums"), 665,327);


            }

    }

}

