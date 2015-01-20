package composite;


/**
 * Write a description of class PremiumCheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PremiumCheese extends Decorator
{
   protected String [] PremiumCheese;
    protected double customBurgerCost;
    public PremiumCheese(CustomBurger burger,String customPremium[])
    {
       super(burger);
       PremiumCheese=customPremium;
    }
    
     public double getBurgerCost()
    {
         customBurgerCost= orderBurger.getBurgerCost();
        
       
       for (int i = 0; i < PremiumCheese.length; i++) {
      customBurgerCost+=1.5;
        }
    
         return customBurgerCost;
    }
   

   
}
