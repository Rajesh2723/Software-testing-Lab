program 8>>>>
package mm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program9 {

public static void main(String[] args) throws InterruptedException

{
//web site testing: instantiate the browser object and set the system properties of the browser drivers
//setProperty method has two attributes – “propertyName” and “value.”
//The propertyName represents the name of the browser-specific driver,
//and the value points to the path of that browser driver.
System.setProperty("webdriver.chrome.driver",
"E:\\chromedriver.exe");

// Creating a object to instantiate the browser driver
ChromeDriver driver = new ChromeDriver();

//Navigating through a particular web site            
driver.get("http://demo.guru99.com/test/newtours/index.php");

//maximizing browser with maximize()          
driver.manage().window().maximize();
//driver.findElement(By.linkText("Agile Project")).click();
//Find Element command returns the web element that matches
//the first most element within the web page.

//username text field is located by name;findElement() takes one parameter which is a locator to the element.
//Different locators like By.id(), By.name(), By.xpath(), By.CSSSelector() etc.
//locate the elements in the page using their properties like“““ id, name or path, etc.

//sendkeys() in Selenium is a method used to enter editable content in the text and password fields during test execution.

driver.findElement(By.name("userName")).sendKeys("mercury1");
driver.findElement(By.name("password")).sendKeys("mercury1");
//Thread.sleep(5000);
driver.findElement(By.name("submit")).click();

}

}
