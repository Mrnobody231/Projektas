import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.AfterClass;


public class KayakTest extends KayakBase {

    private KayakHome kayakHome;

    public KayakTest() {
        super(driver);
    }

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MEDION\\Desktop\\chromedriver\\chromedriver_win32.chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        KayakBase.driver = new ChromeDriver(options);
        KayakBase.driver.manage().window().maximize();

    }

    @Test
    public void KayakStayTest(){
        KayakBase.goTo();
        KayakHome.stays();
    }

    @AfterClass
    public static void tearDown(){
//        driver.quit();
    }
}
