import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class CreatePetPUP0704CPE1 { public ChromeDriver driver;

    @Before public void setDriver() { System.setProperty("webdriver.chrome.driver", "C://CH//chromedriver.exe");
        driver = new ChromeDriver(); System.out.println("START"); }

//        @Test
//        public void TestCase1() { System.out.println("Create pet test 1"); driver.get("http://puppy.sunn7y.website/login");
//            driver.findElement(By.id("email")).sendKeys("dennjacrafter@gmail.com");
//            driver.findElement(By.id("password")).sendKeys("dennjacrafter");
//            driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
//
//            driver.get("http://puppy.sunn7y.website/pets/create");
//            driver.findElement(By.name("pet_nickname")).sendKeys("Sharlin");
//            driver.findElement(By.name("pet_type_id")).sendKeys("DOG");
//        driver.findElement(By.name("pet_about")).sendKeys("Yong female of pariah-dog. Very friendly to children, well mannered, loyal to the family");
//        driver.findElement(By.id("cover_image")).sendKeys("C://CH//Lobzick.jpg");
//        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
//        try {driver.findElement(By.partialLinkText("Sharlin"));}
//        catch (Exception e) { System.out.println("New pet isn't in list"); notify();}
 //   }
    @Test
    public void TestCase2() {System.out.println("Create pet test 2");
        driver.get("http://puppy.sunn7y.website/login");
        driver.findElement(By.id("email")).sendKeys("dennjacrafter@gmail.com");
        driver.findElement(By.id("password")).sendKeys("dennjacrafter");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

        driver.get("http://puppy.sunn7y.website/pets/create");
        driver.findElement(By.name("pet_nickname")).sendKeys("Spunk");
        driver.findElement(By.name("pet_type_id")).sendKeys("DO");
        driver.findElement(By.name("pet_about")).sendKeys("Yong male of pariah-dog. Very friendly to children, well mannered, loyal to the family");
        driver.findElement(By.id("cover_image")).sendKeys("C://CH//Lobzick.jpg");
        try { driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();}
        catch (Exception e) { System.out.println("Button is inactive");}
        String title = driver.getTitle();
        try { Assert.assertTrue(title.equals("Creating a pet"));}
        catch (AssertionError e) { System.out.println("Title was changed"); notify();
        }}
    @Test
        public void TestCase3() { System.out.println("Create pet test 3");
            driver.get("http://puppy.sunn7y.website/login");
            driver.findElement(By.id("email")).sendKeys("dennjacrafter@gmail.com");
            driver.findElement(By.id("password")).sendKeys("dennjacrafter");
            driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

            driver.get("http://puppy.sunn7y.website/pets/create");
            driver.findElement(By.name("pet_nickname")).sendKeys("Sp");
            driver.findElement(By.name("pet_type_id")).sendKeys("DOG");
            driver.findElement(By.name("pet_about")).sendKeys("Yong male of pariah-dog. Very friendly to children, well mannered, loyal to the family");
            driver.findElement(By.id("cover_image")).sendKeys("C://CH//Lobzick.jpg");
            try { driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();}
            catch (Exception e) { System.out.println("Button is inactive");}
            String title = driver.getTitle();
            try { Assert.assertTrue(title.equals("Creating a pet"));}
            catch (AssertionError e) { System.out.println("registration succesful");notify();}}
        @After public void close () {
        driver.quit();
        System.out.println("FINISH");  }}
