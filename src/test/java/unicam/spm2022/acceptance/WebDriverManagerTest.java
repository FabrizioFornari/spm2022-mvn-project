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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
		WebDriverManager.chromedriver().setup();
	    ChromeOptions options = new ChromeOptions();
	    driver = new ChromeDriver(options);	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
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
	//@Disabled
	void checkThisWebAppTitle() throws InterruptedException {
		
		driver.get("http://localhost:8080/spm2022/");

		Thread.sleep(3000);
		
		String at = driver.getTitle();
		String et = "SPM 2022";
		
		//System.out.println(at);		
		Thread.sleep(4000);

		Assert.assertEquals(et,at);
		
		
	}

	
}
