import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class GumballWorldclass extends World
{
    /**
     * Constructor for objects of class GumballWorld.
     * 
     */
    Penny pennycoin;
    Quarter quartercoin;
    FakeQuarter fakecoin;
    Inspector inspect;
	private Inspector insp;
    public GreenPicker green;
    public RandomPicker random;
   
    public GumballWorldclass()
    {    
        super(800,600, 1); 
        WorldSetup();
        GBMachine g = new GBMachine(pennycoin,quartercoin,fakecoin,inspect);
	}

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    public void WorldSetup()
    {
        
        Welcome msg=new Welcome("Welcome to Gumball Machine..!!");
        addObject(msg,388,30);
        GBMachine gm = new GBMachine();
         addObject(gm, 350, 350);
        Penny p=new Penny();
        addObject( p, 50, 230 ) ;
        Quarter q=new Quarter();
        addObject( q, 50, 300 ) ;
        FakeQuarter f=new FakeQuarter();
        addObject( f, 50, 380 ) ;
        insp = new Inspector();
        addObject(insp, 700, 120);
        random = new RandomPicker();
        addObject(random, 520, 320);
        green = new GreenPicker();
        addObject(green, 700, 520);
        
    }
    
    public Inspector getInspector()
    {
        return insp;
    }
    public GreenPicker getGreenPicker()
    {
        return green;
    }
    public RandomPicker getRandomPicker()
    {
        return random;
    }
    
}


