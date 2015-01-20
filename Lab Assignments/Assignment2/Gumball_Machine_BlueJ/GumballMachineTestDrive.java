

public class GumballMachineTestDrive {

    public static void main(String[] args) {
       
 GumballMachine gm_case3 = new GumballMachine(5);
     GumballMachine gm_case2 = new GumballMachine(4);
       System.out.println(gm_case2);
       gm_case2.insertQuarter();
       gm_case2.insertQuarter();
       gm_case2.turnCrank();
//       assertEquals(true, gm_case2.isGumballInSlot());
       gm_case2.insertQuarter();
       gm_case2.insertDime();
       gm_case2.insertDime();
       gm_case2.insertNickel();
       gm_case2.insertNickel();
       gm_case2.turnCrank();
  //     assertEquals(true, gm_case2.isGumballInSlot());
       gm_case2.takeGumballFromSlot();
    //   assertEquals(false, gm_case2.isGumballInSlot());
         
  }
}
