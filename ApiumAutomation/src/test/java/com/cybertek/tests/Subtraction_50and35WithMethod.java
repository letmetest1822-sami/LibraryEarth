package com.cybertek.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Subtraction_50and35WithMethod {

    AppiumDriver<MobileElement> driver;

    @Test
    public void test1() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        //we use android phone
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        //version of android
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION,"8.0");
        //name of the device, if it is real device we need to pass UUID parameter
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2");

        //either you specify app--> //path/to/app.apk
        //or if app is already installed, you need to specify appActivity and appPackage
        //this info you can find in the internet, at work - ask to developers

        // Set your application's package name.
        desiredCapabilities.setCapability("appPackage", "com.android.calculator2");

        // Set your application's MainActivity i.e. the LAUNCHER activity name.
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

        /*"http://localhost:4723/wd/hub" --> address of the appium server. If you have appium server on the same computer
        just use local host
        4723-->default port number
        //we need to provide 2 parameters: URL of appium servers and desired capabilities

        */
        driver = new AppiumDriver<>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);

        Thread.sleep(3000);

        // write code for 50 - 35 = 15

        MobileElement minus = driver.findElement(MobileBy.AccessibilityId("minus"));
        MobileElement equals = driver.findElement(MobileBy.AccessibilityId("equals"));
        MobileElement result = driver.findElement(By.id("com.android.calculator2:id/result"));

        createNumber(5).click();
        createNumber(0).click();

        minus.click();

        createNumber(3).click();
        createNumber(5).click();

        equals.click();


        String resultText = result.getText();

        Thread.sleep(3000);

        Assert.assertEquals(resultText, "15");


        //close the app at the end
        driver.closeApp();
    }

    public MobileElement createNumber(int number){
        String  param = "com.android.calculator2:id/digit_"+number;

        return driver.findElement(By.id(param));
    }

}