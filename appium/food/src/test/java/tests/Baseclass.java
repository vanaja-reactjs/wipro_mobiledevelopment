package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;

//import org.openqa.selenium.remote.DesiredCapabilities;
//import java.net.*;
import java.net.*;

//import com.google.common.collect.ImmutableMap;

//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.options.UiAutomator2Options;
//import io.appium.java_client.remote.MobileCapabilityType;
//import io.appium.java_client.remote.MobilePlatform;

public class Baseclass{
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "motorola moto g54 5G");
		cap.setCapability("automationName","uiautomator2");
		cap.setCapability("appPackage","com.example.fooddeliveryapp");
		cap.setCapability("appActivity", "com.example.fooddeliveryapp.MainActivity");
		
		URL url=URI.create("http://127.0.0.1:4723/").toURL();
		AndroidDriver driver=new AndroidDriver(url,cap);
		System.out.println("app launched successfully");
		driver.quit();
	}
	
}
