/**
 * 
 */
package introbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

/**
 * @author 91709
 *
 */
public class Locators2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Workspace\\Automation Testing\\Software\\Selenium Webdriver\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();
		d.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
		/*d.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("sri100@gmail.com");
		d.findElement(By.xpath("//input [contains(@title,'Password')]")).sendKeys("sri100@123");
		d.findElement(By.xpath("//button[@class='action login primary']")).click();
		System.out.println("*********Login Exe************");
		System.out.println("*******Printing the entire tab using ancestor*******");
		System.out.println(d.findElement(By.xpath("(//strong[@class='title']/ancestor::span) [1]")).getText());
		System.out.println("********Printing only the specific line using preceding*******");
		System.out.println(d.findElement(By.xpath("//span[text()='Shop New Yoga']//preceding-sibling::strong")).getText());
		System.out.println("********Printing only the specific line using following*******");
		System.out.println(d.findElement(By.xpath("//span[@class='info']/following-sibling::strong")).getText());
	   // In order to use Assertion, we need to remove Scope tag from TestNG dependency & import testnG Assert
		 Assert.assertEquals(d.findElement(By.xpath("//span[@class='info']/following-sibling::strong")).getText(),"Get fit and look fab in new seasonal styles");
		 */
		//System.out.println(d.findElement(By.xpath("(//span[contains(text(),'Welcome, Sri Devi!')])[1]")));
		System.out.println("Generate xpath for Buttons");
		d.findElement(By.xpath("(//span[text()='Sign In'])[1]")).click();
		
}}
