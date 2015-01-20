package composite;


/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UnlimitedToppings extends Decorator
{
   protected String [] unlimitedToppings;
    protected double customBurgerCost;
    public UnlimitedToppings(CustomBurger burger,String customPremium[])
    {
       super(burger);
       unlimitedToppings=customPremium;
    }
    
     public double getBurgerCost()
    {
         customBurgerCost= orderBurger.getBurgerCost();
       
        
    
         return customBurgerCost;
    }
   

   
}
