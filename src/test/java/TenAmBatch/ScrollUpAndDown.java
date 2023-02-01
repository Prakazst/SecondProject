package TenAmBatch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462756374&hvpos=&hvnetw=g&hvrand=5922133542991994462&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061896&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=CjwKCAiAk--dBhABEiwAchIwkRhiRCHewBWfsNLDTvjsQhCeP9PkqJlEAc7T4p04eWJn5mwtTssh-xoCNNcQAvD_BwE");
		
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement downLandMark = driver.findElement(By.xpath("//div[contains(@class,'nav-logo-base')]"));
		Thread.sleep(3000);
		
		jse.executeScript("arguments[0].scrollIntoView(true)", downLandMark);
		
		

	}

}
