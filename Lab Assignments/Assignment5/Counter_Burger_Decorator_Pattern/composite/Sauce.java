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
         customBurgerCost= orderBurger.getBurgerCost();
       
        if (Sauce.length>1) {
            
           // System.out.println(Sauce.length);
       for (int i = 1; i < Sauce.length; i++) {
      customBurgerCost+=0.50;
        }
    }
         return customBurgerCost;
    }
}
