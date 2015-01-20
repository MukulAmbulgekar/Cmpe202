package composite;


/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Premium extends Decorator
{
   protected String [] Premium;
    protected double customBurgerCost;
    public Premium(CustomBurger burger,String customPremium[])
    {
       super(burger);
       Premium=customPremium;
    }
    
     public double getBurgerCost()
    {
          // getting burger cost
         customBurgerCost= orderBurger.getBurgerCost();
        
       
       for (int i = 0; i < Premium.length; i++) {
             // Adding 1.5$ to burger cost for premium toppings
      customBurgerCost+=1.50;
        }
    
         return customBurgerCost;
    }
   

   
}
