package CommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAndSource {
	public static void main(String[]args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://demowebshop.tricentis.com");
		//String actualname=driver.getTitle();
		//System.out.println(actualname);
		//System.out.println(actualname.length());
		//String URL =driver.getPageSource();
		//System.out.println(URL.length());
		//String pageUrl=driver.getCurrentUrl();
		
		//System.out.println(pageUrl);
		//String actualUrl="http://demowebshop.tricentis.com/Login";
		//if(actualUrl.equals(pageUrl))
		//	System.out.println("correct URL");
		//else
		//	System.out.println("incorrect url");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().to("http://demowebshop.tricentis.com/login");

		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().to("http://demowebshop.tricentis.com/register");
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		driver.close();
		



	}

}
