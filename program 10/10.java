package url;

import org.openqa.selenium.chrome.ChromeDriver;

public class prog10 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		String url=driver.getCurrentUrl();
		System.out.println("Current URL:"+url);
		if(url.equals("https://en.wikipedia.org/wiki/Main_Page"))
			System.out.println("URL MATCHES");
	else 
		System.out.println("URL NOT MATCHED");
	
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println("Current Title:"+title);
		if(title.equals("Google")) {
			System.out.println("TITLE MATCHES");
		}else {
			System.out.println("title doesnt matches");
		}
		
	}
}
