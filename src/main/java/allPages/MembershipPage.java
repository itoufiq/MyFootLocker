package allPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

// LoadableComponent CLASS IS AN ABSTRUCT CLASS WHIC HAS 2 UNIMPLEMENTED METHOD
public class MembershipPage extends LoadableComponent<MembershipPage>{
	WebDriver dr;
	@FindBy(xpath="//a[text()='Create an Account']") WebElement CreateAnAccountBtn;
	
	public MembershipPage (WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this); // initElements is the overrided method from PageFactory class
	}

	@Override
	protected void isLoaded() throws Error {
		Assert.assertEquals("https://www.footlocker.com/vip.html", "https://www.footlocker.com/vip.html"); // compare the actual url with expected url 
		
	}

	@Override
	protected void load() {
		dr.navigate().to("https://www.footlocker.com/vip.html");// this is my expected url
	}
	
	public CreateAnAccountPage clickOnCreateAnAccountBtn() {
		CreateAnAccountBtn.click();
		return new CreateAnAccountPage(dr);
	}
	
	

}
