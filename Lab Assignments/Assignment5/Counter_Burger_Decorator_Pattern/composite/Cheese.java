package composite;


/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cheese extends Decorator
{
   protected String [] Cheese;
   protected double customBurgerCost;
    
    public Cheese(CustomBurger burger,String customCheese[])
    {
       super(burger);
       Cheese=customCheese;
    }

    public double getBurgerCost()
    {
         customBurgerCost= orderBurger.getBurgerCost();
       
        if (Cheese.length>1) {
            
           // System.out.println(Cheese.length);
       for (int i = 1; i < Cheese.length; i++) {
      customBurgerCost+=1.00;
        }
    }
         return customBurgerCost;
    }
}
