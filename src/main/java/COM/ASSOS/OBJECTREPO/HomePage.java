package COM.ASSOS.OBJECTREPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import COM.ASSOS.GENERIC.GestureUtility;
import io.appium.java_client.android.AndroidDriver;

public class HomePage {

	
	AndroidDriver driver;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='MODERN STAPLES']")
	private WebElement  ClickOnModernStaples;
	








	public HomePage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}








	public WebElement getClickOnModernStaples() {
		return ClickOnModernStaples;
	}




	public void loginsetup(GestureUtility gutilis,String value) {
		gutilis.scroll(value);
		ClickOnModernStaples.click();
		
		
	}


}
