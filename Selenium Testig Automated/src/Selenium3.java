import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium3 {
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
	//5.Testing for hover of mouse on elements
	public void hover() throws InterruptedException {
		driver.findElement(By.xpath("//a[@data-hover='Programs']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Student Scholarship Program')]")).click();
		Actions actions = new Actions(driver); 
    	WebElement menuOption = driver.findElement(By.xpath("//div[@class='w3l-blog-list']//a[contains(text(),'Student Scholarship Program')]"));
    	actions.moveToElement(menuOption).perform();
    	System.out.println("Mouse hover sucess");
    	Thread.sleep(3000);
		 }
	
	//6.highlighting one of the elements
	public void page() throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//p[@class='para-w3-agile']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
       System.out.println("Text Highlight sucess");
       Thread.sleep(3000);
	}
		

	public static void main(String[] args) throws InterruptedException {
		Selenium3 obj=new Selenium3();
		obj.launch();
		obj.hover();
		obj.page();
		driver.close();// TODO Auto-generated method stub

	}

}
