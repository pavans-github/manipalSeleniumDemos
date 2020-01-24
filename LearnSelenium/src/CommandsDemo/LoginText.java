package CommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginText {
	public static void main(String[]args){
		//System.setProperty("webdriver.gecko.driver", "E:\\selenium\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/Login");
	driver.manage().window().maximize();
	driver.findElement(By.name("Email")).sendKeys("pavan.kalluri1997@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("pavan1234");
	driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	//driver.findElement(By.xpath("//div[6]//div[1]//div[1]//a[1]//img[1]")).click();
	//driver.findElement(By.xpath("//input[@id='add-to-cart-button-74']")).click();
	//driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
	//driver.findElement(By.xpath("//option[contains(text(),'Iraq')]")).click();
	//driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
	//driver.findElement(By.xpath("//button[@id='checkout']")).click();
	//driver.findElement(By.xpath("//option[contains(text(),'pavan kumar kalluri, New door, Bangalor 560000, In')]")).click();
	//driver.findElement(By.xpath("//div[@id='billing-buttons-container']//input[@class='button-1 new-address-next-step-button']")).click();
	//driver.findElement(By.xpath("//input[@id='PickUpInStore']")).click();
	//driver.findElement(By.xpath("//div[@id='shipping-buttons-container']//input[@class='button-1 new-address-next-step-button']")).click();
	//driver.findElement(By.xpath("//input[@id='paymentmethod_0']")).click();
	//driver.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']")).click();
	//driver.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']")).click();	
	//driver.findElement(By.xpath("//input[@class='button-1 confirm-order-next-step-button']")).click();
	//	driver.findElement(By.xpath("//input[@class='button-2 order-completed-continue-button']")).click();
	//driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	
	
	//String actualname=driver.getTitle();
	//System.out.println(actualname);
	//String exceptedname = "DemoWebShop";
	//if(exceptedname.equals(actualname))
	//	System.out.println("you are in correct URL");
	//else
	//	System.out.println("Incorrect URL");
	
	
	driver.close();
	
	
	
	}
}
