package composite;

import java.text.DecimalFormat;


public class Leaf implements Component {

    private String description ;
    private double price ;
    private String [] customOrder;

    public Leaf ( String d, Double p )
    {
        description = d ;
        price = p ;
    }
    
      public Leaf ( String d )
    {
        description = d ;
      
    }
    
        public Leaf ( String order [])
    {
        customOrder = order ;
      
    }
    
    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        if (price!=0){
           
  System.out.println( description + " "+fmt.format(price) ) ;
        }
        else {
            System.out.print("\n");
             for (int i=0;i<customOrder.length;i++){
        System.out.print( customOrder[i] + " "  ) ;
        if (i<customOrder.length-1){
        System.out.print("+"+" ");
        }
    }
   
    }
    }

    public void addChild(Component c) {
	    // no implementation
	}

	public void removeChild(Component c) {
        // no implementation
	}

	public Component getChild(int i) {
        // no implementation
        return null ;
	}
	 
}
 
