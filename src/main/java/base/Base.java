
//    package base;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//
//import java.time.Duration;
//
//    public class Base {
//
//        String homePath = "C:/selenium/chromedriver.exe";
//        String workPath = "e:/ChromeDriver/chromedriver.exe";
//
//        public static WebDriver driver;
//
//        @BeforeTest
//        public void initializeDriver() {
//            System.setProperty("webdriver.chrome.driver", workPath);
//            driver = new ChromeDriver();
//
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//            driver.manage().window().maximize();
//        }
//
//        @AfterTest
//        public void endTest() {
//            driver.quit();
//        }
//
//        public
//
//        // Проверка что открылась нужная страница

//        String titleActual = driver.getTitle();
//        String titleExpected = "Swag Labs";

//        Assert.assertEquals(titleActual, titleExpected);
//
//
//        // Проверка текста сообщения
//        Assert.assertEquals(titleActual, titleExpected);
//        System.out.println("Заголовок страницы проверен");
//    }

