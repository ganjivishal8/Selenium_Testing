import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Selenium {

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
	//1.Checking For Title
	public void title() {
		 WebElement title1;
		 title1=driver.findElement(By.xpath("//div[@class='top-header-agile']//a[contains(text(),'The Sparks Foundation')]"));
		 if(title1.isDisplayed()) {
			 System.out.println("Contains title");
		 }
	}
	//2.Checking whether page contains video
	public void video() throws InterruptedException {
		WebElement video2;
		 driver.findElement(By.xpath("//div[@class='agileits w3layouts embed-container']")).click();
		 video2=driver.findElement(By.xpath("//iframe[@id='youtube-video']"));
		 //JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,350)", "");
		 if(video2.isDisplayed()) {
			 System.out.println("video clicked and contains video");
		 }
		 Thread.sleep(5000);
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Selenium obj=new Selenium();
		obj.launch();
		obj.title();
		obj.video();
		driver.close();
	}

}
