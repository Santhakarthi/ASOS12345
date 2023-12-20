package TESTSCRIPT;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import COM.ASSOS.GENERIC.BaseAppiumClass;
import COM.ASSOS.OBJECTREPO.AddCartPage;
import COM.ASSOS.OBJECTREPO.HomePage;
import COM.ASSOS.OBJECTREPO.ProductPage;
import io.appium.java_client.AppiumBy;

public class AddProduct extends BaseAppiumClass{

	@Test
	public void addProduct() throws Throwable {
		new HomePage(driver);
		hp.getClickOnNewInLink().click();;
		hp.getClickOnClothing().click();
		new ProductPage(driver);
		pp.getSelectProduct().click();
		gutilis.scroll("SIZE");
		pp.getClickOnSize();
		pp.getClickOnAddToCart();
		new AddCartPage(driver);
		acp.getClickOnGoogle();
//		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='NEW IN']")).click();
//		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Clothing']")).click();
//		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Jack & Jones tapered cuffed tech cargo in ice grey']")).click();
//		gutilis.scroll("SIZE");
//		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"M - W34\"]")).click();
//		Thread.sleep(3000);
//		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Add to bag\"]/android.widget.Button")).click();
//		driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"google GOOGLE\"]")).click();
//		driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Prasad Jodu prasadjodu12@gmail.com\"]")).click();
//		driver.findElement(AppiumBy.id("com.asos.app:id/bag_fab")).click();
//		String expectedText = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Jack & Jones tapered cuffed tech cargo in ice grey']")).getText();
//		String actualText = "Jack & Jones tapered cuffed tech cargo in ice grey";
//		assertEquals(expectedText, actualText);
//		System.out.println("Product added successfully to the Cart");
	}
}
