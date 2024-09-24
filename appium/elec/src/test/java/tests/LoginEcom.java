package tests;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
/*import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;*/
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;



public class LoginEcom extends  EcommLunch
{
	@Test
	public void testLogin() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//login 
		WebElement signinuser=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.alieser.libraryproject:id/etUserName\"]"));
		//signinuser.click();
		signinuser.sendKeys("vjs@gmail.com");
		WebElement signinpass=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.alieser.libraryproject:id/etPassword\"]"));
		//signinpass.click();
        signinpass.sendKeys("vjsdjs");
		WebElement signin=driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.alieser.libraryproject:id/btnSignin\"]"));
		signin.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.alieser.libraryproject:id/rcvProducts\"]")));
		System.out.println("login successfully completed");
		Thread.sleep(1000);
	
		
		WebElement product=driver.findElement(By.xpath("(//android.widget.FrameLayout[@resource-id=\"com.alieser.libraryproject:id/cvProductRow\"])[1]/android.view.ViewGroup"));
		Assert.assertTrue(product.isDisplayed());
		
		WebElement addbus=driver.findElement(By.xpath("(//android.widget.Button[@resource-id=\"com.alieser.libraryproject:id/btnAddToBasketProductRow\"])[1]"));
		addbus.click();
		
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.widget.ImageView[@resource-id=\"com.alieser.libraryproject:id/navigation_bar_item_icon_view\"])[3]")));
        
        // Re-locate the cart icon and click it
        WebElement btnic = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.alieser.libraryproject:id/navigation_bar_item_icon_view\"])[3]"));
        btnic.click();

        System.out.println("navigated to cart page");

        // Wait until items are visible in the cart
        WebElement item = driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.alieser.libraryproject:id/rcvMyBasket\"]"));
        Assert.assertTrue(item.isDisplayed());

        // Confirm the order
        WebElement conf = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.alieser.libraryproject:id/btnOrderConfirmation\"]"));
        conf.click();
        System.out.println("confirm button clicked");
		
		
	}
}


