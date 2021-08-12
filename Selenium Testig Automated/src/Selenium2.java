import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {

	static WebDriver driver;
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal Ganji\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		Thread.sleep(3000);
	}
	//3.Testing by clicking policies button
	public void policies() {
		driver.findElement(By.xpath("//a[@data-hover='Policies and Code']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Policies')]")).click();
		System.out.println("Clicking Policies passed");
		 }
	
	
	//.4.Checking and printing h4 tag elements in page
	public void page() {
		driver.findElement(By.xpath("//a[@data-hover='Policies and Code']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Service Quality Values')]")).click();
		 List<WebElement> arr= driver.findElements(By.tagName("h4"));
		 System.out.println("*-------------------------------------*");
			for(WebElement i : arr) {
				System.out.println(i.getText());
			}
		 }
	public static void main(String[] args) throws InterruptedException {
		Selenium2 obj=new Selenium2();
		obj.launch();
		obj.policies();
		obj.page();
		driver.close();
	}

}

