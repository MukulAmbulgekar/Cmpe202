

public class GumballMachine {
  
	IGumballMachine soldOutState;
	IGumballMachine noHalfDollarState;
	IGumballMachine hasQuarterState;
	IGumballMachine soldState;
 
	IGumballMachine state = soldOutState;
	int balance=0;
	int count = 0;
	int cent_cost=0;
	int initial_count;
	int gumball_number=0;
	boolean isGumballinSlot=false;  //initially setting isGumballInSlot to false
	  
 
	public GumballMachine(int numberGumballs) 
	 {
	   
		soldOutState = new SoldOutState(this);
		noHalfDollarState = new NoHalfDollarState(this);
		hasQuarterState = new HasHalfDollarState(this);
		soldState = new SoldState(this); 
        
		this.initial_count=numberGumballs;  // storing intial gumballs available in machine
		this.count = numberGumballs;  // decreasing gumball count after each gumball is released.
		 this.isGumballinSlot=false;  // storing initial state of gumball slot. If gumball is available in slot then true else false
 		if (numberGumballs > 0) 
 		  {
			state = noHalfDollarState;  // If number of gumballs present are greater than zero then assigining initial state to half doller state.
		  } 
		else 
		  {
		  state=soldOutState; // if no gumballs assigning current state to sold out state
		  }
		
	  }
	
	public void setCost(int cent){
	   cent_cost+=cent;   // using this setCost method to store current balence in the gumball Machine
	   }
 
	public void insertQuarter() {
	   
		state.insertQuarter();    
	      }
	public void insertNickel() {
	    
		state.insertNickel();
	      }
	
	
	public void insertDime() {
	    	    
		state.insertDime();
	    }
 
	public void ejectQuarter() {
		state.ejectQuarter();
	    }
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
		
	    }
	public void dispense (){
	   state.dispense();
	    }

	void setState(IGumballMachine state) {
		this.state = state;
	    }
	
	public void takeGumballFromSlot() {
	    	    state.takeGumballFromSlot();    // This method is used whenever user will opt to take out gumballs from slot. 
		                                 //After calling this method user will get gumballs and change if available
		}
     
	public int getGumballNumber(){
	   return gumball_number;      // This method is used to display gumball number to user
	   }
	   
	public void setGumballNumber(int number){
	       gumball_number=number;
	   }
	void releaseBall() {
	    gumball_number+=1;
		System.out.println("A number "+gumball_number+" gumball comes rolling out the slot...");
		setCost(-50);  // whenever a gumball is released  cents are deducted from balence available in Gumball Machine

		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;  // To get number of gumballs remaining 
	}
	
	int getCost() {
		return cent_cost;  // To get remaining balence avaiable in Gumball.
	}
 
	void refill(int count) {
	    System.out.println("Gumball machine is refilled with "+count+" Gumball");
		this.count = count;  //refill method will refill balls in machine and will assign current state to noHalfDollar State
		state = noHalfDollarState;
	}

    public IGumballMachine getState() {
        return state;
    }

    public IGumballMachine getSoldOutState() {
        return soldOutState;
    }

    public IGumballMachine getNoHalfDollarState() {
        return noHalfDollarState;
    }

    public IGumballMachine getHasHalfDollarState() {
        return hasQuarterState;
    }

    public IGumballMachine getSoldState() {
        return soldState;
    }
 
    public boolean isGumballInSlot(){
         return state.isGumballInSlot();   //This method is used to check whether gumball is present in slot. 
                                           // It will return false if slot is empty and return true if ball is present in slot
    }
    
    public boolean get_GumballStatus() {
        return this.isGumballinSlot;
    }
     public void set_GumballStatus(boolean flag) {
        this.isGumballinSlot=flag;
    }
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nCurrent Gumballs in Machine:- "+ count);
		result.append("\n");
		result.append("Current balance in Gumball Machine is: " + cent_cost );
		result.append("\nMachine is " + state + "\n");
		
		return result.toString();
	}
}
