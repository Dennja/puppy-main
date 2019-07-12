import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadAPictureFunctionalTestCreatePetPUP1404UPF1 {public ChromeDriver driver;
    @Before
    public void setDriver() { System.setProperty("webdriver.chrome.driver", "C://CH//chromedriver.exe");
        driver = new ChromeDriver(); System.out.println("START"); }

    @Test
    public void TestCase1() {
        System.out.println("Typical flow functional test 1");
        driver.get("http://puppy.sunn7y.website/login");
        driver.findElement(By.id("email")).sendKeys("dennjacrafter@gmail.com");
        driver.findElement(By.id("password")).sendKeys("dennjacrafter");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        driver.get("http://puppy.sunn7y.website/pets/create");
        driver.findElement(By.name("pet_nickname")).sendKeys("LOBZICK");
        driver.findElement(By.name("pet_type_id")).sendKeys("DOG");
        driver.findElement(By.name("pet_about")).sendKeys("Adult male of Australian shepherd. Very friendly to strangers and he loves to be photographed. Sometimes noisy.");
        driver.findElement(By.id("cover_image")).sendKeys("C://CH//lobzick.jpg");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        try {driver.findElement(By.partialLinkText("LOBZICK"));}
        catch (Exception e) { System.out.println("New pet isn't in list"); notify();}
        }
    @Test
        public void TestCase2() {
        System.out.println("Typical flow functional test 1");
        driver.get("http://puppy.sunn7y.website/login");
        driver.findElement(By.id("email")).sendKeys("dennjacrafter@gmail.com");
        driver.findElement(By.id("password")).sendKeys("dennjacrafter");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        driver.get("http://puppy.sunn7y.website/pets/create");
        driver.findElement(By.name("pet_nickname")).sendKeys("Quickie");
        driver.findElement(By.name("pet_type_id")).sendKeys("CAT");
        driver.findElement(By.name("pet_about")).sendKeys("He is some kind of jerk.");
        driver.findElement(By.id("cover_image")).sendKeys("C://CH//G2.jpg");
//            driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
//        try { WebElement sizeAllert = driver.findElementByClassName("notification");
//           Assert.assertEquals(sizeAllert.getText(), "The cover image may not be greater than 2048 kilobytes.");}
//        catch (Exception e){ System.out.println("Scope of test: Picture must be bigger than 2 mb size");
//    }
    }
    @After
    public  void close(){
        //driver.quit();
        System.out.println("FINISH");}
}
