package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    HomePage homePage =new HomePage();
    @Test
    public void verifyPageNavigation(){
        homePage.selectMenu("Gift Cards");
        Assert.assertEquals(homePage.getHeadingText(),"Gift Cards","User is not navigated successfully");
    }






}