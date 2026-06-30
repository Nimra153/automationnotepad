package tests;

import org.openqa.selenium.By;
import com.aventstack.extentreports.ExtentTest;

public class CreateMultipleNotes {

    public static void createMultipleNotes(ExtentTest test) throws Exception {

        // ================= NOTE 1 =================

        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/new_note_fab"))
                .click();

        test.pass("Clicked on New Note button for Note 1");

        Thread.sleep(5000);

        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/textNoteTitleEdit"))
                .sendKeys("Note 1");

        test.pass("Entered title: Note 1");

        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/textNoteContentEdit"))
                .sendKeys("Practice of 1st Note");

        test.pass("Entered content for Note 1");

        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/action_save_note"))
                .click();

        test.pass("Saved Note 1");

        Thread.sleep(5000);

        AppOpen.driver.findElement(
                By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"))
                .click();

        test.pass("Back to Notes List after Note 1");

        Thread.sleep(3000);

        // ================= NOTE 2 =================

        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/new_note_fab"))
                .click();

        test.pass("Clicked on New Note button for Note 2");

        Thread.sleep(5000);

        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/textNoteTitleEdit"))
                .sendKeys("Note 2");

        test.pass("Entered title: Note 2");

        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/textNoteContentEdit"))
                .sendKeys("Practice of 2nd Note");

        test.pass("Entered content for Note 2");

        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/action_save_note"))
                .click();

        test.pass("Saved Note 2");

        Thread.sleep(5000);

        AppOpen.driver.findElement(
                By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"))
                .click();

        test.pass("Back to Notes List after Note 2");

        Thread.sleep(3000);

        // ================= NOTE 3 =================

        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/new_note_fab"))
                .click();

        test.pass("Clicked on New Note button for Note 3");

        Thread.sleep(5000);

        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/textNoteTitleEdit"))
                .sendKeys("Note 3");

        test.pass("Entered title: Note 3");

        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/textNoteContentEdit"))
                .sendKeys("Practice of 3rd Note");

        test.pass("Entered content for Note 3");

        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/action_save_note"))
                .click();

        test.pass("Saved Note 3");

        Thread.sleep(5000);

        AppOpen.driver.findElement(
                By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"))
                .click();

        test.pass("Back to Notes List after Note 3");

        test.pass("All 3 Notes Created Successfully");
    }
}