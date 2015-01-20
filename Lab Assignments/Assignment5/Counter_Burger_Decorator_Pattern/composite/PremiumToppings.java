    package composite;


/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PremiumToppings extends Decorator
{
   protected String [] Premium;
    protected double customBurgerCost;
    public PremiumToppings(CustomBurger burger,String customPremium[])
    {
       super(burger);
       Premium=customPremium;
    }
    
     public double getBurgerCost()
    {
         customBurgerCost= orderBurger.getBurgerCost();
        
       
       for (int i = 0; i < Premium.length; i++) {
      customBurgerCost+=1.0;
      if (Premium[i]=="Marinated Tomatoes"){
           customBurgerCost+=2.0;
        }
        }
    
         return customBurgerCost;
    }
   

   
}
