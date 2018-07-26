package Base;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Util.Util;
import junit.framework.Assert;

public class BaseClass {

	WebDriver driver;
	public void initialisation() throws InterruptedException
	{
		String exepath = "\\C:\\Meera\\chrome driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exepath);
		driver = new ChromeDriver();				
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}
	
	public void searchcars() throws InterruptedException
	{
		driver.findElement(By.id("lst-ib")).sendKeys("cars in london \n");
		WebElement element = driver.findElement(By.name("btnK"));		
		Thread.sleep(3000);
		element.submit();
		Thread.sleep(1000);
	}
	
	public void validatelinks() throws InterruptedException
	{
		List<WebElement> elements = driver.findElements(By.partialLinkText("Gumtree"));		
		System.out.println("Total Gumtree links on first page is = " +elements.size());
	}
	
	public void varifytitle1() throws InterruptedException
	{
		List<WebElement> elements = driver.findElements(By.partialLinkText("Gumtree"));			
		Util.cleanandRebuild(elements.get(0)).click();
		String title1 = driver.getTitle();
		System.out.println("Title of first link is - " + title1);
		Assert.assertEquals("Used Cars for sale in London - Gumtree", title1);
		Thread.sleep(10);
		driver.navigate().back();
	}
	
	public void varifytitle2() throws InterruptedException
	{
		List<WebElement> elements = driver.findElements(By.partialLinkText("Gumtree"));			
		Util.cleanandRebuild(elements.get(1)).click();
		String title2 = driver.getTitle();
		System.out.println("Title of first link is - " + title2);
		Assert.assertEquals("Used Cars for sale in London | Page 2/50 - Gumtree", title2);
		Thread.sleep(10);
		driver.quit();
	}
	
}
