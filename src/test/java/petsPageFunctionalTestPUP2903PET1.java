import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class petsPageFunctionalTestPUP2903PET1 {
    public ChromeDriver driver;

    @Before public void setDriver() { System.setProperty("webdriver.chrome.driver", "C://CH//chromedriver.exe");
        driver = new ChromeDriver(); System.out.println("START"); }
    @Test
    public void TestCase1() { System.out.println("Pets page functional test 1"); driver.get("http://puppy.sunn7y.website/pets");
        try { driver.findElement(By.cssSelector("[href=\"/pets/1\"]"));}
        catch (Exception e) { System.out.println(" there should be the first pet on the page"); notify();}
        try { driver.findElement(By.cssSelector("[href=\"/pets/2\"]")); }
        catch (Exception e) { System.out.println(" there should be the second pet on the page"); notify();}
        try { driver.findElement(By.cssSelector("[href=\"/pets/3\"]")); }
        catch (Exception e) { System.out.println(" there should be the third pet on the page");  notify();}}
    @Test
    public void TestCase2() { System.out.println("Pets page functional test 2"); driver.get("http://puppy.sunn7y.website/login");
        driver.findElement(By.id("email")).sendKeys("dennjacrafter@gmail.com");
        driver.findElement(By.id("password")).sendKeys("dennjacrafter");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

        driver.get("http://puppy.sunn7y.website/pets/create");
        driver.findElement(By.name("pet_nickname")).sendKeys("LOBZICK");
        driver.findElement(By.name("pet_type")).sendKeys("DOG");
        driver.findElement(By.name("pet_about")).sendKeys("Adult male of Australian shepherd. Very friendly to strangers and he loves to be photographed. Sometimes noisy.");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        try {driver.findElement(By.partialLinkText("LOBZICK"));}
        catch (Exception e) { System.out.println("New pet isn't in list"); notify();}}
    @Test
    public void TestCase3() { System.out.println("Pets page functional test 3");
        driver.get("http://puppy.sunn7y.website/login");
        driver.findElement(By.id("email")).sendKeys("dennjacrafter@gmail.com");
        driver.findElement(By.id("password")).sendKeys("dennjacrafter");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

        driver.get("http://puppy.sunn7y.website/pets");
        try { driver.findElement(By.partialLinkText("LOBZICK")).click(); }
        catch (Exception e) { System.out.println("New pet isn't in list"); notify(); }
        driver.findElementByPartialLinkText("Edit LOBZICK's info").click();

        driver.findElement(By.name("pet_nickname")).clear();
        driver.findElement(By.name("pet_nickname")).sendKeys("LOBZICKUS");
        driver.findElement(By.name("pet_about")).sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), "Born in Poland.");
        driver.findElement(By.name("pet_about")).clear();
       driver.findElement(By.name("pet_about")).sendKeys("Adult male of Australian shepherd. Very friendly to strangers and he loves to be photographed. Sometimes noisy. Born in Poland.");

        driver.findElement(By.name("pet_nickname")).sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), "US");
        driver.findElement(By.name("pet_about")).sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), "Born in Poland.");

        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

        try { driver.findElement(By.partialLinkText("LOBZICKUS")).click(); }
        catch (Exception e) { System.out.println("pet name update is corrupted"); notify(); }
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Pet for rent"));

        try { driver.findElement(By.cssSelector("pet_about")).equals("Adult male of Australian shepherd." +
                    " Very friendly to strangers and he loves to be photographed. Sometimes noisy. Born in Poland.");
        } catch (Exception e) { System.out.println("pet about field update is corrupted"); notify(); }
    }

    @Test
    public void TestCase4() {        System.out.println("covering tracks");
        driver.get("http://puppy.sunn7y.website/login");
        driver.findElement(By.id("email")).sendKeys("dennjacrafter@gmail.com");
        driver.findElement(By.id("password")).sendKeys("dennjacrafter");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

        driver.get("http://puppy.sunn7y.website/pets");
        driver.findElement(By.partialLinkText("LOBZICKUS")).click();
        driver.findElementByPartialLinkText("Edit LOBZICKUS's info").click();

        driver.findElement(By.name("pet_nickname")).clear();
        driver.findElement(By.name("pet_nickname")).sendKeys("LOBZICK");
        driver.findElement(By.name("pet_about")).clear();
        driver.findElement(By.name("pet_about")).sendKeys("Adult male of Australian shepherd. Very friendly to strangers and he loves to be photographed. Sometimes noisy.");

        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    }
    @Test
    public void TestCase5() { System.out.println("covering tracks 2");
//        driver.get("http://puppy.sunn7y.website/login");
        driver.findElement(By.id("email")).sendKeys("dennjacrafter@gmail.com");
        driver.findElement(By.id("password")).sendKeys("dennjacrafter");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        driver.get("http://puppy.sunn7y.website/pets");
        driver.findElement(By.partialLinkText("LOBZICK")).click();
        driver.findElementByPartialLinkText("Edit LOBZICK's info").click();
        driver.findElementByPartialLinkText("Delete Pet").click();
    }
        @After public void close () {
        driver.quit();
        System.out.println("FINISH");  }}
