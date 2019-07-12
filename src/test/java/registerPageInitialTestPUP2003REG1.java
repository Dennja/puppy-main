import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class registerPageInitialTestPUP2003REG1 {
    public ChromeDriver driver;
    @Before
    public void setDriver() { System.setProperty("webdriver.chrome.driver", "C://CH//chromedriver.exe");
        driver = new ChromeDriver(); System.out.println("START");
    }
    @Test
    public void testCase1() { System.out.println("Register page initial test 1"); driver.get("http://puppy.sunn7y.website/register");
        String title = driver.getTitle();
        try { Assert.assertTrue(title.equals("Register for some Pet Love"));                                           }
        catch (AssertionError e) { System.out.println("Title was changed");notify();                                   }
        try { driver.findElement(By.className("card-header"));                                                        }
        catch (WebDriverException e){ System.out.println("card-header is missing");notify();
        }

//        try {
//        if (Assert.assertTrue(title.equals("Register for some Pet Love")) == false)
//        throw new AssertionError(e);
//            else if (driver.findElement(By.className("card-header")) != null)
//                throw new WebDriverException(e);}
//                catch (Exception e) { System.out.println(e);}
        }
    @Test
    public void testCase2(){ System.out.println("Register page initial test 2"); driver.get("http://puppy.sunn7y.website/register");
        String title = driver.getTitle();

        try { Assert.assertTrue(title.equals("Register for some Pet Love"));                                           }
        catch (AssertionError e) { System.out.println("Title was changed");notify();}
        try { driver.findElement(By.id("email")).sendKeys("dennjacrafter@gmail.com");                    }
        catch (NoSuchElementException e) { System.out.println("2 email field is missing");     }
        try { driver.findElement(By.id("password")).sendKeys("dennjacrafter");   }
        catch (NoSuchElementException e) { System.out.println("3 password field is missing"); }
        try { driver.findElement(By.id("password-confirm")) .sendKeys("dennjacrafter");        }
        catch (NoSuchElementException e) {System.out.println("4 password-confirm field is missing"); }
        try { driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();}
        catch (NoSuchElementException e) { System.out.println("5 submit button is missing!"); }

    }
    @Test
    public void testCase3(){ System.out.println("Register page initial test 3");
        driver.get("http://puppy.sunn7y.website/register");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Register for some Pet Love"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("goog-te-spinner-animation")));
        driver.findElement(By.id("email")).sendKeys("dennjacraftergmail.com");
        driver.findElement(By.id("password")).sendKeys("dennjacradter");
        driver.findElement(By.id("password-confirm")).sendKeys("dennjacrafter");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    }
    @Test
    public void testCase4() {
        System.out.println("Register page initial test 4");
        driver.get("http://puppy.sunn7y.website/register");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Register for some Pet Love"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("goog-te-spinner-animation")));
        driver.findElement(By.id("email")).sendKeys("dennjacrafter@gmail.com");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    }
    @Test
    public  void testCase5(){
        System.out.println("Register page initial test 5");
        driver.get("http://puppy.sunn7y.website/register");
        try {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[type=\"submit\"]")));
        try {
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();//id("submit")).click();
        } catch (WebDriverException e) {
        System.out.println("An exeptional case.");
        }
        } catch (TimeoutException e) {
        System.out.println("WebDriver could't locate the element");
        }
    }
    @After
    public  void close(){
   //driver.quit();
     System.out.println("FINISH");
    }
}
