import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MultiBrowserTest {
    //Base Url =  //BaseUrl = https://www.saucedemo.com/
      static String baseUrl = "https://www.saucedemo.com/";
    //   //1. Setup Chrome browser
       static String browser = "Chrome";
    //   // static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        System.setProperty("webDriver.chrome.driver" ,"chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().window().maximize();

        //2.Open Url
        driver.get(baseUrl);

        //3.Print the title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);

        //4. Print the current url
        System.out.println("The current Url :" + driver.getCurrentUrl());

        //5. Print the page source
        String pageSorce = driver.getPageSource();
        System.out.println(driver.getPageSource());

        //6.Enter the email to email field
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("error_user");


        //7.Enter the password to password field
        WebElement passField = driver.findElement(By.id("password"));
        Thread.sleep(4000);

        //8.Click on login Button
        WebElement loginLink = driver.findElement(By.name("login-button"));
        loginLink.click();

        //9.Print the current Url
        System.out.println("The current Url : " + driver.getCurrentUrl());

        //10. Navigate to baseUrl
        driver.navigate().to(baseUrl);

        //11.Refresh the page
        driver.navigate().refresh();
        Thread.sleep(5000);

        //12.Close the browser
        driver.quit();

    }
}
