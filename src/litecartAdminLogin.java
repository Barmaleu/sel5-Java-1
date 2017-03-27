import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class litecartAdminLogin {
        private WebDriver driver;
        private WebDriverWait wait;

        @Test
        public void AdminLogin() throws InterruptedException {
            ChromeDriver driver=new ChromeDriver();
            driver.get("http://localhost/litecart/admin/");
            driver.findElement(By.name("username")).click();
            driver.findElement(By.name("username")).sendKeys("admin");
            driver.findElement(By.name("password")).click();
            driver.findElement(By.name("password")).sendKeys("admin");
            driver.quit();
            driver = null;
        }//public void myFirstTest()
}//litecartAdminLogin

