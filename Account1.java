package Maven1.MavenArti1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Account1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://10.113.49.84:9446/client6.8_42/sparkLogin.jsp");
		driver.findElement(By.id("username-input-area")).sendKeys("Root");
		driver.findElement(By.xpath("//input[@id='password-input-area']")).sendKeys("welcome1");
		driver.findElement(By.xpath("//input[@id='btn']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//td[@colspan='1']/div[1]")).click();
		driver.findElement(By.xpath("//input[@class='gwt-TextBox roc-field roc-trigger-field']")).sendKeys("Account");
		driver.findElement(By.id("id-Account")).click();
		driver.findElement(By.xpath("(//div[.='Common Tasks'])[2]")).click();
		driver.findElement(By.xpath("(//div[.='New'])[7]")).click();
		//detail screen
		driver.findElement(By.xpath("(//a[@class='GNHAT4HCLK'])[1]")).click();
		driver.findElement(By.xpath("//li[@id='floater_paccCustomerType_gwt_uid_70_chzn_o_1']")).click();
		driver.findElement(By.xpath("//input[@id='paccName']")).sendKeys("AT&T");
		driver.findElement(By.xpath("//div[@id='trigger-agent']")).click();
		driver.findElement(By.xpath("//div[.='External']")).click();
		driver.findElement(By.xpath("//button[@id='ok']")).click();
		//bank details
		driver.findElement(By.xpath("(//div[@class='gwt-HTML'])[5]")).click();
		driver.findElement(By.xpath("(//a[@class='GNHAT4HCLK'])[10]")).click();
		driver.findElement(By.xpath("//li[.='HSBC Bank - Singapore']")).click();
		driver.findElement(By.xpath("//input[@id='pbacExtra1']")).sendKeys("09845745371");
		driver.findElement(By.xpath("//input[@id='pbacExtra2']")).sendKeys("HSBC - Account Name");
		driver.findElement(By.xpath("//button[@id='bankAccountDetail.ok']")).click();
		//Contact Info Tab
		driver.findElement(By.xpath("(//div[@class='gwt-tabLabel'])[2]")).click();
		driver.findElement(By.xpath(".//*[@id='addressToolbar.Add']/table/tbody/tr/td[2]/div")).click();
		driver.findElement(By.xpath("//input[@id='paccCompanyName']")).sendKeys("AT&T - Aus");
		driver.findElement(By.xpath("(//a[@class='GNHAT4HCLK'])[10]")).click();
		driver.findElement(By.xpath("//li[.='Bank']")).click();
		driver.findElement(By.xpath("//input[@id='pacdDefaultFl_InputElement']")).click();
		driver.findElement(By.xpath("//button[@id='accountAddressDetail.ok']")).click();
		//Contact Details
		driver.findElement(By.xpath(".//*[@id='contactsToolbar.Add']/table/tbody/tr/td[2]/div")).click();
		driver.findElement(By.xpath("//input[@id='paciName']")).sendKeys("Contact1");
		driver.findElement(By.xpath("//input[@id='paciEmail']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='paciOfficeNo']")).sendKeys("985214753");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("(//button[@class='gwt-Button roc-primary-button'])[2]")).click();
		driver.findElement(By.xpath("//button[@id='accountDetail.save']")).click();
	}

}
