//package website.sunn7y.puppy;
//
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//public class simplePageTest {
//    public ChromeDriver driver;
//    @Before
//    public void setUp(){
//        System.setProperty("webdriver.chrome.driver", "C://CH//chromedriver.exe");
//        driver = new ChromeDriver();
//        System.out.println("START");
//    }
//    @Test
//    public void homePageTest() { System.out.println("Simple home page test 1");
//        driver.get("http://puppy.sunn7y.website");
//        String title = driver.getTitle();
//        Assert.assertTrue(title.equals("Welcome to the Pet for rent space! We hope you'll enjoy your experience!"));
//        try {
//            driver.findElementByName("style,top-right,position: absolute;right: 10px; top: 18px;");
//        } catch (Exception e) {
//            System.out.println("An exeptional case.");
//        }
//    }
//    @Test
//    public void ownerPageTest(){ System.out.println("Simple owner page test 1");
//        driver.get("http://puppy.sunn7y.website/owner");
//        String title = driver.getTitle();
//        Assert.assertTrue(title.equals("Pet for rent"));
//    }
//    @Test
//    public void petPageTest(){ System.out.println("Simple pet page test 1");
//        driver.get("http://puppy.sunn7y.website/pet");
//        String title = driver.getTitle();
//        Assert.assertTrue(title.equals("Pet for rent"));
//    }
//    @Test
//    public void loginPageTest() { System.out.println("Simple login page test 1");
//        driver.get("http://puppy.sunn7y.website/login");
//        String title = driver.getTitle();
//        Assert.assertTrue(title.equals("Pet for rent App"));
//    }
//    @After
//    public  void close(){
//        driver.quit();
//        System.out.println("FINISH");
//    }
//}
//
