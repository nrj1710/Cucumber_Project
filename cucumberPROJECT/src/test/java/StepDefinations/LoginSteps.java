package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	WebElement user;
	WebElement pass;
	
	@And("enter The Url")
	public void userenterurl() {
		driver.get("https://practice.expandtesting.com/login");
		
	}
	@When("User enter the valid username and password")
	public void enteruserpass() {
		driver.findElement(By.name("username")).sendKeys("practice");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	}
    @Then("user should be redirect to the logout page")
    public void varifylogoutpage() {
    
    	Assert.assertEquals("Test Automation Practice: Working with Secure Page",driver.getTitle());
    	
    }
    @And("click on login button")
    public void clicklogin() {
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	
    }
    @Given("Open the chrome Browser")
    public void openbrowser() {
    	driver=new ChromeDriver();
    	
    }
    @Then ("close the chrome Browser")
    public void teardown() {
    	driver.close();
    }
    @And("enter The Url(String)")
    public void enterUrl(String Url) {
    	driver.get(Url);
    	
    }
    @When ("User enter the invalid username(String) and password(String)")
    public void invalididpass(String user,String pass) {
    driver.findElement(By.name("username")).sendKeys(user);
    driver.findElement(By.id("password")).sendKeys("pass");
    throw new io.cucumber.java.PendingException();
    }
    
    @Then("user should be redirect to the login page{string}")
    
    public void redirecttologintpage(String title) {
    	Assert.assertEquals(title,driver.getTitle());
    }
    @Given("enter The Url {string}")
    public void enter_the_url(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enter the valid username\"xxx\" and password {string}")
    public void user_enter_the_valid_username_xxx_and_password(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
