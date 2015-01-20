import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GumballMachineTestCase
{
    public GumballMachineTestCase()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void testCase1()
    {
        GumballMachine gm_test1 = new GumballMachine(2);
        gm_test1.insertQuarter();
        gm_test1.insertQuarter();
        gm_test1.turnCrank();
        assertEquals(true, gm_test1.isGumballInSlot());
        gm_test1.insertDime();
        gm_test1.insertQuarter();
        gm_test1.insertNickel();
        gm_test1.insertQuarter();
        gm_test1.turnCrank();
        assertEquals(false, gm_test1.isGumballInSlot());
        gm_test1.takeGumballFromSlot();
        assertEquals(false, gm_test1.isGumballInSlot());
        gm_test1.insertQuarter();
        gm_test1.insertNickel(); 
        gm_test1.turnCrank();
        assertEquals(false, gm_test1.isGumballInSlot());
        gm_test1.takeGumballFromSlot();
    }

    @Test
    public void testCase2()
    {
        GumballMachine gm_test2 = new GumballMachine(3);
        gm_test2.insertQuarter();
        gm_test2.insertNickel();
        gm_test2.insertQuarter();
        gm_test2.insertQuarter();
        gm_test2.insertQuarter();
        gm_test2.turnCrank();
        assertEquals(true, gm_test2.isGumballInSlot());
        gm_test2.insertQuarter();
        gm_test2.insertQuarter();
        gm_test2.insertDime();
        gm_test2.turnCrank();
        assertEquals(true, gm_test2.isGumballInSlot());
        gm_test2.turnCrank();
        gm_test2.takeGumballFromSlot();
        assertEquals(false, gm_test2.isGumballInSlot());
        gm_test2.insertQuarter();
    
    }

    @Test
    public void testcase3()
    {
        GumballMachine gm_test3 = new GumballMachine(4);
        gm_test3.insertQuarter();
        gm_test3.insertNickel();
        gm_test3.insertDime();
        gm_test3.insertQuarter();
        gm_test3.turnCrank();
        assertEquals(true, gm_test3.isGumballInSlot());
        gm_test3.turnCrank();
        gm_test3.takeGumballFromSlot();
        assertEquals(false, gm_test3.isGumballInSlot());
    }

    @Test
    public void testcase4()
    {
        GumballMachine gm_test4 = new GumballMachine(5);
        gm_test4.insertNickel();
        gm_test4.insertDime();
        gm_test4.insertQuarter();
        gm_test4.turnCrank();
        assertEquals(false, gm_test4.isGumballInSlot());
        gm_test4.insertDime();
        gm_test4.turnCrank();
        assertEquals(true, gm_test4.isGumballInSlot());
        gm_test4.takeGumballFromSlot();
        assertEquals(false, gm_test4.isGumballInSlot());
    }

    @Test
    public void testcase5()
    {
         GumballMachine gm_test5 = new GumballMachine(4);
         System.out.println(gm_test5);
         gm_test5.insertQuarter();
         gm_test5.insertQuarter();
         gm_test5.insertDime();
         gm_test5.turnCrank();
         assertEquals(true, gm_test5.isGumballInSlot());
         gm_test5.insertQuarter();
         gm_test5.insertQuarter();
         gm_test5.insertNickel();
         gm_test5.turnCrank();
         assertEquals(true, gm_test5.isGumballInSlot());
         gm_test5.takeGumballFromSlot();
         assertEquals(false, gm_test5.isGumballInSlot());
         gm_test5.insertQuarter();
         gm_test5.insertDime();
         gm_test5.turnCrank();
         assertEquals(false, gm_test5.isGumballInSlot());
         gm_test5.insertQuarter();
         gm_test5.turnCrank();
         assertEquals(true, gm_test5.isGumballInSlot());
         gm_test5.takeGumballFromSlot();
         assertEquals(false, gm_test5.isGumballInSlot());
    }
    @Test
    public void testcase6(){
        
        GumballMachine gm_test6 = new GumballMachine(4);
        gm_test6.insertQuarter();
        gm_test6.insertQuarter();
        gm_test6.insertQuarter();
        gm_test6.turnCrank();  // @this turncrank user inserted total 75 cents, 
                            //one gumball is released and isGumballInSlot is true
        assertEquals(true, gm_test6.isGumballInSlot());
        gm_test6.insertNickel();
        gm_test6.turnCrank(); // @ this gumball machine has only 35(25+10) cents hence no gumball is released
                            // and isGumballInSlot is false
        gm_test6.takeGumballFromSlot();               
        assertEquals(false, gm_test6.isGumballInSlot());
}
@Test
  public void testcase7(){
        
        GumballMachine gm_test7 = new GumballMachine(4);
        gm_test7.insertQuarter();
        gm_test7.insertQuarter();
        gm_test7.insertQuarter();
        gm_test7.takeGumballFromSlot(); 
        assertEquals(false, gm_test7.isGumballInSlot());
        gm_test7.turnCrank();  // @this turncrank user inserted total 75 cents, 
                            //one gumball is released and isGumballInSlot is true
        assertEquals(true, gm_test7.isGumballInSlot());
        gm_test7.insertNickel();
        gm_test7.insertQuarter();
        gm_test7.turnCrank(); // @ this gumball machine has only 35(25+10) cents hence no gumball is released
        assertEquals(true, gm_test7.isGumballInSlot());                      // and isGumballInSlot is true
        gm_test7.takeGumballFromSlot();               
        assertEquals(false, gm_test7.isGumballInSlot());
}
    @Test
    public void Requirement1()
    {
        GumballMachine gm_case1 = new GumballMachine(5);
        gm_case1.insertQuarter();
        gm_case1.insertQuarter();
        gm_case1.insertNickel();
        gm_case1.insertDime();
        gm_case1.turnCrank();         //@This turnCrank gumball machine has 65 cents, gumball is released and isGumballInSlot is true 
        assertEquals(true, gm_case1.isGumballInSlot());
        gm_case1.takeGumballFromSlot();  // After picking gumballs from the slot , isGumballInSlot is false
        assertEquals(false, gm_case1.isGumballInSlot());
    }

    @Test
    public void Requirement2()
    {
        GumballMachine gm_case3 = new GumballMachine(5);
        gm_case3.insertQuarter();
        gm_case3.insertNickel();
        gm_case3.insertDime();
        gm_case3.turnCrank(); //@ This turnCrank gumball has 40 cents only hecne no gumball is released,
                             // isGumballInSlot in false
        assertEquals(false, gm_case3.isGumballInSlot());
        gm_case3.takeGumballFromSlot(); // Customer will get 40 cents back
         
    }

    @Test
    public void Requirement3()
    {
       GumballMachine gm_case2 = new GumballMachine(4);
       System.out.println(gm_case2);
       gm_case2.insertQuarter();
       gm_case2.insertQuarter();
       gm_case2.turnCrank();
       assertEquals(true, gm_case2.isGumballInSlot());
       gm_case2.insertQuarter();
       gm_case2.insertDime();
       gm_case2.insertDime();
       gm_case2.insertNickel();
       gm_case2.insertNickel();
       gm_case2.turnCrank();
       assertEquals(true, gm_case2.isGumballInSlot());
       gm_case2.takeGumballFromSlot();
       assertEquals(false, gm_case2.isGumballInSlot());
      
    }
}











