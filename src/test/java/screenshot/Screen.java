package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {
public static void main(String[] args) throws IOException, InterruptedException {
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\practice\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://google.com");

/*JavascriptExecutor jc = (JavascriptExecutor) driver;
WebElement find = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input"));
jc.executeScript("arguments[0].setAttribute('value','ertyuiop')",find);
Object ob = jc.executeScript("return 3arguments[0].getAttribute('value')", find);
String s2 = (String)ob;
System.out.println(s2);
WebElement find1 = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]"));
jc.executeScript("arguments[0].click()", find1);
WebElement findElement = driver.findElement(By.xpath("//*[@id='fsl']/a[1]"));
jc.executeScript("arguments[0].scrollIntoView(true)",findElement );
Thread.sleep(1000);
jc.executeScript("arguments[0].scrollIntoView(false)",findElement );
TakesScreenshot st = (TakesScreenshot) driver;
File sc = st.getScreenshotAs(OutputType.FILE);
File s = new File("C:\\Users\\user\\Desktop\\screenshot\\goo.png");
FileUtils.copyFile(sc, s);*/
}
}
