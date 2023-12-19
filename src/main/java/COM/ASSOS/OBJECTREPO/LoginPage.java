package COM.ASSOS.OBJECTREPO;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




import io.appium.java_client.android.AndroidDriver;



public class LoginPage {
AndroidDriver driver;
@FindBy(id="com.asos.app:id/splash_floor_men")
private WebElement ClickOnMenButton;

@FindBy(id="com.asos.app:id/dismiss_on_boarding_button")
private WebElement OkButton;

@FindBy(id="android:id/button2")
private WebElement NOThanks;


public LoginPage(AndroidDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getClickOnMenButton() {
	return ClickOnMenButton;
}

public WebElement getOkButton() {
	return OkButton;
}

public WebElement getNOThanks() {
	return NOThanks;
}

public void loginsetup() {
	ClickOnMenButton.click();
	OkButton.click();
	NOThanks.click();
}

}
