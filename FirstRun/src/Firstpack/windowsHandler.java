/**
 * 
 */
package Firstpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.zeromq.ZStar.Set;
import java.util.*;

/**
 * @author 91709
 *
 */
public class windowsHandler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome,driver", "E:\\Workspace\\Automation Testing\\Software\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d= new ChromeDriver(options);
		d.get("http://omayo.blogspot.com/");
		d.findElement(By.linkText("SeleniumTutorial")).click();
		// Get the main single window
		String handle=d.getWindowHandle();
		System.out.println(handle);
		//Get the all window
		java.util.Set<String> handleAll=d.getWindowHandles();
		System.out.println(handleAll);
		//Count of windows , changed from 1 to 2
        java.util.Set<String> newAllWindowHandles = d.getWindowHandles();
        System.out.println("New Count of Window :" + newAllWindowHandles.size());
 
        // Get the detail of the parent window
        String ParentHandle = d.getWindowHandle();
        System.out.println("Parent Window :" + ParentHandle);
        System.out.println("*********************");
        //Get details of parent and child windows
        Iterator<String> iterator = newAllWindowHandles.iterator();
        String mainWindow = iterator.next(); // Prints the first window
        String childWindow = iterator.next(); // Prints the second window
        System.out.println("Parent Window :" + mainWindow);
        System.out.println("Child Window :" + childWindow);
 
        //Switch control to child window
        d.switchTo().window(childWindow);
        System.out.println("Switches to child window");
        d.switchTo().window(mainWindow);
        System.out.println("Switches to main window");
        d.close();
		
	}

}
