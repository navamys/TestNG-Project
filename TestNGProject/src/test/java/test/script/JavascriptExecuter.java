package test.script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavascriptExecuter extends Base {

	@Test
	public void javaScriptExecuter() {
		driver.navigate().to("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver; //javascript so no need for new keyword
		 js.executeScript("window.scrollBy(0,150)", ""); //scrollBy is a method //method inside quotes as this is javascript method
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");//scroll to bottom, down through entire height
	}
	@Test
	public void clickDemoAsUsual() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement textfield= driver.findElement(By.xpath("//input[@id='single-input-field']"));
		textfield.sendKeys("Navamy");
		WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessage.click();		
	}
	@Test
	public void clickUsingJavaScript() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement textfield= driver.findElement(By.xpath("//input[@id='single-input-field']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Navamy';",textfield);//js.executeScript("arguments[0].value='value';",webelementname);
		WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		js.executeScript("arguments[0].click();",showmessage);//js.executeScript("arguments[0].click();",webeelement);
	}
}
