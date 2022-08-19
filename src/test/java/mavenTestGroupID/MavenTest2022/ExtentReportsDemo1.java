package mavenTestGroupID.MavenTest2022;
/*
 * 
 * extent not implemented yet
 */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtentReportsDemo1 {
	private WebDriver driver;
	private String baseURL;
	//private JavascriptExecutor js;

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\project_workspace_jars_2022\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//js = (JavascriptExecutor) driver;
		baseURL = "https://courses.letskodeit.com/practice";
		
		driver.manage().window().maximize();	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10, 1));
	}
	
	@Test
	public void test1_validLoginTest() throws InterruptedException {
		driver.get(baseURL);
		//  .//div[@id='navbar-inverse-collapse']/div//a[@href='/login']
		driver.findElement(By.xpath("//a[contains(@href,'/login')]")).click();
		
		driver.findElement(By.xpath("//div[@id='navbar-inverse-collapse']/div//a[@href='/login']")).click();
				
		driver.findElement(By.id("email")).sendKeys("test@email.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("abcabc");
		Thread.sleep(2000);
		
		/*
		 * WebElement goButton = driver.findElement(By.id(".//input[@value='Login']"));
		 * goButton.click(); 
		 */
		
		//hit the ENTER key instead of clicking the Login button
		//    //div[@id='page']/div[2]/div/div[@class='row']//div[@class='text-center zen-login']/form[@role='form']//input[@value='Login']
		driver.findElement(By.xpath(".//input[@value='Login']")).sendKeys(Keys.ENTER);
		//Thread.sleep(2000);
		
		
		// OR hit the tab key after entering the user name
		////driver.findElement(By.id("email")).sendKeys(Keys.TAB);
		////Thread.sleep(2000);
		
		////     //div[@id='page']/div[2]/div/div[@class='row']//div[@class='container enrolled-courses']//h1[@class='dynamic-heading']
		
		WebElement myCoursesText = driver.findElement(By.xpath(".//h1[@class='dynamic-heading']"));
		Assert.assertTrue(myCoursesText != null);
		System.out.println("LOGIN Successful");		
	}


	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	 

}

