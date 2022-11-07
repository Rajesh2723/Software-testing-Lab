package mm;


//package selenium_7c_22_23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p9 {

public static void main(String[] args) {
        // TODO Auto-generated method stub
    //pgm 9_Write a test program to list the total number of objects present on a web page
    System.setProperty("webdriver.chrome.driver",
"E:\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();

driver.get("https://gmail.com");          
List<WebElement> links = driver.findElements(By.xpath("//a"));  //a refers to tag name ,// select current node
          int linkCount = links.size();     // Count the total Link list on Web Page
         
          System.out.println("Total Number of link count on webpage = "  + linkCount);  
          //Print the total count of links on webpage
         
          List<WebElement> allElements = driver.findElements(By.xpath("//*"));    
          //Identify all the elements on web page
            int elementsCount = allElements.size();    
                   
         System.out.println("Total Number of All Element on webpage = "  + elementsCount);      
         //Print the total count of all element on webpage                      
    }


}
