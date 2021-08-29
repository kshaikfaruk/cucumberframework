package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {

@Given("navigate to url")
public void navigate_to_url() {
	   WebDriverManager.chromedriver().setup();
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.google.com");
}

}
