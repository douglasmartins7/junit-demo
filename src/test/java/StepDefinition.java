import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class StepDefinition {

	private WebDriver driver;
	
	@Given("^I go to \"([^\"]*)\"$")
	public void i_go_to(String arg1)  {
	    System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("https://www.google.com/intl/pt_br/gmail/about/#");
	    
	}

	@Then("^I should be on \"([^\"]*)\" youtube page$")
	public void i_should_be_on_youtube_page(String tab) {
	     Assert.assertTrue(driver.getTitle().contains(tab));
	     driver.close();
	}
	
}
