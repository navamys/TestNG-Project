package test.script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Robotclass extends Base {
	@Test
	public void robotClass() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectpdf=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectpdf.click();
		StringSelection stringselection =new StringSelection("C:\\Users\\Navamy\\Downloads\\dummy-pdf.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null); //line for copy path to clipboard
		Robot robot=new Robot();
		robot.delay(2500);  //increase delay like 2500 if wont work
		/*robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER); */ //no need of these two lines
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); //paste ctrl+v 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
