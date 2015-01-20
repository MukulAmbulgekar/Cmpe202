

public class SoldOutState implements IGumballMachine
 {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}
	
	public void insertNickel() {
		System.out.println("You can't insert a nickel, the machine is sold out");
	}
 
 public void insertDime() {
		System.out.println("You can't insert a dime, the machine is sold out");
	}
 
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}
	public void ejectNickel() {
		System.out.println("You can't eject, you haven't inserted a Nickel yet");
	}
	public void ejectDime() {
		System.out.println("You can't eject, you haven't inserted a Dime yet");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}
 
	public void dispense() {
		System.out.println("No gumball dispensed");
	}
	
	public void takeGumballFromSlot() {
		  
	    	    		if (gumballMachine.getCost()>0) {
	    	    		    System.out.println("Please collect your:-"+gumballMachine.getGumballNumber()+ " Gumballs from slot");
	    	    		    System.out.println("Ooops now Machine is out of Gumballs");
		                    System.out.println("Gumball Machine returning your change:- "+ gumballMachine.getCost() + " Cents");
				            gumballMachine.setGumballNumber(0);
                        }
                     else {
                        System.out.println("Machine is out of Gumballs,  you can't take out Gumball");
                          }
                     gumballMachine.setCost(-gumballMachine.getCost() );
		
	             }  
	
	   public boolean isGumballInSlot(){
        return gumballMachine.get_GumballStatus();
    }
 
	public String toString() {
		return "sold out";
	}
}
