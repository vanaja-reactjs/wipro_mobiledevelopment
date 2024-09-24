package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import junit.framework.Assert;

public class ProductSearch extends LoginEcom {
	WebDriverWait wait;
	
	@Test
	public void searchBar() throws MalformedURLException {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\\\"com.alieser.libraryproject:id/rcvProducts\\\"]")));
		
		WebElement product=driver.findElement(By.xpath("(//android.widget.FrameLayout[@resource-id=\"com.alieser.libraryproject:id/cvProductRow\"])[1]/android.view.ViewGroup"));
		Assert.assertTrue(product.isDisplayed());
		
		WebElement addbus=driver.findElement(By.xpath("(//android.widget.Button[@resource-id=\"com.alieser.libraryproject:id/btnAddToBasketProductRow\"])[1]"));
		addbus.click();
		
		
		WebElement btnic=driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.alieser.libraryproject:id/navigation_bar_item_icon_view\"])[3]"));
		btnic.click();
		System.out.println("navigated to cart page");
		WebElement item=driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.alieser.libraryproject:id/rcvMyBasket\"]"));
		Assert.assertTrue(item.isDisplayed());
		
		WebElement conf=driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.alieser.libraryproject:id/btnOrderConfirmation\"]"));
		conf.click();
		System.out.println("confirm button clicked");
		
	}
}