package composite;


public class Client {

    public static void runTest()
    {
        double customBurgerCost;
       
       // This is a custom burger order 
       String customBurger[]={"Beef","1/3lb.","On A Bun"}; //// base price for Burger 9.5$
       String customCheese[]= {"Danish Blue Cheese","Horseradish Cheddar"}; //1 cheese free, extra cheese +1.00 -- 1$
       String customToppings []={"Bermuda Red Onion","Black Olives","Carrot Strings","Coleslaw"}; //4 toppings free, extra +.75 -- 0
       String customPremium[]={"Applewood Smoked Bacon"}; //premium topping +1.50 -- 1.5$
       String customSauce[]={"Appricot Sauce"}; //1 sauce free, extra +.75 -- 0
         
       // Crating custom burger object in Decorator Pattern
       CustomBurger burger=new Sauce(new Premium(new Toppings(new Cheese(new Burger(customBurger),customCheese),customToppings),customPremium),customSauce);
        
       //Calculating custom burger Cost using Decorator Pattern
       customBurgerCost=burger.getBurgerCost();
        
       
       Component theOrder = BuildOrder.getOrder(customBurger,customCheese,customToppings,customPremium,customSauce,customBurgerCost) ;
       
       //Printing Order description
       theOrder.printDescription();

    }
}
 
