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

public class Saucelabs_SamsungGalaxyS8 {

    AppiumDriver<MobileElement> driver;

    @Test
    public void SauceLabsTest() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("appiumVersion", "1.17.1");
        desiredCapabilities.setCapability("deviceName","Samsung Galaxy S8 FHD GoogleAPI Emulator");
        desiredCapabilities.setCapability("deviceOrientation", "portrait");
        desiredCapabilities.setCapability("browserName", "");
        desiredCapabilities.setCapability("platformVersion","8.0");
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        //to specfiy app for testing
        //it can be on your computer or somewhere in cloud
        desiredCapabilities.setCapability("app","https://cybertek-appium.s3.amazonaws.com/etsy.apk");
        driver = new AppiumDriver<>(new URL("https://ssk1822:3748395e-57cc-467f-9d9d-0084a99f9a53@ondemand.eu-central-1.saucelabs.com:443/wd/hub"),desiredCapabilities);

        Thread.sleep(1000);

        MobileElement you = driver.findElement(MobileBy.AccessibilityId("You tab, 4 of 5"));
        you.click();
        Thread.sleep(1000);

        MobileElement settings = driver.findElement(By.xpath("//*[@text='Settings']"));
        settings.click();
        Thread.sleep(1000);

        MobileElement checkbox = driver.findElement(By.id("com.etsy.android:id/settings_checkbox"));
        checkbox.click();
        Thread.sleep(1000);

        //verify after click the checkbox it is not selected
        Assert.assertFalse(driver.findElement(By.id("com.etsy.android:id/settings_checkbox")).isSelected());
        Thread.sleep(1000);



        driver.quit();

    }


}