package COM.ASSOS.GENERIC;

import java.io.File;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import COM.ASSOS.OBJECTREPO.AddCartPage;
import COM.ASSOS.OBJECTREPO.HomePage;
import COM.ASSOS.OBJECTREPO.LoginPage;
import COM.ASSOS.OBJECTREPO.ProductPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseAppiumClass {
	
	
	AppiumDriverLocalService service;
	public AndroidDriver  driver;
	public DriverUtility dutils;
	public GestureUtility gutilis;
	public Fileutility futils=new Fileutility();
	
	public LoginPage  lp;
	public HomePage   hp;
	public ProductPage pp;
	public AddCartPage acp;
	
	public static AndroidDriver sdriver;
	
	
	
	
@BeforeSuite
public void startServer() {
	File f = new File(IConstantUtility.appiumServerPath);
	 service = new AppiumServiceBuilder().withAppiumJS(f)
	.withIPAddress(IConstantUtility.ipAddress).usingPort(IConstantUtility.port).withTimeout(Duration.ofSeconds(300)).build();
	service.start();
}
@BeforeClass
public void openApplication() throws Throwable
{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("platformName",futils.getCommonData("platformName"));
	dc.setCapability("deviceName",futils.getCommonData("deviceName")  );
	dc.setCapability("automationName",futils.getCommonData("automationName"));
			
	dc.setCapability("UDID",futils.getCommonData("UDID"));
	dc.setCapability("appPackage",futils.getCommonData("appPackage"));
	dc.setCapability("appActivity",futils.getCommonData("appActivity"));
	;
	//dc.setCapability("autoGrantPermissions", true);
	//dc.setCapability("ignoreHiddenApiPolicyError", true);
	//dc.setCapability("noReset", true);
	URL u=new URL("http://localhost:4723");
	 driver=new AndroidDriver(u,dc);
	 sdriver=driver;
	 dutils=new DriverUtility(driver);
	 gutilis=new GestureUtility(driver);
	
	 lp=new LoginPage(driver);
	 hp=new HomePage(driver);
	 pp=new ProductPage(driver);
	 acp=new AddCartPage(driver);
     
     
}

@BeforeMethod
public void setLogin() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	lp.loginsetup();
}


@AfterClass

public void closeApp() {
	//driver.quit();
}



@AfterSuite
public void stopServer() {
	//service.stop();
}





}
