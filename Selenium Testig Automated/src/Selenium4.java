import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4 {
	static WebDriver driver;
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal Ganji\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	//7.Clicking arrow to go to top of page
	public void faarrow() throws InterruptedException {
		driver.findElement(By.xpath("//a[@data-hover='Join Us']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Brand Ambassador')]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		WebElement ele = driver.findElement(By.xpath("//span[@id='toTopHover']"));
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
		Thread.sleep(3000);
		System.out.println("clicked Arrow up");
		driver.findElement(By.xpath("//span[@id='toTopHover']")).click();
    	Thread.sleep(3000);
		 }
	
	//8.Clicking submit and checking for exception
	public void page() throws InterruptedException {
	   driver.findElement(By.xpath("//input[@class='button-w3layouts hvr-rectangle-out']")).click();
	   System.out.println("clicked Submit");
       Thread.sleep(3000);
	}
		

	public static void main(String[] args) throws InterruptedException {
		Selenium4 obj=new Selenium4();
		obj.launch();
		obj.faarrow();
		obj.page();
		driver.close();// TODO Auto-generated method stub

	}
}
