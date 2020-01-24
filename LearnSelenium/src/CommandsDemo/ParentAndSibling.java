package CommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentAndSibling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/computers");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[contains(text(),'Computers')]//ancestor::ul//descendant::li//a[contains(text(),'Electronics')]")).click();
		Thread.sleep(1500);
		driver.close();
		

	}

}
