import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class One {




        WebDriver driver;

        @BeforeClass
        public void setup(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
@BeforeMethod
public void met(){
    System.out.println("add beforemethod");
}
        @Test
        public void automationFrame() throws InterruptedException {
            driver.get("http://automationpractice.com");
            Thread.sleep(3000);
            WebElement facebookFrame = driver.findElement(By.xpath("//div[@class='facebook-fanbox']//iframe"));
            driver.switchTo().frame(facebookFrame);
            driver.switchTo().defaultContent();
            WebElement ele = driver.findElement(By.id("facebook_block"));
            System.out.println(ele.getText());
            //driver.switchTo().defaultContent();
            System.out.println(driver.getTitle());
            System.out.println("todo good");
        }
        @AfterClass
    public void close(){
            System.out.println("change in cat");
            driver.quit();
        }

    }





