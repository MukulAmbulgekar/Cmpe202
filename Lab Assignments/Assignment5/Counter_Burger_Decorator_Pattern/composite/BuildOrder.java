package composite;


public class BuildOrder {

    
    
    public static Component getOrder(String Burger[],String customCheese[],String customPremiumCheese[],
    String customSauce[], String customUnlToppings[],String customPremiumToppings[],String customBun[], String customSide[],double customBurgerCost)
    {
        // totalcost+=customBurgerCost;
       Composite order = new Composite( "Order" ) ;
      // order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
       //order.addChild(new Leaf("The Purist", 8.00 ));
        Composite customBurger = new Composite( "Build Your Own Burger  $",customBurgerCost ) ;
       customBurger.addChild(new Leaf(Burger )); // Adding base burger to custom burger
       customBurger.addChild(new Leaf(customCheese )); //Adding Cheese to custom burger
       customBurger.addChild(new Leaf(customPremiumCheese )); //Adding Premium Cheese to custom burger
       customBurger.addChild(new Leaf(customSauce )); //Adding Sauce to custom burger
       customBurger.addChild(new Leaf(customUnlToppings ));// Adding Toppings to custom burger
       customBurger.addChild(new Leaf(customPremiumToppings )); // Adding Premium Toppings to custom burger
       customBurger.addChild(new Leaf(customBun ));// Adding Bun to custom burger
       customBurger.addChild(new Leaf(customSide )); //Adding Side to custom burger
        
       // Composite customBurger = new Composite( "Build Your Own Burger  $",customBurgerCost ) ;
       
        order.addChild( customBurger );
       
        
        return customBurger ;
        
    }
    public static  void getSubCost(double customBurgerCost1,double customBurgerCost2){
    
        System.out.println("\n\nSubtotal: $"+(customBurgerCost1+customBurgerCost2));

    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/