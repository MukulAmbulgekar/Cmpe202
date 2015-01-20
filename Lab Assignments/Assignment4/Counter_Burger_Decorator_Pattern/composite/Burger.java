package composite;


/**
 * Write a description of class Burger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burger implements CustomBurger
{
    protected String [] Burger;

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
               customBurgerCost+=9.5; 
            }
            else if (Burger[i]=="2/3lb.")
            {
                customBurgerCost+=11.5; 
            }
             else if (Burger[i]=="1lb.")
            {
                customBurgerCost+=15.5; 
            }
            else if (Burger[i]=="In A Bowl")
            {
             customBurgerCost+=1; 
            }
            else{
            customBurgerCost+=0.0;
            }
        }
         return customBurgerCost;
    }
   
}
