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
        // getting burger cost 
        customBurgerCost= orderBurger.getBurgerCost(); 
       
        if (Cheese.length>1) {
            
           // System.out.println(Cheese.length);
           
       for (int i = 1; i < Cheese.length; i++) {
           // For extra cheese adding 1$ in burger cost
      customBurgerCost+=1.00;
        }
    }
         return customBurgerCost;
    }
}
