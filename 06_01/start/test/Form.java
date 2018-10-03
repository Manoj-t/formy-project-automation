import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Manoj");

        driver.findElement(By.id("last-name")).sendKeys("Kumar");

        driver.findElement(By.id("job-title")).sendKeys("Developer");

        driver.findElement(By.id("radio-button-3")).click();

        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.cssSelector("option[value='2']"));

        driver.findElement(By.id("datepicker")).sendKeys("09/27/18");

        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

         driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        WebDriverWait wait = new WebDriverWait(driver,3);

        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));

        String alertText=alert.getText();

        


        driver.quit();
    }
}
