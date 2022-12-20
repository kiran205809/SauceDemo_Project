package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginSteps {

	WebDriver driver = BaseClass.driver;
	
	@Given("I have opened the application in browser")
	public void i_have_opened_the_application_in_browser() throws InterruptedException {
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(1000);
		
	    
	}

	@When("i provide {string} and {string}")
	public void i_provide_and(String username, String password) {
	    
		WebElement UN = driver.findElement(By.xpath("//input[@name='user-name']"));
		UN.sendKeys(username);
		
		WebElement PW = driver.findElement(By.xpath("//input[@name='password']"));
		PW.sendKeys(password);
		
		
	}

	@When("when i click on Login button")
	public void when_i_click_on_Login_button() {
		
		WebElement button = driver.findElement(By.xpath("//input[@id='login-button']"));
		button.click();
	    
	}

	@Then("i should be navigate to home page")
	public void i_should_be_navigate_to_home_page() {
		
		System.out.println("Inside the HomePage");
	    
	}
	
	@Then("i should get a error message as {string}")
	public void i_should_get_a_error_message_as(String ActualError) {
		
		WebElement error = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		
		String ExpectedError = error.getText();
		
		Assert.assertEquals(ActualError, ExpectedError);
		
	    
	}
	
}
