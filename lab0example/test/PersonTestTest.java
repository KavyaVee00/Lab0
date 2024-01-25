/******
Name: Kavya Veeramony
Assignment: Lab 0
Date: 1/20/24
Notes: 
******/

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * JUnit test class for the Person class
 */
public class PersonTestTest {  

  private Person john;

  //No explicit default constructor needed for JUnit test class

 /**
  * Setting up the Person object for testing
  */
  @Before
  public void setUp() {

    john = new Person("John", "Doe", 1945);
  }

 
  /**
   * Test for getting the first name
   */
  @Test
  public void testFirst() {
    assertEquals("John", john.getFirstName());

  }
  
  /**
   * Test for getting the last name
   */
  @Test
  public void testSecond() {
    assertEquals("Doe", john.getLastName());
  }

  /**
   * Test for getting the year of birth
   */
  @Test
  public void testYearOfBirth() {
    assertEquals(1945, john.getYearOfBirth());
  }

}
