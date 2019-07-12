import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatePetPUP1404CPE2 {public ChromeDriver driver;

    @Before
    public void setDriver(){ System.setProperty("webdriver.chrome.driver", "C://CH//chromedriver.exe");
        driver = new ChromeDriver(); System.out.println("START"); }

    @Test
    public void TestCase1() { System.out.println("Create pet test 1"); driver.get("http://puppy.sunn7y.website/login");
        driver.findElement(By.id("email")).sendKeys("dennjacrafter@gmail.com");
        driver.findElement(By.id("password")).sendKeys("dennjacrafter");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

        driver.get("http://puppy.sunn7y.website/pets/create");
        driver.findElement(By.name("pet_nickname")).sendKeys("Sparkie");
        driver.findElement(By.name("pet_type_id")).sendKeys("DOG");
        driver.findElement(By.name("pet_about")).sendKeys("Very friendly to children, well mannered, loyal to the family");
        driver.findElement(By.id("cover_image")).sendKeys("C://CH//G.jpg");
//        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
//        try {driver.findElement(By.partialLinkText("Sparkie")).click();}
//        catch (Exception e) { System.out.println("New pet isn't in list"); notify();}
//        driver.findElementByPartialLinkText("Edit Sparkie's info").click();

    }
    @Test
    public void TestCase2 () {
        System.out.println("Create pet test 1");
        driver.get("http://puppy.sunn7y.website/login");
        driver.findElement(By.id("email")).sendKeys("test@test.com");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        driver.get("http://puppy.sunn7y.website/pets");
        try {driver.findElement(By.partialLinkText("Sparkie")).click();}
        catch (Exception e) { System.out.println("New pet isn't in list"); notify();}
        try { driver.findElementByPartialLinkText("Edit Sparkie's info").click();}
        catch (Exception e) { System.out.println("button is missing ");}
    }
        @After
    public void close () {
        //driver.quit();
        System.out.println("FINISH");  }}
