

public interface IGumballMachine
 {
 
	public void insertQuarter();
	public void insertDime();
	public void insertNickel();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
	public boolean isGumballInSlot(); 
	public void takeGumballFromSlot();
}
