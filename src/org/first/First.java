package org.first;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJ\\eclipse-workspace\\FitstPrject\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot rk=(TakesScreenshot)driver;
		File src = rk.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\RAJ\\eclipse-workspace\\FitstPrject\\Screenshot\\first.png");
		FileUtils.copyFile(src, dest);
	}

}
