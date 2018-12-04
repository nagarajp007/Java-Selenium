package Maven1.MavenArti1;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     * @throws InterruptedException
     */
    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main( String[] args ) throws InterruptedException
    {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("http://10.113.49.84:9446/client6.8_41/ROCPSROClient.html#MONITOR_HOME~");
		//driver1.get("http://10.113.49.84:9446/client6.8_40/sparkLogin.jsp");
		driver1.findElement(By.xpath(".//*[@id='username-input-area']")).sendKeys("Root");
		driver1.findElement(By.xpath("//input[@id='password-input-area']")).sendKeys("welcome1");
		driver1.findElement(By.xpath("//input[@id='btn']")).click();
		driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver1.wait(5000);
		driver1.findElement(By.xpath("(//div[@class='gwt-HTML'])[1]")).click();
		driver1.findElement(By.xpath("//input[@class='gwt-TextBox roc-field roc-trigger-field']")).sendKeys("Usage Backout Request");
		//driver1.wait(3000);
		driver1.findElement(By.xpath("//div[@id='id-Usage Backout Request']")).click();
		
		
		driver1.findElement(By.xpath("(//div[@class='gwt-HTML'])[4]")).click();
		driver1.findElement(By.xpath("//div[@class='roc-context-menu-item roc-menu-item-enabled']")).click();
		//Detail screen navigation
		driver1.findElement(By.xpath("//div[@id='fileCollection_gwt_uid_75_chzn']/a/span")).click();;
		driver1.findElement(By.xpath("//li[.='FC']")).click();
		//dropdown selection
		driver1.findElement(By.id("pubrDesc")).sendKeys("Input");
		driver1.findElement(By.xpath("(//div[@class='gwt-HTML'])[3]")).click();
		driver1.findElement(By.xpath(".//*[@id='searchGrid']/div[2]/div/div[2]/div/div[2]/div/div[3]/div/div[2]/div/div/table/tbody/tr[1]/td[3]/div")).click();
		//Actions action = new Actions(driver1);
	
		//driver1.findElement(By.xpath("//div[.='Airtel924.txt']")).click();
		//WebDriver driver = null;
		/*driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		Actions action = new Actions(driver1);*/
		/*WebElement element= driver1.findElement(By.xpath(".//*[@id='searchGrid']/div[2]/div/div[2]/div/div[2]/div/div[3]/div/div[2]/div/div/table/tbody/tr[1]/td[4]/div"));
		action.moveToElement(element).doubleClick().perform();
		element.sendKeys(Keys.RETURN);*/
		driver1.findElement(By.xpath("(//button[@class='gwt-Button roc-primary-button'])[3]")).click();
		//element.click();
		//element.click();
		//action.moveToElement(driver1.findElement(By.xpath(".//*[@id='searchGrid']/div[2]/div/div[2]/div/div[2]/div/div[3]/div/div[2]/div/div/table/tbody/tr[1]/td[4]/div"))).doubleClick().perform();
		//element.click();
		//Double click
		//action.doubleClick(element).build().perform();
		/*WebDriver driver2 = null;
		Actions act = new Actions(driver2);
		((act).moveToElement(driver2.findElement(By.xpath(".//*[@id='searchGrid']/div[2]/div/div[2]/div/div[2]/div/div[3]/div/div[2]/div/div/table/tbody/tr[1]/td[4]/div")))).doubleClick().build().perform();*/
		//WebElement Ele=driver2.findElement(By.xpath("//tr[@class='GNHAT4HCCG GNHAT4HCJG']/td[4]/div")).doubleClick().build().perform();
		//Actions action = null;
		//act.doubleClick()(Ele).;
		//action.doubleClick(Ele).build().perform();
		//driver1.close();
		//driver1.findElement(By.xpath("//div[@tabindex='0']")).click();
		driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver1.findElement(By.xpath("(//div[@id='buttonpanel'])/button[1]")).click();
		//driver1.wait(1000);
		
		
		//driver1.close();
		//.//*[@id='searchGrid']/div[2]/div/div[2]/div/div[2]/div/div[3]/div/div[2]/div/div/table/tbody/tr[5]/td[4]/div
		//tr[@class='GNHAT4HCCG GNHAT4HCJG']/td[4]/div
    }
}