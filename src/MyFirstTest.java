import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFirstTest{
    private WebDriver driver;
    private WebDriverWait wait;

    @Test
    public void myFirstTest() throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("btnG")).click();
        driver.quit();
        driver = null;
    }//public void myFirstTest()

}//public class MyFirstTest extends TestBase