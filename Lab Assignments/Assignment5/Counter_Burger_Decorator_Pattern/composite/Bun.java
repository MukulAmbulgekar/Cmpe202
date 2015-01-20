package composite;


/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bun extends Decorator
{
   protected String [] Bun;
   protected double customBurgerCost;
    
    public Bun(CustomBurger burger,String customCheese[])
    {
       super(burger);
       Bun=customCheese;
    }

    public double getBurgerCost()
    {
         customBurgerCost= orderBurger.getBurgerCost();
       
        for (int i = 0; i < Bun.length; i++) {
          
             if (Bun[i]=="Hawaiin Bun"){
               customBurgerCost+=1; 
            }
            else if (Bun[i]=="Pretzel Bun")
            {
                customBurgerCost+=0.5; 
            }
             else if (Bun[i]=="Gluten-Free Bun")
            {
                customBurgerCost+=1; 
            }
          
            else{
            customBurgerCost+=0.0;
            }
        }
         return customBurgerCost;
    }
}
