package tests;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class EcommLunch {
	AndroidDriver driver;

	@SuppressWarnings("deprecation")
        @BeforeClass
		public void setUp() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "motorola moto g54 5G");
		cap.setCapability("automationName","uiautomator2");
		cap.setCapability("appPackage","com.alieser.libraryproject");
		cap.setCapability("appActivity", "com.alieser.libraryproject.ui.view.login.LoginActivity");
		
		URL url=URI.create("http://127.0.0.1:4723/").toURL();
		driver=new AndroidDriver(url,cap);
		System.out.println("app launched successfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
		
		@Test
		public void testSignUp()
		{
		WebElement signup=driver.findElement(By.id("com.alieser.libraryproject:id/txtSignUp"));
		signup.click();
		WebElement signupuser=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.alieser.libraryproject:id/etUserNameSignUp\"]"));
		signupuser.click();
		signupuser.sendKeys("alieser@gmail.com");
		WebElement signuppass=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.alieser.libraryproject:id/etPasswordSignUp\"]"));
		signuppass.click();
        signuppass.sendKeys("alieser");
		WebElement signup1=driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.alieser.libraryproject:id/btnSignUp\"]"));
		signup1.click();
			System.out.println("sign up successfull");
		//WebElement signup=driver.findElement(By.id("com.alieser.libraryproject:id/txtSignUp"));
		//signup.click();
		}
		
		public void tearDown() {
			if(driver!=null) {
				driver.quit();
			}
		

	}

}