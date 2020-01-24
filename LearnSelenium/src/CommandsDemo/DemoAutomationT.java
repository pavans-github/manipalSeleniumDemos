package CommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAutomationT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("pavan kumar");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("kalluri");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("2-47,Bangalor");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("pavan.kalluri@gmail.com");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("9133201033");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/div[2]/input[1]")).click();
		/*WebElement Languages=driver.findElement(By.xpath("#msdd"));
		Select sell= new Select(Languages);
		sell.selectByVisibleText("English");*/
		WebElement Skills=driver.findElement(By.xpath("//select[@ng-model='Skill']"));
		Select s= new Select(Skills);
		s.selectByVisibleText("Java");
		Thread.sleep(2000);
		WebElement Country=driver.findElement(By.xpath("//select[@id='countries']"));
		Select s1= new Select(Country);
		s1.selectByVisibleText("India");
		//WebElement SecCountry1=driver.findElement(By.xpath("//span[@class='select2-selection__rendered']"));
		//Select s2= new Select(SecCountry1);
		//s2.selectByVisibleText("India");
		WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select s3= new Select(year);
		s3.selectByVisibleText("1997");
		/*WebElement Country=driver.findElement(By.xpath("//select[@id='countries']"));
		Select s1= new Select(Country);
		s1.selectByVisibleText("India");
		WebElement Country=driver.findElement(By.xpath("//select[@id='countries']"));
		Select s1= new Select(Country);
		s1.selectByVisibleText("India");
		WebElement Country=driver.findElement(By.xpath("//select[@id='countries']"));
		Select s1= new Select(Country);
		s1.selectByVisibleText("India");
		*/
		
		
		//driver.close();
	}

}
