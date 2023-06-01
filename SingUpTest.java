import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static java.lang.System.setProperties;
public class SingUpTest {
    @Test
    public void ZipCodeShould5Digits() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");

        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("12345");

        WebElement continueButton = driver.findElement(By.cssSelector("[value=Continue]"));
        continueButton.click();

        WebElement registerButton = driver.findElement(By.cssSelector("[value=Register]"));
        boolean isDisplayed = registerButton.isDisplayed();

        Assert.assertTrue(isDisplayed, "Нужная страница не найдена");

        driver.quit();
    }
    @Test
    public void ZipCodeShould4Digits() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");

        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("1234");

        WebElement  continueButton = driver.findElement(By.cssSelector("[value=Continue]"));
        continueButton.click();


        WebElement registerButton = driver.findElement(By.cssSelector("[class=error_message]"));
        boolean isDisplayed = registerButton.isDisplayed();

        String text = registerButton.getText();
        Assert.assertEquals(text, "Oops, error on page. ZIP code should have 5 digits","Ошибка Assert не сработал");

        driver.quit();
    }
    @Test
    public void SignUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");

        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("12345");

        WebElement continueButton = driver.findElement(By.cssSelector("[value=Continue]"));
        continueButton.click();

        WebElement firstNameInter = driver.findElement(By.cssSelector("[name=first_name ]"));
        firstNameInter.sendKeys("Slava");

        WebElement lastNameInter = driver.findElement(By.cssSelector("[name=last_name ]"));
        lastNameInter.sendKeys("Boloshenko");

        WebElement emailInter = driver.findElement(By.cssSelector("[ name=email ]"));
        emailInter.sendKeys("lenin133@mail.ru");

        WebElement passwordInter = driver.findElement(By.cssSelector("[ name=password1 ]"));
        passwordInter.sendKeys("12345");

        WebElement passwordConfirmInter = driver.findElement(By.cssSelector("[ name=password2 ]"));
        passwordConfirmInter.sendKeys("12345");

        WebElement  registerButton = driver.findElement(By.cssSelector("[value=Register]"));
      registerButton.click();

    }
    @Test
    public void enterSite(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");

        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));
        zipCodeInput.sendKeys("12345");

        WebElement continueButton = driver.findElement(By.cssSelector("[value=Continue]"));
        continueButton.click();

        WebElement firstNameInter = driver.findElement(By.cssSelector("[name=first_name ]"));
        firstNameInter.sendKeys("Slava");

        WebElement lastNameInter = driver.findElement(By.cssSelector("[name=last_name ]"));
        lastNameInter.sendKeys("Boloshenko");

        WebElement emailInter = driver.findElement(By.cssSelector("[ name=email ]"));
        emailInter.sendKeys("lenin133@mail.ru");

        WebElement passwordInter = driver.findElement(By.cssSelector("[ name=password1 ]"));
        passwordInter.sendKeys("12345");

        WebElement passwordConfirmInter = driver.findElement(By.cssSelector("[ name=password2 ]"));
        passwordConfirmInter.sendKeys("12345");

        WebElement  registerButton = driver.findElement(By.cssSelector("[value=Register]"));
        registerButton.click();

        WebElement sharelane = driver.findElement(By.cssSelector("[border]"));
        sharelane.click();

        WebElement emailLogin = driver.findElement(By.cssSelector("[ name=email ]"));
        emailLogin.sendKeys("ven_fuente@712.06.sharelane.com");

        WebElement passwordLogin = driver.findElement(By.cssSelector("[ name=password ]"));
        passwordLogin.sendKeys("1111");

        WebElement sharelaneLogin = driver.findElement(By.cssSelector("[value=Login]"));
        sharelaneLogin.click();

        driver.quit();

    }


    }

