package com.model;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo1 {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\soft\\chrome_new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/selnium/uploadfile1.html");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//input[@type='file']")).click();
	    
	    Thread.sleep(5000);
	    Runtime.getRuntime().exec("E:\\selnium\\uploadfile_chrome.exe");
	}

}
