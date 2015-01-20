package composite;


/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Side extends Decorator
{
   protected String [] side;
    protected double customBurgerCost;
    public Side(CustomBurger burger,String customPremium[])
    {
       super(burger);
       side=customPremium;
    }
    
     public double getBurgerCost()
    {
         customBurgerCost= orderBurger.getBurgerCost();
        
       
       for (int i = 0; i < side.length; i++) {
      customBurgerCost+=3.0;
   
        }
    
         return customBurgerCost;
    }
   

   
}
