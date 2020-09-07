package com.cybertek.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SaucelabsIPhoneXS {

    AppiumDriver<MobileElement> driver;


    @Test
    public void SauceLabsTestWithIOS() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("appiumVersion", "1.17.1");
        desiredCapabilities.setCapability("deviceName","iPhone XS Simulator");
        desiredCapabilities.setCapability("deviceOrientation", "portrait");
        desiredCapabilities.setCapability("platformVersion","13.2");
        desiredCapabilities.setCapability("platformName", "iOS");
        desiredCapabilities.setCapability("browserName", "Safari");
        //to specfiy app for testing
        //it can be on your computer or somewhere in cloud
        driver = new AppiumDriver<>(new URL("https://ssk1822:3748395e-57cc-467f-9d9d-0084a99f9a53@ondemand.eu-central-1.saucelabs.com:443/wd/hub"),desiredCapabilities);

        driver.get("https://www.cybertekschool.com");

        Thread.sleep(2000);

        driver.quit();

    }

}