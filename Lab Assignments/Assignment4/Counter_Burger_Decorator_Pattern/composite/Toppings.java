package composite;


/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Toppings extends Decorator
{
   protected double customBurgerCost;
   protected String Toppings[];
    public Toppings(CustomBurger burger,String customToppings[])
    {
       super(burger);
       Toppings=customToppings;
    }

    public double getBurgerCost()
    {
        // getting burger cost 
         customBurgerCost= orderBurger.getBurgerCost();
        
        if (Toppings.length>4) {
            
          //  System.out.println(toppings.length);
       for (int i = 0; i < Toppings.length-4; i++) {
           // Adding 0.75$ to burger cost for more than 4 toppings
      customBurgerCost+=0.75;
        }
    }
         return customBurgerCost;
    }
   
}
