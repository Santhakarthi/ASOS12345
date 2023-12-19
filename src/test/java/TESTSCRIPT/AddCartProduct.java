package TESTSCRIPT;

import org.testng.Assert;
import org.testng.annotations.Test;

import COM.ASSOS.GENERIC.BaseAppiumClass;
import io.appium.java_client.AppiumBy;

public class AddCartProduct extends BaseAppiumClass  {
@Test
	public void addCartPage() throws Throwable {
//	File f = new File("C:\\Users\\Karthikeyan V.H\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
//	AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
//		service.start();
//DesiredCapabilities dc=new DesiredCapabilities();
//		dc.setCapability("platformName","Android");
//		dc.setCapability("deviceName", "RedmiNote 9ProMax" );
//		dc.setCapability("automationName","UiAutomator2");
//		dc.setCapability("UDID","88068908");
//		dc.setCapability("appPackage","com.asos.app");
//		dc.setCapability("appActivity","com.asos.app.aliases.ExternalDeeplinkAlias");
//		//dc.setCapability("autoGrantPermissions", true);
//		//dc.setCapability("ignoreHiddenApiPolicyError", true);
//		//dc.setCapability("noReset", true);
//		URL u=new URL("http://localhost:4723");
//		AndroidDriver driver=new AndroidDriver(u,dc);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//      driver.findElement(AppiumBy.id("com.asos.app:id/splash_floor_men")).click();
//        driver.findElement(AppiumBy.id("com.asos.app:id/dismiss_on_boarding_button")).click();
//        driver.findElement(AppiumBy.id("android:id/button2")).click();
	
	      hp.loginsetup(gutilis,"MODERN STAPLES");
	      pp.productPage(gutilis, "ASOS DESIGN relaxed pull on trouser in black with elasticated waist", "SIZE");
	      acp.viewAddToCartPage();
	
	
	

	
	
//        driver.findElement(AppiumBy.androidUIAutomator ("new UiScrollable(new UiSelector()).scrollIntoView(text(\"MODERN STAPLES\"));"));
//        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='MODERN STAPLES']")).click();
	
	
	
//        driver.findElement(AppiumBy.androidUIAutomator ("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ASOS DESIGN relaxed pull on trouser in black with elasticated waist\"));"));
//        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='ASOS DESIGN relaxed pull on trouser in black with elasticated waist']")).click();
//        driver.findElement(AppiumBy.androidUIAutomator ("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SIZE\"));"));
//        driver.findElement(AppiumBy.id("com.asos.app:id/selector_size_picker")).click();
//        driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='2XL - W40-42']")).click();
	
	
	//        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='ADD TO BAG']")).click();
//        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='GOOGLE']")).click();
//        driver.findElement(AppiumBy.xpath("(//android.view.View[@index='3'])[1]")).click();
//        driver.findElement(AppiumBy.id("com.asos.app:id/bag_fab")).click();
	      
	      
	      String actual=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='ASOS DESIGN relaxed pull on trouser in black with elasticated waist']")).getText();
	      String expected="ASOS DESIGN relaxed pull on trouser in black with elasticated waist";
	      Assert.assertEquals(actual, expected, expected);
	      
	      
	      
        
	}
	
}
