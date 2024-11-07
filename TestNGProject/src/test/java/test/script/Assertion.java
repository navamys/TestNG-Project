package test.script;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion extends Base{
	
	@Test
	public void assertEqualsTest() {
		driver.navigate().to("https://www.browserstack.com/");
		String actualstring=driver.getTitle();
		System.out.println(actualstring);
		String expected= "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertEquals(actualstring, expected); 
	}
	@Test
	public void assertNotEqualsTest() {
		driver.navigate().to("https://www.browserstack.com/");
		String actualstring=driver.getTitle();
		System.out.println(actualstring);
		String expected= "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertNotEquals(actualstring, expected,"Not Matching");//print error message only during false case
	}
	@Test
	public void assertTrueTest() {
		driver.navigate().to("https://www.browserstack.com/");
		boolean title=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		//above line will compare gettitle() value and inside bracket value using method equalignorecase
		Assert.assertTrue(title,"Not Matching-"); //will get print only when its false
	}
	@Test
	public void assertFalseTest() {
		driver.navigate().to("https://www.browserstack.com/");
		boolean title=driver.getTitle().equalsIgnoreCase("ost Reliable App & Cross Browser Testing Platform | BrowserStack");
		Assert.assertFalse(title,"Not Matching-");
	}
}
