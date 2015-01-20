package composite;


/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sauce extends Decorator
{
    protected String Sauce[];
   protected double customBurgerCost;
    public Sauce(CustomBurger burger,String[] customSauce)
    {
       super(burger);
       Sauce=customSauce;
    }

   public double getBurgerCost()
    {
         // getting burger cost  
         customBurgerCost= orderBurger.getBurgerCost();
       
        if (Sauce.length>1) {
            
           // System.out.println(Sauce.length);
       for (int i = 1; i < Sauce.length; i++) {
              // Adding 0.75$ to burger cost for extra sauce
      customBurgerCost+=0.75;
        }
    }
         return customBurgerCost;
    }
}
