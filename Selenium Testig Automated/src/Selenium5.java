import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium5 {
	static WebDriver driver;
	//9.Launching the website
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal Ganji\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	//10.Going to medium page by clicking on link
	public void medium() throws InterruptedException {
		driver.findElement(By.xpath("//a[@data-hover='Contact Us']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		driver.findElement(By.xpath("//i[@class='fa fa-medium']")).click();
		Thread.sleep(10000);
	}
	
	public static void main(String[] args) throws InterruptedException {
		Selenium5 obj=new Selenium5();
		obj.launch();
		obj.medium();
		driver.close();// TODO Auto-generated method stub

	}
}
