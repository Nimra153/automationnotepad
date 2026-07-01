package tests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppOpen {

    public static AndroidDriver driver;

    public AndroidDriver launchApp() {

        try {

//        	git practice
//        	git learning
        	
            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("platformName", "Android");
            caps.setCapability("appium:automationName", "UiAutomator2");
            caps.setCapability("appium:platformVersion", "13");
            caps.setCapability("appium:deviceName", "342550973800032");
            caps.setCapability("appium:udid", "342550973800032");

            caps.setCapability("appium:appPackage", "com.atomczak.notepat");
            caps.setCapability("appium:appActivity", ".MainActivity");

            caps.setCapability("appium:disableWindowAnimation", true);
            caps.setCapability("appium:ignoreHiddenApiPolicyError", true);
            caps.setCapability("appium:autoGrantPermissions", true);

            driver = new AndroidDriver(
                    new URL("http://127.0.0.1:4723"),
                    caps);

            Thread.sleep(5000);

            System.out.println("Application Opened Successfully");

        } catch (Exception e) {

            System.out.println("Application Failed To Open");
            e.printStackTrace();
        }

        return driver;
    }
}