package testcases;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class GoogleSearchTest extends PageObject {

	@Managed(driver = "appium")
	WebDriver appium;

	@Test
	public void googleSearchTest() {

		open();
		find(By.xpath("//input[@name = 'q']")).typeAndEnter("Appium");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.getMessage();
		}

		/*
		 * List<MobileElement> searchResults =
		 * find(By.xpath("//div[@class = 'V7Sr0 p5AXld gsrt PpBGzd YcUVQe']"));
		 * Iterator<MobileElement> it = searchResults.iterator();
		 * 
		 * while (it.hasNext()) { System.out.println("Search Result: {" + it.next() +
		 * "} || href : {" +
		 * it.next().findElement(By.xpath("//parent::div/parent::a")).getAttribute(
		 * "href") + "}"); }
		 */
	}

}
