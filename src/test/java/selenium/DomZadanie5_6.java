package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class DomZadanie5_6 {

    @Test
    public void firstTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "e:/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://www.youtube.com/channel/UC4tlrTXCBw6NPZ9nCA3_s9w");
        Thread.sleep( 1000);

//
        System.out.println(driver.getTitle());

//        driver.quit();
    }
}