

public class NoHalfDollarState implements IGumballMachine
 {
    GumballMachine gumballMachine;
   
    
 
    public NoHalfDollarState(GumballMachine gumballMachine) {
        
        this.gumballMachine = gumballMachine;
    }
   
	public void insertQuarter() {
	     gumballMachine.setCost(25);
		System.out.println("You inserted a quarter");
		if (gumballMachine.getCost()>=50) {
		gumballMachine.setState(gumballMachine.getHasHalfDollarState());
	 
        }
	}
	
	public void insertNickel() {
	     gumballMachine.setCost(5);
		System.out.println("You inserted a nickel");
		if (gumballMachine.getCost()>=50) {
		gumballMachine.setState(gumballMachine.getHasHalfDollarState());
		
        }
	}
	
	public void insertDime() {
	     gumballMachine.setCost(10);
		System.out.println("You inserted a Dime");
		if (gumballMachine.getCost()>=50) {
		gumballMachine.setState(gumballMachine.getHasHalfDollarState());
		
        }
	}
 
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}

		public void ejectNickel() {
		System.out.println("You haven't inserted a Nickel");
	}
	
		public void ejectDime() {
		System.out.println("You haven't inserted a Dime");
	}
	public void turnCrank() {

	    if (gumballMachine.getCost()==0)
	    {
		System.out.println("You turned, but there's no quarter");
}
         else {
    System.out.println("You turned, but you inserted only "+ gumballMachine.getCost() + " Cents Please insert "+ (50-gumballMachine.getCost())+" more to get the gumball");
	    }
}
 
public void dispense() {
		
} 
public void takeGumballFromSlot() {
	    	    System.out.println("You need to insert atleast 50 cents to get the gumball");
		       if (gumballMachine.getCost()>0){
			    System.out.println("Please take your cents back:"+gumballMachine.getCost());
			    gumballMachine.setCost(-gumballMachine.getCost());
			 }
} 
	   public boolean isGumballInSlot(){ 
        return gumballMachine.get_GumballStatus();
    }
 
	public String toString() {
		return "waiting for quarter";
	}
	
}
