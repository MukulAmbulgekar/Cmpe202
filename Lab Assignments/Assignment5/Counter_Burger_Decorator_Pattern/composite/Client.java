package composite;


public class Client {

    public static void runTest()
    {
        double customBurgerCost1=0;
        double customBurgerCost2=0;    
       // This is a custom burger order one
       String customBurger[]={"Organic Bison*","1/2lb.","On A Bun"}; //// base price for Burger 9.5$
       String customCheese[]= {"Spicy Jalapeno Jack","Yellow American"}; //1 cheese free, extra cheese +1.00 -- 1$
       //String customToppings []={"Bermuda Red Onion","Black Olives","Carrot Strings","Coleslaw"}; //4 toppings free, extra +.75 -- 0
       String customPremiumCheese[]={"Danish Blue Cheese"};
        String customSauce[]={"Mayonnaise","Thai Peanut Sauce"}; //1 sauce free, extra +.50 -- 0
       String customPremiumToppings[]={"Marinated Tomatoes"}; //premium topping +1.50 -- 1.5$
        String customUnlToppings[]={"Black Olives","Dill Pickle Chips","Spicy Pickles"}; //1 sauce free, extra +.75 -- 0
        String customBun[]={"Ciabatta(Vegan)"};
        String customSide[]={"Shoestring Fries"};
        
          // This is a custom burger order two
       String customBurger1[]={"Harmone & Antibiotic Free Beef*","1/3lb.","On A Bun"}; //// base price for Burger 9.5$
       String customCheese1[]= {"Greek Feta","Smoked Gouda"}; //1 cheese free, extra cheese +1.00 -- 1$
       //String customToppings1 []={"Bermuda Red Onion","Black Olives","Carrot Strings","Coleslaw"}; //4 toppings free, extra +.75 -- 0
       String customPremiumCheese1[]={"Fresh Mozzarella"};
        String customSauce1[]={"Habanero Salsa"}; //1 sauce free, extra +.50 -- 0
       String customPremiumToppings1[]={"Marinated Tomatoes","Sunny Side Up Egg*"}; //premium topping +1.50 -- 1.5$
        String customUnlToppings1[]={"Crushed Peanuts"}; //1 sauce free, extra +.75 -- 0
        String customBun1[]={"Gluten-Free Bun"};
        String customSide1[]={"Shoestring Fries"};
      
         
       // Crating custom burger object in Decorator Pattern
       
         CustomBurger burger1=new Side( new Bun(new  PremiumToppings(new UnlimitedToppings(new Sauce(new PremiumCheese
         (new Cheese (new Burger(customBurger),customCheese),customPremiumCheese),customSauce),
         customUnlToppings),customPremiumToppings),customBun),customSide);
      // CustomBurger burger=new Sauce(new PremiumToppings(new Toppings(new Cheese(new Burger(customBurger),customCheese),
       //customToppings),customPremiumCheese),customSauce);
       
       CustomBurger burger2=new Side( new Bun(new  PremiumToppings(new UnlimitedToppings(new Sauce(new PremiumCheese
         (new Cheese (new Burger(customBurger1),customCheese1),customPremiumCheese1),customSauce1),
         customUnlToppings1),customPremiumToppings1),customBun1),customSide1);
        
       //Calculating custom burger Cost using Decorator Pattern for order 1 and order 2
      customBurgerCost1=burger1.getBurgerCost();
           customBurgerCost2=burger2.getBurgerCost();        

           //Passing custom order 1 and order 2 composite pattern for printing order description from composite pattern
       Component theOrder1 = BuildOrder.getOrder(customBurger,customCheese,customPremiumCheese,customSauce,customUnlToppings,customPremiumToppings,customBun,customSide,customBurgerCost1) ;
       Component theOrder2= BuildOrder.getOrder(customBurger1,customCheese1,customPremiumCheese1,customSauce1,customUnlToppings1,customPremiumToppings1,customBun1,customSide1,customBurgerCost2) ;
 
       
       //Printing Order description

       theOrder1.printDescription(); // Printing first custom order 
       theOrder2.printDescription(); // Printing second custom order 
       BuildOrder.getSubCost(customBurgerCost1,customBurgerCost2); // Printing subtotal for both custom orders    

    }
}
 
