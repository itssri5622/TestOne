package Firstpack;


import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webDriverCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome,driver", "E:\\Workspace\\Automation Testing\\Software\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d= new ChromeDriver(options);
		d.manage().window().maximize();
		d.get("https://magento.softwaretestingboard.com/");
		System.out.println("SUCCESS !!!");
		String x= d.getTitle();
		System.out.println("****getTitle:" +x);
		String y=d.getCurrentUrl();
		System.out.println("****getCurrentURL:" +y);
		Thread.sleep(2000);
		//String z=d.getPageSource();
		//System.out.println("****getPageSource:" +z);
		// Getting window size
		org.openqa.selenium.Dimension size= d.manage().window().getSize();
		System.out.println("Getting window size" +size);
		Thread.sleep(2000);
		//Setting window size
		Dimension size1=new Dimension(300,200);
		d.manage().window().setSize(size1);
		System.out.println("Setting window size");
		Thread.sleep(2000);
	}

}
