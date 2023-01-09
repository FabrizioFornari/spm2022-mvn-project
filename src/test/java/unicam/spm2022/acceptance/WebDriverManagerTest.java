package unicam.spm2022.acceptance;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

class WebDriverManagerTest {

	
	
	static WebDriver driver;
	public String baseUrl = "http://pros.unicam.it/";

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
  
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	@Test
	@Disabled
	@Tag("AcceptanceTest")
	void testMyGitHubAction() {
		  driver.get(baseUrl);
	      System.out.println("Title is: "+driver.getTitle());
	      assertTrue(driver.getTitle().contains("PROS"));
	}
	
	@Test
	@Tag("AcceptanceTest")
	@Disabled
	void checkThisWebAppTitle() throws InterruptedException {
		/*WebDriverManager.chromedriver().setup();
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--headless");
	    driver = new ChromeDriver(options);*/	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://localhost:8080/spm2022/");

		Thread.sleep(3000);
		
		String at = driver.getTitle();
		String et = "SPM 2022";
		
		//System.out.println(at);		
		Thread.sleep(4000);

		Assert.assertEquals(et,at);
		
		
	}
	
	@Test
	@Disabled
	  public void rP1() {
	    driver.get("https://pros.unicam.it:4200/index?returnUrl=%2Fhome");
	    driver.manage().window().setSize(new Dimension(2560, 1415));
	    driver.findElement(By.cssSelector(".navbar-nav:nth-child(1) > .nav-item:nth-child(1) > .nav-link")).click();
	    driver.findElement(By.cssSelector(".row:nth-child(3) > .col-lg-6:nth-child(1) .ng-star-inserted:nth-child(3) .mat-icon:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".btn:nth-child(2)"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".btn:nth-child(1)"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".btn:nth-child(3)")).click();
	    driver.findElement(By.cssSelector(".card-icon > .material-icons")).click();
	    driver.findElement(By.cssSelector(".nav-item:nth-child(2) p")).click();
	    driver.findElement(By.cssSelector(".ng-star-inserted:nth-child(1) p")).click();
	  }

	
}
