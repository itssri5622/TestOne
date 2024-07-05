package introbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import dev.failsafe.internal.util.Assert;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Workspace\\Automation Testing\\Software\\Selenium Webdriver\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();
		d.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
		//Using tagname
		//d.findElement(By.cssSelector("input#email")).sendKeys("sridevi89@gmail.com");
		//Using General syntax
		//d.findElement(By.cssSelector("input[type=\"email\"]")).sendKeys("sridevi89@gmail.com");
		/*System.out.println("CSS Selectors");
		d.findElement(By.cssSelector("input[name=\"login[username]\"")).sendKeys("sridevi89@gmail.com");
		System.out.println("General Syntax executed");
		d.findElement(By.cssSelector("input.input-text")).sendKeys("abc6889");
		System.out.println("Classname Syntax executed");
		d.findElement(By.cssSelector("button#send2")).click();
		System.out.println("Button clicked");
		*/
		/*System.out.println("xpath Selectors");
		d.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("sridevi89@gmail.com");
		System.out.println("General Syntax executed");
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys("82299");
		System.out.println("Classname Syntax executed");
		//d.findElement(By.xpath("//button[@id=\"send2\"][2]")).click();
		d.findElement(By.cssSelector("button[class=\"action login primary\"]")).click();
		System.out.println("Button clicked");
		*/
		/*System.out.println("Common selectors");
		d.findElement(By.id("search")).sendKeys("yogamat");
		System.out.println("ID exe");
		d.findElement(By.className("input-text")).sendKeys("yogamat");
		System.out.println("Class Name exe");
		d.findElement(By.cssSelector("button[title=\"Search\"]")).click();
		WebElement t =d.findElement(By.xpath("//div[@class=\"message notice\"]"));
		System.out.println(t.getText());
		*/
		System.out.println("Parent & child tags Exe");
		System.out.println(d.findElement(By.xpath("//h1/span")).getText());
		WebElement x2= d.findElement(By.xpath("//h1/span"));
		System.out.println(x2.getText());

		
		
		
	}
	
	

}
