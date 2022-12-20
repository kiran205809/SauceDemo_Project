package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HomeSteps {
	
	WebDriver driver = BaseClass.driver;
	
	@When("I click on Sauce Labs Backpack product")
	public void i_click_on_Sauce_Labs_Backpack_product() throws InterruptedException {
		
		WebElement product = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		product.click();
		
		Thread.sleep(1000);
		
	    	}

	@Then("should total price as {string}")
	public void should_total_price_as(String price) {
	    
		
		WebElement prize = driver.findElement(By.xpath("//div[text()='29.99']"));
		String ExpectedPrice =prize.getText();
		System.out.println(ExpectedPrice);
		
		
		Assert.assertEquals(price,ExpectedPrice);
		
	}
		
		
		
	    
	}
	
	


