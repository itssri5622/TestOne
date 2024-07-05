/**
 * 
 */
package Firstpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author 91709
 *
 */
public class FirstRun {

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
		d.findElement(By.id("search")).click();
		//d.findElement(By.className("navigation")).click();
		//d.findElement(By.name("email")).click();
		//d.findElement(By.linkText("Create an Account")).click();
		//d.findElement(By.partialLinkText("Create")).click();
		//d.findElement(By.cssSelector("#search")).click();
		//d.findElement(By.xpath("//input[@id='search']")).click();

	}

}

