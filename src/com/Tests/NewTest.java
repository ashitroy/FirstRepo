package com.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.CommonFun.CommonFunctions;

public class NewTest extends CommonFunctions {
	
WebDriver driver;	
	
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  try {
	  driver.get(prop.getProperty("URL"));
	  driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("Swiggy");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("input[type='submit']")).click();
	  Thread.sleep(2000);
	  System.out.println("added line here");
	  System.out.println("Added by Ashit");
	System.out.println("Added by gitHub");

	  }
	  catch(Exception e) {
		  
		  System.out.println("message: "+e.getMessage());
	  }
  }
  
  @AfterClass
  public void AfterClassMethod() {
	  driver.quit();
	  
  }
  
  @BeforeClass
  public void BeforeClassMethod() {
	  
	  driver = Driver();
  }
  
}
