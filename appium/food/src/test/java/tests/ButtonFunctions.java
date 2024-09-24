package tests;

		// TODO Auto-generated method stub
		import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;

//import org.openqa.selenium.remote.DesiredCapabilities;
		//import java.net.*;
		import java.net.*;

//port io.appium.java_client.AppiumDriver;

//import com.google.common.collect.ImmutableMap;

		
		import io.appium.java_client.android.AndroidDriver;
		//import io.appium.java_client.android.options.UiAutomator2Options;
		//import io.appium.java_client.remote.MobileCapabilityType;
		//import io.appium.java_client.remote.MobilePlatform;

		public class ButtonFunctions{
			//private AndroidDriver driver;
				//public void setUP() throws MalformedURLException{
			@SuppressWarnings("deprecation")
			public static void main(String[] args) throws MalformedURLException
			{
			    	
				DesiredCapabilities cap=new DesiredCapabilities();
				cap.setCapability("platformName", "Android");
				cap.setCapability("deviceName", "Pixel 2");
				cap.setCapability("automationName","uiautomator2");
				cap.setCapability("appPackage","com.example.fooddelivery");
				cap.setCapability("appActivity", "com.example.fooddeliveryapp.MainMenu");
				cap.setCapability("noReset", true);
				URL url=URI.create("http://127.0.0.1:4723/").toURL();
				 AndroidDriver driver=new AndroidDriver(url,cap);
				 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				System.out.println("app launched successfully");
			
			    try {
			
				WebElement signe=driver.findElement(By.id("com.example.fooddeliveryapp:id/button6"));
				signe.click();
				System.out.println("email button clicked successfully");
			    	WebElement signPhn=driver.findElement(By.id("com.example.fooddeliveryapp:id/button7"));
					signPhn.click();
					System.out.println("email button clicked successfully");
			    	
			    }catch(Exception e) {
			    	e.printStackTrace();
			    }
			    finally {
			    	driver.quit();
			    }
			    }
		}
		
		
