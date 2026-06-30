package tests;

import org.openqa.selenium.By;
import com.aventstack.extentreports.ExtentTest;

public class OpenNoteTest {

    public void OpenNote(ExtentTest test) throws Exception {

        Thread.sleep(5000);

        AppOpen.driver.findElement(
                By.xpath("//*[@text='Notification']"))
                .click();

        test.pass("Clicked on note: Notification");

        Thread.sleep(2000);

        AppOpen.driver.findElement(
                By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"))
                .click();

        test.pass("Clicked on Navigate Up button");

        Thread.sleep(2000);

        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/note_list_title_text"))
                .click();

        test.pass("Clicked on note from notes list");

        Thread.sleep(2000);

        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/textNoteTitleEdit"))
                .sendKeys("Notification");

        test.pass("Entered title in Title field");

        Thread.sleep(2000);

        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/textNoteContentEdit"))
                .sendKeys("This is my first note");

        test.pass("Entered content in Content field");

        test.pass("Open Note Test Completed Successfully");
    }
}