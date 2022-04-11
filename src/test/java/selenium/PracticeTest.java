package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class PracticeTest {

    @Test
    public void firstTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "e:/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://selectorshub.com/xpath-practice-page/");
        Thread.sleep( 5000);

        WebElement userEmail = driver.findElement(By.id("userId"));
        userEmail.sendKeys("test@test.com");
        Thread.sleep(5000);


        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("pass123");
        Thread.sleep(5000);


        WebElement company = driver.findElement(By.name("company"));
        company.sendKeys("BBS company");
        Thread.sleep(5000);

        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();
        Thread.sleep(5000);


//        userEmail.submit();

//        System.out.println(driver.getTitle());

        driver.quit();
    }
}