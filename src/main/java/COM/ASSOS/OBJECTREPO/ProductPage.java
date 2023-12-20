package COM.ASSOS.OBJECTREPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import COM.ASSOS.GENERIC.GestureUtility;
import io.appium.java_client.android.AndroidDriver;

public class ProductPage {
	AndroidDriver driver;
	
		
	@FindBy(xpath="//android.widget.TextView[@text='ASOS DESIGN relaxed pull on trouser in black with elasticated waist']")
	private WebElement ClickOnProduct;
	
	
	@FindBy(id="com.asos.app:id/selector_size_picker")
	private WebElement ClickOnSize;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='2XL - W40-42']")
	private WebElement ClickOnSizeList;
	
	@FindBy(xpath="//android.widget.Button[@text='ADD TO BAG']")
	private WebElement ClickOnAddToCart;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Jack & Jones tapered cuffed tech cargo in ice grey']")
	private WebElement selectProduct;
	
	
	public ProductPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}






	



	public WebElement getClickOnProduct() {
		return ClickOnProduct;
	}



	



	public AndroidDriver getDriver() {
		return driver;
	}










	public WebElement getSelectProduct() {
		return selectProduct;
	}










	public WebElement getClickOnSize() {
		return ClickOnSize;
	}



	public WebElement getClickOnSizeList() {
		return ClickOnSizeList;
	}



	public WebElement getClickOnAddToCart() {
		return ClickOnAddToCart;
	}
	
	
public void productPage(GestureUtility gutilis,String value,String value1)	{
	gutilis.scroll(value);
	ClickOnProduct.click();
	gutilis.scroll(value1);
	ClickOnSize.click();
	ClickOnSizeList.click();
	ClickOnAddToCart.click();
	

	
	
}
	
	
	
	

}
