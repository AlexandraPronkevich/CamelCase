//package selenium;
//
//import base.Base;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//
//public class FirstTest extends Base {
//
//    @Test
//    public void firstTest() throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver", "e:/ChromeDriver/chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        driver.manage().window().maximize();

//        driver.get("https://www.google.com");
//        Thread.sleep( 5000);
//
//        WebElement element = driver.findElement(By.name("q"));
//        element.sendKeys("Java language");
//        Thread.sleep(5000);
//
//        element.submit();
//
//        System.out.println(driver.getTitle());
//
//////        driver.quit();
//    }
//}