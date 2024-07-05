package introbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\chromedriver.exe");
		//WebDriver d= new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "E:\\Workspace\\Automation Testing\\Software\\Selenium Webdriver\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();
		d.get("https://magento.softwaretestingboard.com/");
		System.out.println("SUCCESS !!!");
		String x= d.getTitle();
		System.out.println("****getTitle:" +x);
		String y=d.getCurrentUrl();
		System.out.println("****getCurrentURL:" +y);
		
		

	}

}
