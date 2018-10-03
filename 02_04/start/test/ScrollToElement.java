import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name=driver.findElement(By.id("name"));

        Actions action=new Actions(driver);

        action.moveToElement(name);

        name.sendKeys("Manoj Kumar");

        WebElement date=driver.findElement(By.id("date"));

        date.sendKeys("10/1/18");

        Thread.sleep(2000);

        driver.quit();
    }
}
