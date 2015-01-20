

public class SoldState implements IGumballMachine {
 
    GumballMachine gumballMachine;
        int change;
//        boolean flag=false;
 
    public SoldState(GumballMachine gumballMachine) {
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
        System.out.println("Sorry, you already turned the crank");
    }
    
    public void ejectNickel() {
        System.out.println("Sorry, you already turned the crank");
    }
    public void ejectDime() {
        System.out.println("Sorry, you already turned the crank");
    } 
 
    public void turnCrank() {
        if (gumballMachine.getCount() <=0) {
             gumballMachine.setState(gumballMachine.getSoldOutState());
        } 
        
         if (gumballMachine.getCount() >0 && gumballMachine.getCost()>=50 && gumballMachine.get_GumballStatus()==true){
                        System.out.println("You turned...with "+ gumballMachine.getCost()+" cents");
                        gumballMachine.releaseBall();
                        gumballMachine.set_GumballStatus(true);
            
            }
            
        else if (gumballMachine.getCount() >0 && gumballMachine.getCost()<50 && gumballMachine.get_GumballStatus()==true){
                        System.out.println("You turned crank but inserted only "+ gumballMachine.getCost()+ " cents, Insert "+
                                            (50 - gumballMachine.getCost()) +" cents more to get Gumball");
            }
    }
  
    public void dispense() {
        

      
         if (gumballMachine.getCount() >0 && gumballMachine.getCost()>=50 && gumballMachine.get_GumballStatus()==false){
                       gumballMachine.releaseBall(); 
                       gumballMachine.set_GumballStatus(true);
            }
            
        else if(gumballMachine.getCount() >0 && gumballMachine.getCost()<50 && gumballMachine.get_GumballStatus()==false) {
                       System.out.println("You turned crank but inserted only "+ gumballMachine.getCost()+ " cents, Insert "+ (50 - gumballMachine.getCost()) +" cents more to get Gumball");
            }
          if (gumballMachine.getCount() <=0) {
                      gumballMachine.setState(gumballMachine.getSoldOutState());
                      gumballMachine.set_GumballStatus(false);
    
           } 
    }
    
    
    public void takeGumballFromSlot() {
                     
                      if (gumballMachine.getCount() >0 ) 
                           {
                               //if number of balls > 0 , after releasing ball returning change to user and state=NoHalfDollarState
                              System.out.println("Ohh...you are picking gumballs from slot");
                              System.out.println("Please collect your:- "+gumballMachine.getGumballNumber()+ " Gumballs from slot" );
               
                      if (gumballMachine.getCost()>0) {
                            
                              System.out.println("Also please collect your change "+ gumballMachine.getCost() + " Cents");
                           }
                    gumballMachine.setGumballNumber(0); 
                    gumballMachine.set_GumballStatus(false);
                    gumballMachine.setState(gumballMachine.getNoHalfDollarState());
                    gumballMachine.setCost(-gumballMachine.getCost() );
}
else {
    // if balls <=0 then setting state =SoldOutState
    if (gumballMachine.getCost()>0)
        {
                    
                    System.out.println("Please collect your:- "+gumballMachine.getGumballNumber()+ " Gumballs from slot");
                    System.out.println("Ooops Now Machine is out of Gumballs");
                    System.out.println("Gumball machine is returning your change:- "+ gumballMachine.getCost() + " Cents");
                
        }
        
                   gumballMachine.set_GumballStatus(false);
                   gumballMachine.setGumballNumber(0);
                   gumballMachine.setState(gumballMachine.getSoldOutState());
     }
        
        
    }
       public boolean isGumballInSlot(){
        return gumballMachine.get_GumballStatus();
      }
 
    public String toString() {
        return "dispensing a gumball";
    }
}


