package Util;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class Util {

	public static WebElement cleanandRebuild(WebElement element) {
		WebElement w1;
		try{
			w1 = (WebElement) element;
			w1.isDisplayed();
		}
		catch(StaleElementReferenceException ex)
		{
			w1 = null;
			cleanandRebuild(element);
		}
		return w1;	
		
	}
}
