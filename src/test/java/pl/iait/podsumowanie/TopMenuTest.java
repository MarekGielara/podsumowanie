package pl.iait.podsumowanie;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pl.iait.podsumowanie.*;

public class TopMenuTest extends Common
{

	@Test
	public void topMenu()
	{
			//String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
		goTOMainPage();
			//WebDriver driver = Init.getDriver();
			//Init.printScr(driver, "TopMenuTest", testName);
			//driver.findElement(By.linkText("About")).click();
		checkPageTitleAndStopTestIfWrong("Selenium - Web Browser Automation");
		linkClick("About");
		linkClick("Suport");
		linkClick("Dokumentation");
		linkClick("Download");
		linkClick("Projects");
		findInputByName("q").sendKeys("szukany tekst");
			//Init.printScr(driver, "TopMenuTest", testName);
			// Init.printScr(driver);
		driver.quit();

	}
	@Ignore
	@Test
	public void topMenu2()
	{
		WebDriver driver = Init.getDriver();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Support")).click();
		Init.printScr(driver);
		
		title = driver.getTitle();
			//String spodziewanyTytul = "jakis tytul";
		System.out.println(title);
		
		assertTrue("Page title is wrong!", title.equals("Getting Help"));
		
			//boolean czyTytul;
			//czyTytul = title.equals(spodziewanyTytul);
			//czyTytul = spodziewanyTytul.equals(title);
		
		driver.quit();

	}
	@Ignore
	@Test
	public void topMenu2wrongTitle()
	{
		WebDriver driver = Init.getDriver();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Support")).click();
		Init.printScr(driver);
		title = driver.getTitle();
			//String spodziewanyTytul = "jakis tytul";
		System.out.println(title);
		
		assertTrue("Page title is wrong!", title.equals("Some wrong page titlt"));
		
			//boolean czyTytul;
			//czyTytul = title.equals(spodziewanyTytul);
			//czyTytul = spodziewanyTytul.equals(title);
		
		driver.quit();

	}
}
