package pg10;
import org.openqa.selenium.chrome.ChromeDriver;
public class pg10 {

public static void main(String[] args) {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Student\\Desktop\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://en.wikipedia.org/wiki/Wikipedia");
driver.manage().window().maximize();
String str=driver.getTitle();
String str1=driver.getCurrentUrl();
System.out.println("title of this web is'"+str+"'");
System.out.println("url of this web is'"+str1+"'");

if(str.equals("Wikiped - Wikipedia") && str1.equals("https://en.wikipedia.org/wiki/Wikipedia") ){
 System.out.println(true);}

else {

System.out.println(false);
}



}

}
