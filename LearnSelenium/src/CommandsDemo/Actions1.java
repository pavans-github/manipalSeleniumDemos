package CommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		//driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
		Actions act=new Actions(driver);
		act.sendKeys("Keys.DOWN.ENTER").perform();
		Thread.sleep(1500);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
	}

}
