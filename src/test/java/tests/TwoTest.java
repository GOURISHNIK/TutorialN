package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import resources.Base;

public class TwoTest extends Base{
	@Test
	public void twoTest() throws InterruptedException {
		System.out.println("this is twoTest");
		Thread.sleep(1000);
		
	}
	
	/*
	@BeforeMethod
	public void setup() throws IOException {
		
		driver = initializeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	*/

}
