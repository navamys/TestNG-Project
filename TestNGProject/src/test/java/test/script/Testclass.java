package test.script;
import org.testng.annotations.Test;

public class Testclass {
	@Test(priority=2)
	public void test1() {
		System.out.println("printing test1");
	}
	@Test(priority=1)
	public void test2() {
		System.out.println("printing test2");
	}
	@Test(priority=3)
	public void test3() {
		System.out.println("printing test3");
	}
}
