import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GBMachine extends Actor
{
   
    Penny pennyGB;
    Quarter quarterGB;
    FakeQuarter fakequarterGB;
    Inspector ins;
  
   public GBMachine(Penny penny, Quarter quarter, FakeQuarter fake,Inspector inspector)
    {
        pennyGB = penny;
        quarterGB=quarter;
        fakequarterGB=fake;
        ins=inspector;
    }
    public GBMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 400, 400 ) ; 
    }
    
    MouseInfo mouseinfo;
    Actor temppenny=null;
    Actor tempquarter=null;
    Actor tempfake=null;
    public void act() 
    {   
      CoinCheck();
    }
    
    public void CoinCheck()
    {
        pennyCheck();
        fakeCheck();       
        quarterCheck();
    }

    public void pennyCheck()
    {         
        mouseinfo=Greenfoot.getMouseInfo();
        if(Greenfoot.mouseDragged(pennyGB))
        { 
            
            if(mouseinfo.getX()>295 && mouseinfo.getX()<395 &&  mouseinfo.getY()>350 && mouseinfo.getY()<480)
            {

                Actor intersect1= getOneIntersectingObject(Penny.class);  

                if(intersect1!=null)
                {
                    temppenny=intersect1;
                    getWorld().removeObject(intersect1);  
                    getWorld().addObject(new HaveCoin(), 350,125);
                    tempfake=null;
                    tempquarter=null;
                    GumballWorldclass gw = (GumballWorldclass) getWorld();  
                    Inspector ins = gw.getInspector();
                    ins.RandomGreen(temppenny,tempquarter,tempfake);
                    temppenny=null;
                }
            }
        }
    }

    void quarterCheck()
    {   
    
        mouseinfo=Greenfoot.getMouseInfo();
        if(Greenfoot.mouseDragged(quarterGB)){

            if(mouseinfo.getX()>295 && mouseinfo.getX()<395 &&  mouseinfo.getY()>350 && mouseinfo.getY()<480)
            {

                Actor intersect2= getOneIntersectingObject(Quarter.class); 
                {  
                    tempquarter=intersect2;
                    getWorld().removeObject(intersect2);
                   
                   getWorld().addObject(new HaveCoin(), 350,125);
                    
                   
                    temppenny=null;
                    tempfake=null;
                    GumballWorldclass gw = (GumballWorldclass) getWorld();   
                    Inspector ins = gw.getInspector();
                    ins.RandomGreen(temppenny,tempquarter,tempfake);
                    tempquarter=null;

                }
            }
        }
    }

    void fakeCheck()
    {    
        mouseinfo=Greenfoot.getMouseInfo();
     

        if(Greenfoot.mouseDragged(fakequarterGB)){

            if(mouseinfo.getX()>295 && mouseinfo.getX()<395 &&  mouseinfo.getY()>350&& mouseinfo.getY()<480 )
            {
                Actor intersect3 = getOneIntersectingObject(FakeQuarter.class);  
                if (intersect3 != null) 
                {
                    tempfake=intersect3;
                    getWorld().removeObject(intersect3 );  
                    getWorld().addObject(new HaveCoin(), 350,125);
                   
   
                    GumballWorldclass gw = (GumballWorldclass) getWorld();   
                    Inspector ins = gw.getInspector();
                    tempquarter=null;
                    temppenny=null;
                    ins.RandomGreen(temppenny,tempquarter,tempfake);        
                    tempfake=null;

                }
            }
        }
    }
}