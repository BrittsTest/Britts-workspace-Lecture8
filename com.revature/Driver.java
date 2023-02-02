import java.util.Scanner;
public class Driver{
//Test
    //JUnit Testing
    /* 
    JUnit is a library that provides functionality for Unit testing. 
        - A unit test is a test we perform to ensure that a small piece of our code (usually a
        a single method) is working as expected.

    JUnit uses annotation to define its test functionalities
        -@Test: Labels a method as a test method
        -@BeforeClass: declares method to be run before your test as whole are run. 
        -@Before: declares methods that will run once before every single test is run.
        -@After: declares methods that run once after each test.
        -@AfterClass: declares methods that run once after all your tests have completed. 

    JUnit does have methods that test the actual functionality of your code. Such as:
        - assertTrue() - tests that the result of the tested method is True.
        - assertFalse() - test that the result of the tested method is False.
        - assertEquals() - tests that a result return a particular value. 
        - assertNotEquals()- tests that a result doesn not return a value that is differnt 
        than the given value
        - assertThat() - general assertion

    @Test
    public void testAddMethod(){
        System.out.println("Testing add()");
        result = someObject.add(a, b);
        //check against the result we want.
        //if somevalue matches a specified value I am going to say 15 then I want to return
        true else the test should false.
        assertTrue(result == 15);
    }

    Test Driven Development (TDD):
        - Its a development process where software developers first build their test, and then build
        out code to meet those tests. 
        - Why is it useful - It's useful to conceptually design a project beform implementation. 
            - Write a unit test
            - run the test to ensure it fails. 
            - "Fix" the test by writing the application code. 
            - Retest until the test passes.
            - Passes
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Timer time = new Timer();
        time.intro(sc);
    }


}