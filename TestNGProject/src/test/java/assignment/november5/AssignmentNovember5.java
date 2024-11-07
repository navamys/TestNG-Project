package assignment.november5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import test.script.Base;
import test.script.JavascriptExecuter;

public class AssignmentNovember5 extends Base {
	@Test
	public void radiobutton() {
		driver.navigate().to("https://demos.jquerymobile.com/1.4.5/checkboxradio-radio/");
		WebElement one=driver.findElement(By.xpath("//input[@id='radio-choice-0a']"));
		//one.click(); //this usual click wont work due to need of wait, so use js executer for click
		//javascript executer use:
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",one);
		
		
	}
	@Test
	public void checkbox() {
		driver.navigate().to("https://formstone.it/components/checkbox/");
		WebElement four=driver.findElement(By.xpath("//input[@id='checkbox-4']"));
		//four.click(); //this usual click wont work due to need of wait, so use js executer for click
		//javascript use:
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",four);
		
		

	}
	@Test
	public void dropdown() {
		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement selectcountry=driver.findElement(By.tagName("select")); 
		Select select=new Select(selectcountry); 
		select.selectByIndex(1); 
		
	}
	@Test
	public void alertPopup() {
		driver.navigate().to("https://vinothqaacademy.com/alert-and-popup/");
		WebElement alertbox=driver.findElement(By.xpath("//button[@name='alertbox']"));
		//alertbox.click(); //usual click wont work, hence used js
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",alertbox);
		driver.switchTo().alert().accept();
	}
}
