package edureka.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class userAuth {
	
	
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://192.168.0.106:3001/");
		driver.findElement(By.name("login")).sendKeys("edureka");
		driver.findElement(By.name("password")).sendKeys("edureka");
		driver.findElement(By.name("click")).click();
		String x = driver.getCurrentUrl();
		System.out.println(x);
	}

}
