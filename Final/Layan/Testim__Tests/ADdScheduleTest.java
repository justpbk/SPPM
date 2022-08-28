// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ADdScheduleTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void aDdSchedule() {
    driver.get("https://lankatools.justpbk.com/admin/schedule.php");
    driver.manage().window().setSize(new Dimension(1440, 900));
    driver.findElement(By.cssSelector(".fa-plus")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".fa-plus"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("time_in")).click();
    driver.findElement(By.cssSelector(".open tr:nth-child(1) > td:nth-child(1) > a")).click();
    driver.findElement(By.cssSelector(".open tr:nth-child(1) > td:nth-child(1) > a")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".open tr:nth-child(1) > td:nth-child(1) > a"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector(".open tr:nth-child(1) > td:nth-child(1) > a")).click();
    driver.findElement(By.cssSelector(".open tr:nth-child(1) > td:nth-child(1) > a")).click();
    driver.findElement(By.cssSelector(".open tr:nth-child(1) > td:nth-child(1) > a")).click();
    driver.findElement(By.cssSelector(".open tr:nth-child(1) > td:nth-child(1) > a")).click();
    driver.findElement(By.linkText("Positions")).click();
    driver.findElement(By.cssSelector(".open tr:nth-child(1) > td:nth-child(1) > a")).click();
    driver.findElement(By.cssSelector(".open tr:nth-child(1) > td:nth-child(1) > a")).click();
    driver.findElement(By.cssSelector("#addnew .modal-footer")).click();
    driver.findElement(By.id("time_out")).click();
    driver.findElement(By.cssSelector(".open td:nth-child(1) .glyphicon-chevron-down")).click();
    driver.findElement(By.cssSelector(".open td:nth-child(1) .glyphicon-chevron-down")).click();
    driver.findElement(By.cssSelector(".open td:nth-child(1) .glyphicon-chevron-down")).click();
    driver.findElement(By.cssSelector(".open td:nth-child(1) .glyphicon-chevron-down")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".open td:nth-child(1) .glyphicon-chevron-down"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector(".open td:nth-child(1) .glyphicon-chevron-down")).click();
    driver.findElement(By.cssSelector(".open td:nth-child(1) .glyphicon-chevron-down")).click();
    driver.findElement(By.cssSelector(".open td:nth-child(1) .glyphicon-chevron-down")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".open td:nth-child(1) .glyphicon-chevron-down"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector("#addnew .modal-footer")).click();
    driver.findElement(By.name("add")).click();
  }
}
