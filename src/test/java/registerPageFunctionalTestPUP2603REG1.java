import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerPageFunctionalTestPUP2603REG1 { public ChromeDriver driver;
@Before
    public void setDriver() { System.setProperty("webdriver.chrome.driver", "C://CH//chromedriver.exe");
        driver = new ChromeDriver(); System.out.println("START"); driver.get("http://puppy.sunn7y.website/register");
}
    @Test public void TestCase1() { System.out.println("Register page functional test 1");
        try { driver.findElement(By.id("email")).sendKeys("dennja20089@gmail.com");                     }
        catch (NoSuchElementException e) { System.out.println("email field is missing");notify();                                }
        try { driver.findElement(By.id("password")).sendKeys("dennjacrafter");                            }
        catch (NoSuchElementException e) { System.out.println("password field is missing");notify();                             }
        try { driver.findElement(By.id("password-confirm")).sendKeys("dennjacrafter");                    }
        catch (NoSuchElementException e) { System.out.println("password-confirm field is missing"); notify();                    }
        try { driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();                                    }
        catch (NoSuchElementException e) { System.out.println("submit button is missing");System.out.println(e);notify();
        driver.findElementByClassName("Card-header");}
        try { WebElement dashboard = driver.findElementByClassName("card-body");
            Assert.assertEquals(dashboard.getText(), "Welcome! How are you today?");}
        catch (Exception e) { System.out.println("Validation was corrupted");//System.out.println(e);
             notify();}
}

    @Test public void TestCase2() {
        System.out.println("Register page functional test 2");
        driver.findElement(By.id("email")).sendKeys("dennjacraftergmail.com");
        driver.findElement(By.id("password")).sendKeys("dennjacrafter");
        driver.findElement(By.id("password-confirm")).sendKeys("dennjacrafter");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

        String title = driver.getTitle();
          Assert.assertTrue(title.equals("Register for some Pet Love"));
        }

    @Test public void TestCase3 (){ System.out.println("Register page functional test 3");
        driver.findElement(By.id("email")).sendKeys("test@test.com");
        driver.findElement(By.id("password")).sendKeys("dennjacrafter");
        driver.findElement(By.id("password-confirm")).sendKeys("dennjacrafter");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

        try { WebElement emailAllert = driver.findElementByClassName("invalid-feedback");
        Assert.assertEquals(emailAllert.getText(), "The email has already been taken.");}
        catch (Exception e){ System.out.println("Scope of test: Email must be already taken"); notify();                }
    }
    @Test public void TestCase4(){ System.out.println("Register page functional test 4");
        driver.findElement(By.id("email")).sendKeys("dennjacrafter6@gmail.com");
        driver.findElement(By.id("password")).sendKeys("dennjacrafter");
        driver.findElement(By.id("password-confirm")).sendKeys("dennjacrafter1");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

        try { WebElement passwordAllert = driver.findElementByClassName("invalid-feedback");
        Assert.assertEquals(passwordAllert.getText(), "The password confirmation does not match."); }
        catch (Exception e) {System.out.println("validation successful/ Scope of this test is bringing password-confirm failure field");notify();}
    }
@After public void close () {
    //driver.quit();
    System.out.println("FINISH");
    }}