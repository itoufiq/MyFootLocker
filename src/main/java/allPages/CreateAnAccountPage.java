package allPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

public class CreateAnAccountPage extends LoadableComponent<CreateAnAccountPage> {
	WebDriver dr;
	@FindBy(xpath="//input[@id='input_firstName']") WebElement firstName;
	@FindBy(xpath="//input[@id='input_lastName']") WebElement lastName;
	@FindBy(xpath="//input[@id='input_uid']") WebElement email;
	@FindBy(xpath="//input[@id='input_password']") WebElement password;
	@FindBy(xpath="//input[@id='input_dateofbirthmonth']") WebElement mm;
	@FindBy(xpath="//input[@id='input_dateofbirthday']") WebElement dd;
	@FindBy(xpath="//input[@id='input_dateofbirthyear']") WebElement yyyy;
	@FindBy(xpath="//span[@class='c-form-label-content']/p[text"
			+ "()='Become a Locker VIP (free to join)']") WebElement becomeRadioBtn;
	@FindBy(xpath="//span[@class='c-form-label-content']/"
			+ "p[text()='Signed up in a Locker store? Link my VIP numbers']") WebElement signedInRadioBtn;
	@FindBy(xpath="//span[@class='c-form-label-content']/p[text"
			+ "()='Skip VIP rewards at this time']") WebElement skipRadioBtn;
	
	
	
	
	public CreateAnAccountPage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
		
	}
	@Override
	protected void isLoaded() throws Error {
	Assert.assertEquals("https://www.footlocker.com/account/create", "https://www.footlocker.com/account/create");	
		
	}
	@Override
	protected void load() {
		dr.navigate().to("https://www.footlocker.com/account/create");
		
		
	}
	
	public void createAnAccount(String frstnm, String lstnm,String eml,String psswrd ) {
		firstName.sendKeys(frstnm);
		lastName.sendKeys(lstnm);
		email.sendKeys(eml);
		password.sendKeys(psswrd);
		becomeRadioBtn.click();
		
		
	}
	

}
