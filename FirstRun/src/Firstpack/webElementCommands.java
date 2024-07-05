/**
 * 
 */
package Firstpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.zeromq.ZStar.Set;
import java.util.*;

/**
 * @author 91709
 *
 */
public class webElementCommands {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome,driver", "E:\\Workspace\\Automation Testing\\Software\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d= new ChromeDriver(options);
		d.get("https://magento.softwaretestingboard.com/");
		WebElement tb1=d.findElement(By.xpath("//input[@id='search']"));
		tb1.sendKeys("Yoga jacket");
		WebElement tbutton=d.findElement(By.tagName("button"));
		tbutton.click();

		
		
		
		
		
		
	}

}
