package composite;

public class BuildOrder {

    public static Component getOrder(String Burger[],String customCheese[],String customToppings[],
    String customPremium[],String customSauce[],double customBurgerCost)
    {
       Composite order = new Composite( "Order" ) ;
       order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
       order.addChild(new Leaf("The Purist", 8.00 ));
       Composite customBurger = new Composite( "Build Your Own Burger",customBurgerCost ) ;
       customBurger.addChild(new Leaf(Burger )); // Adding base burger to custom burger
       customBurger.addChild(new Leaf(customCheese )); //Adding Cheese to custom burger
       customBurger.addChild(new Leaf(customToppings ));// Adding Toppings to custom burger
       customBurger.addChild(new Leaf(customPremium )); // Adding Premium Toppings to custom burger
       customBurger.addChild(new Leaf(customSauce ));// Adding Sauce to custom burger
     
        order.addChild( customBurger );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/