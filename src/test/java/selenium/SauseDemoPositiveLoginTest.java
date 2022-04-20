//package selenium;
//
//import base.Base;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class SauseDemoPositiveLoginTest extends Base {
//
//
//    @Test
//    public void sauseDemoPositiveLoginTest() throws InterruptedException {
//        // стандартная для всех проектов ЧАСТЬ
//
//        System.setProperty("webdriver.chrome.driver", "e:/ChromeDriver/chromedriver.exe");
////
////        WebDriver driver = new ChromeDriver();
////
////        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
////
////        driver.manage().window().maximize();
//
//        // СТАНДАРТНАЯ ЧАСТЬ
//
//        //Начало теста
//
//        driver.get("https://www.saucedemo.com/");
//        Thread.sleep(3000);
//
//
////    ВВОД ЛОГИНА И ПАРОЛЯ
//    WebElement userName = driver.findElement(By.id("user-name"));
//    userName.sendKeys("test@test.com");
//    Thread.sleep(1000);
////
//    WebElement password = driver.findElement(By.id("password"));
//    password.sendKeys("pass123");
//    Thread.sleep(1000);
////
//    WebElement loginButton = driver.findElement(By.id("login-button"));
//    loginButton.click();
//    Thread.sleep(1000);
//
//        // Проверка что открылась нужная страница
//
//        String titleActual = driver.getTitle();
//        String titleExpected = "Swag Labs";
//
//        Assert.assertEquals(titleActual, titleExpected);
//
//
//        // Проверка текста сообщения
//        Assert.assertEquals(titleActual, titleExpected);
//        System.out.println("Заголовок страницы проверен");



//
//    }
//
//
//}
