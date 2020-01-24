package CommandsDemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {
	public static void main(String[]args) throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		FileInputStream file1=new FileInputStream("E:\\selenium\\DataDriven\\LogInData.xlsx");
		XSSFWorkbook wb1=new XSSFWorkbook(file1);
		XSSFSheet sheet1=wb1.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
	for(int i=0;i<=rowcount;i++){
		driver.navigate().to("http://demowebshop.tricentis.com/login");

		String username=sheet1.getRow(i).getCell(0).getStringCellValue();
		String password=sheet1.getRow(i).getCell(1).getStringCellValue();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);;
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		//driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(1500);
		
	
	}
	driver.close();
	System.out.println("Done Bro...!");
	
	}


}
