package mdms;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSelenium() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.name("login")).clear();
    driver.findElement(By.name("login")).sendKeys("admin");
    driver.findElement(By.name("login")).clear();
    driver.findElement(By.name("login")).sendKeys("admin");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.cssSelector("button.btn.btn-success")).click();
    driver.findElement(By.cssSelector("button.btn.btn-success")).click();
    driver.findElement(By.linkText("Sign out")).click();
    driver.findElement(By.linkText("Sign out")).click();
    driver.findElement(By.name("login")).clear();
    driver.findElement(By.name("login")).sendKeys("admin");
    driver.findElement(By.name("login")).clear();
    driver.findElement(By.name("login")).sendKeys("admin");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("adminn");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("adminn");
    driver.findElement(By.cssSelector("button.btn.btn-success")).click();
    driver.findElement(By.cssSelector("button.btn.btn-success")).click();
    driver.findElement(By.name("login")).clear();
    driver.findElement(By.name("login")).sendKeys("adminn");
    driver.findElement(By.name("login")).clear();
    driver.findElement(By.name("login")).sendKeys("adminn");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.cssSelector("button.btn.btn-success")).click();
    driver.findElement(By.cssSelector("button.btn.btn-success")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[2]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[2]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[3]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[3]")).click();
    driver.findElement(By.name("login")).clear();
    driver.findElement(By.name("login")).sendKeys("admin");
    driver.findElement(By.name("login")).clear();
    driver.findElement(By.name("login")).sendKeys("admin");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.cssSelector("button.btn.btn-success")).click();
    driver.findElement(By.cssSelector("button.btn.btn-success")).click();
    driver.findElement(By.linkText("Add article")).click();
    driver.findElement(By.linkText("Add article")).click();
    driver.findElement(By.cssSelector("div > textarea")).clear();
    driver.findElement(By.cssSelector("div > textarea")).sendKeys("essayer");
    driver.findElement(By.cssSelector("div > textarea")).clear();
    driver.findElement(By.cssSelector("div > textarea")).sendKeys("essayer");
    driver.findElement(By.id("save")).click();
    driver.findElement(By.id("save")).click();
    driver.findElement(By.cssSelector("div > textarea")).clear();
    driver.findElement(By.cssSelector("div > textarea")).sendKeys("itre");
    driver.findElement(By.cssSelector("div > textarea")).clear();
    driver.findElement(By.cssSelector("div > textarea")).sendKeys("itre");
    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("Voilà mon titre");
    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("Voilà mon titre");
    driver.findElement(By.id("save")).click();
    driver.findElement(By.id("save")).click();
    driver.findElement(By.linkText("Add article")).click();
    driver.findElement(By.linkText("Add article")).click();
    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("Test sans contenu");
    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("Test sans contenu");
    driver.findElement(By.id("save")).click();
    driver.findElement(By.id("save")).click();
    driver.findElement(By.cssSelector("div > textarea")).clear();
    driver.findElement(By.cssSelector("div > textarea")).sendKeys("voir un contenu !!");
    driver.findElement(By.cssSelector("div > textarea")).clear();
    driver.findElement(By.cssSelector("div > textarea")).sendKeys("voir un contenu !!");
    driver.findElement(By.id("save")).click();
    driver.findElement(By.id("save")).click();
    driver.findElement(By.linkText("Add article")).click();
    driver.findElement(By.linkText("Add article")).click();
    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("=====");
    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("=====");
    driver.findElement(By.cssSelector("div > textarea")).clear();
    driver.findElement(By.cssSelector("div > textarea")).sendKeys("On va tester le bleuOups ça bug");
    driver.findElement(By.cssSelector("div > textarea")).clear();
    driver.findElement(By.cssSelector("div > textarea")).sendKeys("On va tester le bleuOups ça bug");
    driver.findElement(By.id("save")).click();
    driver.findElement(By.id("save")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[5]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[5]")).click();
    driver.findElement(By.cssSelector("div > textarea")).clear();
    driver.findElement(By.cssSelector("div > textarea")).sendKeys("======");
    driver.findElement(By.cssSelector("div > textarea")).clear();
    driver.findElement(By.cssSelector("div > textarea")).sendKeys("======");
    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("tester");
    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("tester");
    driver.findElement(By.cssSelector("div > textarea")).clear();
    driver.findElement(By.cssSelector("div > textarea")).sendKeys("On va tester le bleu\nOups ça bug\n======\ntester");
    driver.findElement(By.cssSelector("div > textarea")).clear();
    driver.findElement(By.cssSelector("div > textarea")).sendKeys("On va tester le bleu\nOups ça bug\n======\ntester");
    driver.findElement(By.cssSelector("div > textarea")).clear();
    driver.findElement(By.cssSelector("div > textarea")).sendKeys("test");
    driver.findElement(By.cssSelector("div > textarea")).clear();
    driver.findElement(By.cssSelector("div > textarea")).sendKeys("test");
    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("=====");
    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("=====");
    driver.findElement(By.cssSelector("div > textarea")).clear();
    driver.findElement(By.cssSelector("div > textarea")).sendKeys("");
    driver.findElement(By.cssSelector("div > textarea")).clear();
    driver.findElement(By.cssSelector("div > textarea")).sendKeys("");
    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("=====On va mettre du bleu");
    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("=====On va mettre du bleu");
    driver.findElement(By.cssSelector("div > textarea")).clear();
    driver.findElement(By.cssSelector("div > textarea")).sendKeys("n bleu=====Si c'est pas beau ça !!");
    driver.findElement(By.cssSelector("div > textarea")).clear();
    driver.findElement(By.cssSelector("div > textarea")).sendKeys("n bleu=====Si c'est pas beau ça !!");
    driver.findElement(By.id("save")).click();
    driver.findElement(By.id("save")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[5]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[5]")).click();
    driver.findElement(By.id("save")).click();
    driver.findElement(By.id("save")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[5]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[5]")).click();
    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("=====C'est pour grandir la taille du texte");
    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("=====C'est pour grandir la taille du texte");
    driver.findElement(By.id("save")).click();
    driver.findElement(By.id("save")).click();
    driver.findElement(By.linkText("Add article")).click();
    driver.findElement(By.linkText("Add article")).click();
    driver.findElement(By.linkText("Cancel")).click();
    driver.findElement(By.linkText("Cancel")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[4]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[4]")).click();
    driver.findElement(By.id("save")).click();
    driver.findElement(By.id("save")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[5]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[5]")).click();
    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("C'est pour grandir la taille du texte");
    driver.findElement(By.id("title")).clear();
    driver.findElement(By.id("title")).sendKeys("C'est pour grandir la taille du texte");
    driver.findElement(By.id("save")).click();
    driver.findElement(By.id("save")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Delete')])[5]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Delete')])[5]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Delete')])[2]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Delete')])[2]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
