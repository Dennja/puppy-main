import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HostsPUP0305HOS1 {public ChromeDriver driver;

    @Before
    public void setDriver(){ System.setProperty("webdriver.chrome.driver", "C://CH//chromedriver.exe");
        driver = new ChromeDriver(); System.out.println("START"); }

    @Test
    public void TestCase2 () {
        System.out.println("Hosts 1");
        driver.get("http://puppy.sunn7y.website/login");
        driver.findElement(By.id("email")).sendKeys("test@test.com");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        driver.get("http://puppy.sunn7y.website/hosts");

  //  catch (Exception e) { System.out.println("button is missing ");}
    }
    @After
    public void close () {
        driver.quit();
        System.out.println("FINISH");  }}
