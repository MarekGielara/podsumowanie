package pl.iait.podsumowanie;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Common
{
	static WebDriver driver;
	
	public static void goTOMainPage()
	{	
		System.out.println("Uruchamiam przeglądarkę");
		driver = Init.getDriver();
	}
	
	public static void linkClick(String linkText)
	{
		System.out.println("Klikam w link " + linkText);
		try
		{
			driver.findElement(By.linkText(linkText)).click();
		} catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Generuję printscreen z będem");
			Init.printScr(driver);
			assertTrue("Nie znalazłem linku: "
			+ linkText, false);
		}
	}
	
	public static void checkPageTitleAndStopTestIfWrong(String title) 
	
	{
		boolean checkStatus = driver.getTitle().equals(title);
		assertTrue("Tytuł strony jest nieprawidłowy", checkStatus);
		
	}
	
	public static WebElement findInputByName(String name)
	{
		return driver.findElement(By.name(name));
	}
}
