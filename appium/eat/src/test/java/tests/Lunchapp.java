package tests;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Lunchapp {
	//static AndroidDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability("platformName", "Android");
			cap.setCapability("deviceName", "motorola moto g54 5G");
			cap.setCapability("automationName","uiautomator2");
			cap.setCapability("appPackage","com.done.faasos");
			cap.setCapability("appActivity", "com.done.faasos.activity.eatsureonboarding.ui.OnBoardingActivity");
			
			URL url=URI.create("http://127.0.0.1:4725").toURL();
			AndroidDriver driver=new AndroidDriver(url,cap);
			System.out.println("app launched successfully");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.quit();
	  
		  }
		  
	

}
