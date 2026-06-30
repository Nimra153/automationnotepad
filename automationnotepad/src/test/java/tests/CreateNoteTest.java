package tests;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;

public class CreateNoteTest {

    public static void CreateNote(ExtentTest test) throws Exception {

        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/new_note_fab"))
                .click();

        test.pass("Clicked on New Note (+) button");
        Thread.sleep(2000);

        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/textNoteTitleEdit"))
                .sendKeys("Notification");

        test.pass("Entered note title: Notification");
        Thread.sleep(2000);

        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/textNoteContentEdit"))
                .sendKeys("This is my first note");

        test.pass("Entered note content");
        Thread.sleep(2000);

        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/action_save_note"))
                .click();

        test.pass("Clicked on Save Note button");
        Thread.sleep(2000);

        test.pass("Create Note Test Completed Successfully");
    }
}