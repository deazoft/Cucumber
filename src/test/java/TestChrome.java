import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {

    WebDriver driver;

    public void Open(String url) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
    }

    public void Navigate() throws InterruptedException {
        driver.get("https://portal.aws.amazon.com/gp/aws/manageYourAccount?nc2=h_m_ma");
        Thread.sleep(2000);
    }

    public void Login(String email){
        WebElement login = driver.findElement(By.id("resolving_input"));
        login.sendKeys(email);
        driver.findElement(By.id("next_button")).click();
    }
    public boolean ValidatePage(String id) throws InterruptedException {
        Thread.sleep(2000);
        return  !driver.findElements(By.id(id)).isEmpty();
    }
}
