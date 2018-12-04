package Maven1.MavenArti1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AgentPrac {

	public static void main(String[] args){
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://10.113.49.84:9446/client6.8_41/sparkLogin.jsp");
	driver.findElement(By.id("username-input-area")).sendKeys("Root");
	driver.findElement(By.xpath("//input[@id='password-input-area']")).sendKeys("welcome1");
	driver.findElement(By.xpath("//input[@id='btn']")).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//td[@colspan='1']/div[1]")).click();
	driver.findElement(By.xpath("//input[@class='gwt-TextBox roc-field roc-trigger-field']")).sendKeys("Agent");
	driver.findElement(By.xpath("(//div[.='Agent'])[2]")).click();
	driver.findElement(By.xpath("(//div[.='Common Tasks'])[2]")).click();
	driver.findElement(By.xpath("//div[@id='NewActionComponent']")).click();
	//detail screen
	driver.findElement(By.xpath("//input[@id='pageCode']")).sendKeys("CodecT");
	driver.findElement(By.xpath("//input[@id='pageCompanyName']")).sendKeys("Subex Assurance");
	driver.findElement(By.xpath("(//div[.='Add'])[2]")).click();
	driver.findElement(By.xpath("//input[@id='pagdName']")).sendKeys("Address");
	driver.findElement(By.xpath("(//a[@class='GNHAT4HCLK'])[5]/span")).click();
	driver.findElement(By.xpath("//li[.='Bank']")).click();
	driver.findElement(By.xpath("//input[@id='address.padrStreet1']")).sendKeys("MZ");
	driver.findElement(By.xpath("(//a[@class='GNHAT4HCLK']/span)[6]")).click();
	driver.findElement(By.xpath("//li[.='Algeria']")).click();
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.findElement(By.xpath("//button[@id='agentAddressDetail.ok']")).click();
	//Contact info tab
	driver.findElement(By.xpath("(//div[.='Contact Information'])[4]")).click();
	
	driver.findElement(By.xpath("(//div[.='Add']|div[@class='gwt-HTML'])[4]")).click();
	driver.findElement(By.xpath("//input[@id='pagiName']")).sendKeys("tact1");
	driver.findElement(By.xpath("(//a[@class='GNHAT4HCLK']/span)[5]")).click();
	driver.findElement(By.xpath(("//li[.='Email']"))).click(); 
	////ul[@class='GNHAT4HCFK']/li[2]
	driver.findElement(By.xpath("//input[@id='pagiAddress']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input[@id='pagiDefaultFl_InputElement']")).click();
	driver.findElement(By.xpath("//button[@id='agentInternetAddrDetail.ok']")).click();
	//Contact Details tab
	driver.findElement(By.xpath("(//div[.='Add'])[6]")).click();
	driver.findElement(By.xpath("//input[@id='pagpName']")).sendKeys("Contact No");
	driver.findElement(By.xpath("(//a[@class='GNHAT4HCLK'])[5]")).click();
	driver.findElement(By.xpath("//li[.='Home']")).click();
	driver.findElement(By.xpath("//input[@id='pagpNumber']")).sendKeys("3282034803");
	driver.findElement(By.xpath("//input[@id='pagpDefaultFl_InputElement']")).click();
	driver.findElement(By.xpath("//button[@id='agentPhoneDetail.ok']")).click();
	
	//save action
	driver.findElement(By.xpath("//button[@id='agentDetail.save']")).click();
	//iver.close();
	}
	
	
}

