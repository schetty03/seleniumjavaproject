package JavaCodingExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

public class Seleniumdemo {
    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/V4/");

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("uid")));

        //fluent wait
        Wait w = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(Exception.class);
        w.until(ExpectedConditions.elementToBeClickable(By.name("btnLogin")));

        driver.findElement(By.name("uid")).sendKeys("hello");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('uid').value=hello");
       //a[contains(text(),'here')]


        URL url = new URL("https://demo.guru99.com/V4/");
        HttpURLConnection huc = (HttpURLConnection)url.openConnection();
        huc.setConnectTimeout(5000);
        huc.connect();
    }
}
