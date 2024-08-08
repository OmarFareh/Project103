import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwagLab {
	
String web = "https://www.google.com/";
WebDriver driver = new ChromeDriver(); 	
String search = "Youtube";
int x = 26;

@BeforeTest	
	
public void MySetup () {
	
	driver.get(web);
	driver.manage().window().maximize();
	
	
}
	
	
	
@Test

public void Login () {
	
	
	driver.findElement(By.id("APjFqb")).sendKeys(search+Keys.ENTER);;
	driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3/span")).click();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	
	
	
	
	
	
	
	/*driver.findElement(By.id("user-name")).sendKeys(username);;
	driver.findElement(By.id("password")).sendKeys(password);;
	driver.findElement(By.id("login-button")).click();;
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();;
	
	// we added the product name using xpath then we created a variable for the item name so we can print when its added 
    String ItemName = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
	System.out.println(ItemName+" Has been added");
	
	  	
		 String ItemPrice = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();
			  
		System.out.println("The price is : "+ItemPrice);*/
	
}

}
