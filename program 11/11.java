package prg11;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class prg11 {

public static void main(String[] args) throws InterruptedException  {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Student\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/STUDENT/Desktop/cars.html");
Select select = new Select(driver.findElement(By.id("cars")));
System.out.println("The multiselect options are: ");
List<WebElement> options = select.getOptions();
for(WebElement option: options)
            System.out.println(option.getText());

System.out.println("Is the selected element a multiselect element?: "+ select.isMultiple());

if(select.isMultiple()){
System.out.println("Selecting option bike using its index.");
select.selectByIndex(2);
        Thread.sleep(4000);
       
        System.out.println("Selecting option Bus using its value.");
select.selectByValue("bus");
        Thread.sleep(4000);
       
        System.out.println("Selecting option Volvo using its visible text.");
select.selectByVisibleText("Volvo");
        Thread.sleep(4000);
       
        System.out.println("The selected options are: ");
        options = select.getAllSelectedOptions();
        for(WebElement option: options)
        System.out.println(option.getText());
       
        System.out.println("Deselecting option bike using its index.");
select.deselectByIndex(2);
        Thread.sleep(4000);
       
        System.out.println("Deselecting option bus using its value.");
select.deselectByValue("bus");
        Thread.sleep(4000);
               
        System.out.println("The selected values after deselecting some options are: ");
        options = select.getAllSelectedOptions();
        for(WebElement option: options)
        System.out.println(option.getText());
        System.out.println("Deselecting all options.");
        select.deselectAll();
}
}
}
