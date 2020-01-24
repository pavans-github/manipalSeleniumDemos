package CommandsDemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log=Logger.getLogger(LogDemo.class);
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		log.info("Application starts successfully");
		String actualName="google";
		String exceptedName=driver.getTitle();
		System.out.println("correct Title is:"    +exceptedName);
		log.warn("Check title");
		if(actualName.equals(exceptedName)){
			System.out.println("correct page");
			log.info("correct page");
			driver.close();
		}
		else
			System.out.println("incorrect page");
		
			log.error("incorrect page");
		
		
			driver.close();
	}


}
