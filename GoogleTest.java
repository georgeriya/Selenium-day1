import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String results;
		String text;
		System.setProperty("webdriver.gecko.driver", "C:\\verizon sw\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("Selenium");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
		//Thread.sleep(3000);
		results= driver.findElement(By.xpath("//*[@id='resultStats']")).getText(); //static text
		
		System.out.println(results);
	//	Thread.sleep(3000);
		
		text= driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/div/div[2]/div/div[1]/input")).getAttribute("value"); //dynamic text
		
		System.out.println(text);
		Thread.sleep(3000);
		driver.close();
		
	}

}
