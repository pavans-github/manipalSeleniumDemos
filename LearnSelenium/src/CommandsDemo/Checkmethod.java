package CommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/login");
		boolean Present=driver.findElement(By.id("Email")).isDisplayed();
		boolean Enabled=driver.findElement(By.id("Email")).isEnabled();
		System.out.println(Present);
		System.out.println(Enabled);
		if(Present==true&&Enabled==true)
		{
			driver.findElement(By.id("Email")).sendKeys("pava.kalluri1997@gmail.com");
		}
		boolean checkbox=driver.findElement(By.xpath("//input[@id='RememberMe']")).isSelected();
		System.out.println(checkbox);
		if(checkbox==false){
			driver.findElement(By.xpath("//input[@id='RememberMe']")).click();;
		}
		Thread.sleep(1500);
		driver.close();
	}

}
