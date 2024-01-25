/******
Name: Kavya Veeramony
Assignment: Lab 0
Date: 1/20/24
Notes: 
******/

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * A JUnit test class for the Book class.
 */
public class BookTestTest {   
	/**
     * Default constructor.
     */
	private Book HarryPotter;

	/**
     * A JUnit test class for the Book class.
     */
	
	  @Before
	  public void setUp() {
        
		Person jkrowling = new Person("J.K", "Rowling", 1945);
	    HarryPotter = new Book("HarryPotter", jkrowling, 20f);
	  }
	 
	  /**
		 * Testing for Title
		 */
		
	@Test
	public void testFirst() {
		assertEquals("HarryPotter", HarryPotter.getTitle()); 
	
	}
	
	/**
	 * Testing for Author
	 */
	
	@Test 
	public void testSecond() { 
		assertEquals("J.K Rowling", HarryPotter.getAuthor().getFirstName() + " " + HarryPotter.getAuthor().getLastName()); 
	}
	
	/**
	 * Testing for Price
	 */
	
	@Test 
	public void testThird() { 
		assertEquals(20f , HarryPotter.getPrice(), 0.0);  
	}
}
