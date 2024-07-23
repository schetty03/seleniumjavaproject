package com.inetbanking.testCases;

import com.inetbanking.pageObject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {

    @Test
    public void loginTest() {

        driver.get(baseURL);
        logger.info("URL is open");

        LoginPage page = new LoginPage(driver);

        page.setUserName(username);
        logger.info("entered username");
        page.setPassword(password);
        logger.info("entered pswd");
        page.clickButton();


        if(driver.getTitle().equals("Guru99 Bank Manager HomePage")){
            Assert.assertTrue(true);
            logger.info("login test passed");
        }
        else {
            Assert.assertTrue(false);
            logger.info("login test failed");
        }

    }


}
