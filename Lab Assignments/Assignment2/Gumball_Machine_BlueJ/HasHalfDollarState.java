

import java.util.Random;

public class HasHalfDollarState implements IGumballMachine
 {
	GumballMachine gumballMachine;
	

 
	
	public HasHalfDollarState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
	   gumballMachine.setCost(25);
		System.out.println("You inserted a quarter");
	}
    public void insertNickel() {
         gumballMachine.setCost(5);
		System.out.println("You inserted a nickel");
	}
	
	public void insertDime() {
	     gumballMachine.setCost(10);
			System.out.println("You inserted a Dime");
	}
 
	public void ejectQuarter() {
		System.out.println("Quarter returned"); 
		gumballMachine.setCost(-25); 
		gumballMachine.setState(gumballMachine.getNoHalfDollarState());
	}
	public void ejectNickel() {
		System.out.println("Nickel returned");
		gumballMachine.setState(gumballMachine.getNoHalfDollarState());
	}
	public void ejectDime() {
		System.out.println("Dime returned");
		gumballMachine.setState(gumballMachine.getNoHalfDollarState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...with "+ gumballMachine.getCost()+" cents");
		
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
    public void takeGumballFromSlot() { 
	    	    
		System.out.println("Please turn the crank first to get gumballs");
	}
    public boolean isGumballInSlot(){ 
        return gumballMachine.get_GumballStatus();
    }
	public String toString() {
		return "waiting for turn of crank";
	}
	
}
