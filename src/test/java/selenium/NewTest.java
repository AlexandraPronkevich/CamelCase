//package selenium;
//
//import base.Base;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.sql.SQLOutput;
//import java.time.Duration;
//
//    public class NewTest extends Base {
//
//
//        @Test
//        public void practiceTest() throws InterruptedException {
//            // стандартная для всех проектов ЧАСТЬ
//
//            System.setProperty("webdriver.chrome.driver", "e:/ChromeDriver/chromedriver.exe");
////
////        WebDriver driver = new ChromeDriver();
////
////        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
////
////        driver.manage().window().maximize();
//
//            // СТАНДАРТНАЯ ЧАСТЬ
//
//            //Начало теста
//
//            driver.get("https://www.saucedemo.com/");
//            Thread.sleep(3000);
//
//            // Проверка
//
//            String titleActual = driver.getTitle();
//            String titleExpected = "Swag Labs";
//
//            Assert.assertEquals(titleActual, titleExpected);
//
//
////
//        WebElement userName = driver.findElement(By.id("user-name"));
//        userName.sendKeys("test@test.com");
//        Thread.sleep(1000);
////
//        WebElement password = driver.findElement(By.id("password"));
//        password.sendKeys("pass123");
//        Thread.sleep(1000);
////
//        WebElement loginButton = driver.findElement(By.id("login-button"));
//        loginButton.click();
//        Thread.sleep(1000);
//
//        // ИЗВЛЕЧЕНИЕ ТЕКСТА ИЗ ЭЛЕМЕНТА НА СТРАНИЦЕ
////
//        WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
//        String actualTextMessage = errorMessage.getText();
//
//        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
//
//        // Проверка текста сообщения
//            Assert.assertEquals(actualTextMessage, expectedMessage);
//            System.out.println("Текст сообщения об ошибке проверен");
//



//        }
//
//
//    }
