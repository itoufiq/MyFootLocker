import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

	
	public static void main(String[] args) throws Throwable {
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Iftekher\\Downloads\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("https://www.levi.com");
		Thread.sleep(2000);
		dr.findElement(By.xpath("(//button[@data-dismiss='modal'])[7]")).click();
		dr.findElement(By.xpath("(//input[@name='text'])[1]")).sendKeys("Shirt", Keys.ENTER);
		
		Thread.sleep(3000);
		dr.findElement(By.xpath("//a[@id='price-facet-0']/span")).click();
//		List<WebElement> priceElement = dr.findElements(By.xpath("//ul[@data-facet-name='price']/li//a"));
//		System.out.println(priceElement.size());
//		priceElement.get(2).click();
//		
//		Actions action = new Actions(dr);
//		List<WebElement> we = dr.findElements(By.xpath("//ul[@data-facet-name='price']/li//a/span"));
//		
//		//action.moveToElement(we.get(2)).click().build().perform();
//		
//		for(int i=0; i<we.size();i++) {
//			System.out.println(we.get(i).getText());
//		}
		
		
		
		
		
		
	}
	
}
