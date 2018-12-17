package allPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver dr;
	@FindBy(xpath = "//a[text()='Become a VIP Member Today']")
	WebElement VipMemberBtn;

	public HomePage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);

	}

	public MembershipPage clickOnVIPMemberLink() {
		VipMemberBtn.click();
		return new MembershipPage(dr); // example of Single Tone Pattern
	}
}
