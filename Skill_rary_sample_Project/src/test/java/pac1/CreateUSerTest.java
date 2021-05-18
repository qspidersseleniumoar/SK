package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateUSerTest {

	@Test(groups = "smokeTest")
	public void createUSerTest() {
		
		System.out.println("execute Create USer");
		
		   String URL = System.getProperty("url");		
		   String BROWSER = System.getProperty("browser");	
		
              System.out.println("URL ===>"+URL);
              System.out.println("BROWSER ===>"+BROWSER);
              
              
	}

}
