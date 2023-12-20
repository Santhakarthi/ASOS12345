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
	
    @FindBy(xpath = "//android.widget.TextView[@text='NEW IN']")
    private WebElement clickOnNewInLink;

    @FindBy(xpath = "//android.widget.TextView[@text='Clothing']")
    private WebElement clickOnClothing;






	public AndroidDriver getDriver() {
		return driver;
	}








	public WebElement getClickOnNewInLink() {
		return clickOnNewInLink;
	}








	public WebElement getClickOnClothing() {
		return clickOnClothing;
	}








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
