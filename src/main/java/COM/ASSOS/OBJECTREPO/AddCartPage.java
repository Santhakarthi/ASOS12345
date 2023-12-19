package COM.ASSOS.OBJECTREPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class AddCartPage {
AndroidDriver driver;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='GOOGLE']")
	private WebElement  ClickOnGoogle;
	
	@FindBy(xpath="(//android.view.View[@index='3'])[1]")
	private WebElement  ClickOnMail;

     @FindBy(id="com.asos.app:id/bag_fab")
private WebElement ClickOnViewAddToBag;





	public AddCartPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}





	public AndroidDriver getDriver() {
		return driver;
	}





	public WebElement getClickOnGoogle() {
		return ClickOnGoogle;
	}





	public WebElement getClickOnMail() {
		return ClickOnMail;
	}





	public WebElement getClickOnViewAddToBag() {
		return ClickOnViewAddToBag;
	}


	
	public void viewAddToCartPage() {
		ClickOnGoogle.click();
		ClickOnMail.click();
		ClickOnViewAddToBag.click();
	}
	
	
}
