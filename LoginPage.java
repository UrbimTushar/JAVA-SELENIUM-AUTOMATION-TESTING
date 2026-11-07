import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage 
 { 
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/urbim/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	driver.findElement(By.name("inputPassword")).sendKeys("hello123");
	driver.findElement(By.className("signInBtn")).click();
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("jhon");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jhon@gmail.com");
	driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9876765354");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	driver.findElement(By.cssSelector(".go-to-login-btn")).click();
	driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
	Thread.sleep(2000);
	driver.findElement(By.id("chkboxOne")).click();
	driver.findElement(By.name("chkboxTwo")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		
		
		
	}
	
}
