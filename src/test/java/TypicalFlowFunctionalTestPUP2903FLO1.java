import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypicalFlowFunctionalTestPUP2903FLO1 {  public ChromeDriver driver;
    @Before public void setDriver() { System.setProperty("webdriver.chrome.driver", "C://CH//chromedriver.exe");
        driver = new ChromeDriver(); System.out.println("START"); }

//    @Test
//    public void TestCase1() { System.out.println("Typical flow functional test 1");driver.get("http://puppy.sunn7y.website/login");
//        driver.findElement(By.id("email")).sendKeys("dennjacrafter@gmail.com");
//        driver.findElement(By.id("password")).sendKeys("dennjacrafter");
//        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
//            try { WebElement dashboard = driver.findElementByClassName("card-header");
//            Assert.assertEquals(dashboard.getText(), "Dashboard"); }
//            catch (Exception e) {System.out.println("Validation corrupted, we are not reaching dashboard");notify();}
//        driver.findElement(By.cssSelector("[href=\"http://puppy.sunn7y.website/pets\"]")).click();
//            try { driver.findElement(By.cssSelector("[href=\"/pets/1\"]"));}
//            catch (Exception e) { System.out.println("We are not reaching pet list page"); notify();}
//        driver.findElement(By.cssSelector("[href=\"http://puppy.sunn7y.website/dashboard\"]")).click();
//            try { WebElement dashboard = driver.findElementByClassName("card-header");
//            Assert.assertEquals(dashboard.getText(), "Dashboard"); }
//            catch (Exception e) {System.out.println("Validation corrupted, we are not reaching dashboard");notify();}
//        driver.findElement(By.partialLinkText("Home")).click();
//
//            String title = driver.getTitle();
//            try { Assert.assertTrue(title.equals("Welcome to the Pet for rent space! We hope you'll enjoy your experience!")); }
//            catch (Exception e){System.out.println("We are not reaching main page");}
//    }
    @After
    public  void close(){
        driver.quit();
        System.out.println("FINISH");}
    
}
