/**
 * 
 */
package Firstpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author 91709
 *
 */
public class navigate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome,driver", "E:\\Workspace\\Automation Testing\\Software\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d= new ChromeDriver(options);
		//d.get("https://magento.softwaretestingboard.com/");
		/*d.navigate().to("https://magento.softwaretestingboard.com/");
		System.out.println("SUCCESS !!!");
		d.findElement(By.xpath("//span[contains(text(),'Wicking to raingear, Luma covers you')]")).click();
		System.out.println("Opens performance !!!");
		d.navigate().back();	
		System.out.println("Navigate Back works- Goes to home page"); 
		
		d.findElement(By.xpath("//span[contains(text(),'Shop New Yoga')]")).click();
		d.navigate().forward();
		System.out.println("Navigate fwd works");
		System.out.println("");
		*/
		d.get("https://en.wikipedia.org/wiki/Main_Page");
		d.findElement(By.linkText("Help desk")).click();
		d.navigate().back();
		System.out.println("Home Page");
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.navigate().forward();
		System.out.println("Policy Page");
		
		
		

	}

}
