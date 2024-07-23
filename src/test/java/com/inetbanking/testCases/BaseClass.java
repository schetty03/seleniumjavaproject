package com.inetbanking.testCases;

import com.inetbanking.utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseClass {

    ReadConfig config = new ReadConfig();
    public String baseURL = config.getApplicationURL();
    public String username =config.getUserName();
    public String password = config.getPassword();
    public static WebDriver driver;
    public static Logger logger;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        logger = LogManager.getLogger(BaseClass.class);





    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
