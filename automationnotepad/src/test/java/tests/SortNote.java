package tests;

import org.openqa.selenium.By;
import com.aventstack.extentreports.ExtentTest;

public class SortNote {

    public void sortNote(ExtentTest test) throws Exception {

        // Collapse sidebar
        AppOpen.driver.findElement(
                By.xpath("//android.widget.ImageButton[@content-desc='Collapse']"))
                .click();

        test.pass("Clicked on Collapse button");

        Thread.sleep(2000);

        // Click Sort option
        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/action_sort"))
                .click();

        test.pass("Clicked on Sort menu option");

        Thread.sleep(2000);

        // Select sorting type
        AppOpen.driver.findElement(
                By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='edit date: from newest']"))
                .click();

        test.pass("Selected sort option: edit date from newest");

        Thread.sleep(2000);

        // Click SORT button
        AppOpen.driver.findElement(
                By.xpath("//android.widget.Button[@text='SORT']"))
                .click();

        test.pass("Clicked on SORT button to apply sorting");

        Thread.sleep(2000);

        test.pass("Sort Note Test Completed Successfully");
    }
}