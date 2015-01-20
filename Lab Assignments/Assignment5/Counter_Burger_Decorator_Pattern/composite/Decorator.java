package composite;


/**
 * Write a description of class Decorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Decorator implements CustomBurger
{
    // instance variables - replace the example below with your own
//  private String [] cust=new String [5];
CustomBurger orderBurger;
  
    public Decorator(CustomBurger burger)
    {
         orderBurger=burger;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double getBurgerCost()
    {
   return orderBurger.getBurgerCost();
    }
}
