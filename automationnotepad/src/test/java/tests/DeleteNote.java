package tests;

import org.openqa.selenium.By;
import com.aventstack.extentreports.ExtentTest;

public class DeleteNote {

    public void deleteNote(ExtentTest test) throws Exception {

        // Open Note
        AppOpen.driver.findElement(
                By.xpath("//*[@text='My Automation']"))
                .click();

        test.pass("Opened note: My Automation");

        Thread.sleep(2000);

        // Click 3 dots menu
        AppOpen.driver.findElement(
                By.xpath("//android.widget.ImageView[@content-desc='More options']"))
                .click();

        test.pass("Clicked on More Options (3 dots menu)");

        Thread.sleep(2000);

        // Click Delete option
        AppOpen.driver.findElement(
                By.xpath("//android.widget.TextView[@resource-id='com.atomczak.notepat:id/title' and @text='Delete']"))
                .click();

        test.pass("Clicked on Delete option");

        Thread.sleep(2000);

        // Confirm Delete
        AppOpen.driver.findElement(
                By.id("android:id/button1"))
                .click();

        test.pass("Confirmed deletion (OK button clicked)");

        test.pass("Delete Note Test Completed Successfully");
    }
}