import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String vBrowser = "GC";
////		if(vBrowser.equals("GC")){
			System.setProperty("webdriver.chrome.driver", "C:\\verizon sw\\selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
//			driver.get("https://www.google.co.in");
			//driver.get("https://www.rediff.com/");
			//
		//	driver.get("https://login.yahoo.com/");
			driver.get("https://www.softwarecertifications.org/");
			driver.manage().window().maximize();
			
			System.out.println("Title is "+ driver.getTitle());
			
//			driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Samsung s10+");
			//Thread.sleep(5000);
//			driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
//			Thread.sleep(5000);
			
//			driver.findElement(By.name("srchword")).sendKeys("watches");
//			driver.findElement(By.className("newsrchbtn")).click();
//			driver.findElement(By.id("lowprice")).sendKeys("5000");
//			driver.findElement(By.id("highprice")).sendKeys("10000");
//			driver.findElement(By.className("pr_rangebtn")).click();
//			driver.findElement(By.linkText("Become a Seller")).click();
//			driver.findElement(By.partialLinkText("Forgot")).click();
//			driver.findElement(By.xpath("//input[@id='login']")).sendKeys("riya");
			
			Thread.sleep(3000);
//			
//			driver.findElement(By.xpath("//*[@id='createacc']")).sendKeys(Keys.ENTER);
//			driver.findElement(By.xpath("//*[@class='ureg-fname ']")).sendKeys("riya");
//			driver.findElement(By.xpath("//*[@class='ureg-lname ']")).sendKeys("george");
//			
//			driver.findElement(By.id("reg-submit-button")).sendKeys(Keys.ENTER);
			
			driver.findElement(By.xpath("//nav[@id='site-nav']/ul/li[4]")).click();
			
			Thread.sleep(3000);
			
			driver.close();
//		}
//		
//		else if (vBrowser.equals("FF")){
//			System.setProperty("webdriver.gecko.driver", "C:\\verizon sw\\selenium\\geckodriver.exe");
//			WebDriver driver = new FirefoxDriver();
//			driver.get("https://login.yahoo.com/");
//			driver.manage().window().maximize();
//			System.out.println("Title is"+ driver.getTitle());
//			
//			driver.close();
		//}

	}

}
