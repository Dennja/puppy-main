import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
public class authFunctionalTestPUP3003AUT1 { public ChromeDriver driver;

    @Before
    public void setDriver() { System.setProperty("webdriver.chrome.driver", "C://CH//chromedriver.exe");
        driver = new ChromeDriver(); System.out.println("START"); }

    @Test public void TestCase1() { System.out.println("Authentification functional test 1");
        driver.get("http://puppy.sunn7y.website/pets");
        try {driver.findElement(By.cssSelector("[href=\"http://puppy.sunn7y.website/login\"]"));}
        catch (NoSuchElementException e) {System.out.println("Юзер залогинен, для этого теста юзер должен быть не залогиненым"); notify(); }
        driver.findElement(By.cssSelector("[href=\"/pets/1\"]")).click();
        try { driver.findElement(By.className("content")); }
        catch (NoSuchElementException r) { System.out.println("мы не достигли страницы питомца"); notify(); }}

    @Test public void TestCase2() { System.out.println("Authentification functional test 2");
        driver.get("http://puppy.sunn7y.website/pets/1/edit");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Pet for rent App"));}

    @Test public void TestCase3() { System.out.println("Authentification functional test 3");
        driver.get("http://puppy.sunn7y.website/login");
        driver.findElement(By.id("email")).sendKeys("test@test.com");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        ///не пускает редактировать своего пета
        driver.get("http://puppy.sunn7y.website/pets/1/edit");
        String title = driver.getTitle();
        try { Assert.assertTrue(title.equals("Edit your pet's info")); }
        catch (Exception e){System.out.println("We are not on pet's editing page");notify();}}

    @Test public void TestCase4() { System.out.println("Authentification functional test 4");
        driver.get("http://puppy.sunn7y.website/login");
        driver.findElement(By.id("email")).sendKeys("test@test.com");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        driver.get("http://puppy.sunn7y.website/pets/3/edit");
        //Уникальный тайтл не сделан, костыли:
        try { driver.findElement(By.cssSelector("[href=\"/pets/1\"]"));}
        catch (Exception e) { System.out.println(" there should be the first pet on the page"); notify();}
        try { driver.findElement(By.cssSelector("[href=\"/pets/2\"]")); }
        catch (Exception e) { System.out.println(" there should be the second pet on the page"); notify();}
        try { driver.findElement(By.cssSelector("[href=\"/pets/3\"]")); }
        catch (Exception e) { System.out.println(" there should be the third pet on the page");  notify();}
        try { driver.findElement(By.className("alert")); }
        catch (NoSuchElementException r) { System.out.println("мы достигли страницы питомца"); notify(); }}

    @Test public void TestCase5() { System.out.println("Authentification functional test 5");
        driver.get("http://puppy.sunn7y.website/login");
        driver.findElement(By.id("email")).sendKeys("dennjacrafter@gmail.com");
        driver.findElement(By.id("password")).sendKeys("dennjacrafter");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        // не заходит на страницу едита своего питомца, любого из них
        driver.get("http://puppy.sunn7y.website/pets/19/edit");
        String title = driver.getTitle();
        try { Assert.assertTrue(title.equals("Edit your pet's info")); }
        catch (Exception e){System.out.println("We are not on pet's editing page");notify();}}

    @After public  void close(){
        //driver.quit();
        System.out.println("FINISH");}}