import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class loginPageInitialTestPUP2003LOG1 { public ChromeDriver driver;
    @Before public void setDriver() { System.setProperty("webdriver.chrome.driver", "C://CH//chromedriver.exe");
            driver = new ChromeDriver(); System.out.println("START");
    }
    @Test
        public void loginIn1(){ System.out.println("Login page initial test 1");
        driver.get("http://puppy.sunn7y.website/login");
        List<WebElement> list = driver.findElements(By.className("form-control"));
        for (WebElement ele : list) {String className = ele.getAttribute("id");
            System.out.println("Class name = " + className); }

        driver.findElement(By.id("email")).sendKeys("dennjacrafter@gmail.com");
        driver.findElement(By.id("password")).sendKeys("dennjacrafter");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    }
    @After public  void close(){
    driver.quit();
    System.out.println("FINISH");}}
