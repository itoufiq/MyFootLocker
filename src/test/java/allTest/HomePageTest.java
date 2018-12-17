package allTest;

import java.security.cert.CRLReason;

import org.testng.annotations.Test;

import allPages.CreateAnAccountPage;
import allPages.HomePage;
import allPages.MembershipPage;
import utilities.BaseTest;
import utilities.MyDataProvider;

public class HomePageTest extends BaseTest{
	HomePage homePage;
	MembershipPage membershipPage;
	CreateAnAccountPage createAnAccountPage;
	@Test
	public void goToVIPMembership() {
		homePage = new HomePage(dr);
		
		membershipPage = homePage.clickOnVIPMemberLink().get(); // .get will work after we override the LoadableComponent class
		createAnAccountPage = membershipPage.clickOnCreateAnAccountBtn().get();
	}
	
	@Test(dataProvider="createAnAccount", dataProviderClass=MyDataProvider.class)
	public void createAVIPAccount(String frstnm, String lstnm,String eml,String psswrd ) {
		
		createAnAccountPage.createAnAccount(frstnm, lstnm, eml, psswrd);
		
	}

}
