package composite;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Composite implements Component {

    private ArrayList<Component> components = new ArrayList<Component>()  ;
    private String description ;
    private double price ;
    
    public Composite ( String d )
    {
        description = d ;
    }
    
    public Composite ( String d,double p )
    {
        description = d ;
        price=p;
    }

	public void printDescription() {
	    DecimalFormat fmt = new DecimalFormat("0.00");
	    if (price!=0){
        System.out.print( description+ " "+ fmt.format(price) );
    }
    else {
    System.out.println( description);
    }
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }

	public void addChild(Component c) {
        components.add( c ) ;
	}
	 
	public void removeChild(Component c) {
        components.remove(c) ;
	}
	 
	public Component getChild(int i) {
	    return components.get( i ) ;
	}
	 
}
 
