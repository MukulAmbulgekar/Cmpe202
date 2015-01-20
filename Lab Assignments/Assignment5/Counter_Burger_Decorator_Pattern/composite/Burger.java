package composite;
import java.util.ArrayList;

/**
 * Write a description of class Burger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burger implements CustomBurger
{
    protected String [] Burger;
 //private ArrayList<customBurger> customburg = new ArrayList<customBurger>()  ; 

// ArrayList<String> cust = new ArrayList<String>();
 protected double customBurgerCost=0;

    /**
     * Constructor for objects of class Burger
     */
    public Burger(String[] customBurger)
    {
      Burger=customBurger;  
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double getBurgerCost()
    {
        
       for (int i = 0; i < Burger.length; i++) {
          
             if (Burger[i]=="1/3lb."){
               customBurgerCost+=9; 
            }
            else if (Burger[i]=="1/2lb.")
            {
                customBurgerCost+=12; 
            }
             else if (Burger[i]=="1lb.")
            {
                customBurgerCost+=18; 
            }
            else if (Burger[i]=="In A Bowl")
            {
             customBurgerCost+=1; 
            }
            else if(Burger[i]=="Organic Bison*"){
                customBurgerCost+=4;
            }
             else if(Burger[i]=="Ahi Tuna*"){
                customBurgerCost+=4;
            }
            else{
            customBurgerCost+=0.0;
            }
        }
         return customBurgerCost;
    }
   
}
