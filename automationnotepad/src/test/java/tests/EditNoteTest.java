package tests;

import org.openqa.selenium.By;
import com.aventstack.extentreports.ExtentTest;

public class EditNoteTest {

    public static void EditNoteTest(ExtentTest test) throws Exception {

        Thread.sleep(8000);

        // Open Existing Note
        AppOpen.driver.findElement(
                By.xpath("//*[@text='Notification']"))
                .click();

        test.pass("Clicked on existing note: Notification");

        Thread.sleep(3000);

        // Clear My Title
        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/textNoteTitleEdit"))
                .clear();

        test.pass("Cleared existing note title");

        // Enter New Title
        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/textNoteTitleEdit"))
                .sendKeys("My Automation");

        test.pass("Entered new title: My Automation");

        Thread.sleep(2000);

        // Clear Content
        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/textNoteContentEdit"))
                .clear();

        test.pass("Cleared existing note content");

        Thread.sleep(2000);

        // Enter New content
        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/textNoteContentEdit"))
                .sendKeys("My edited note");

        test.pass("Entered new content: My edited note");

        Thread.sleep(2000);

        // Save Note
        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/action_save_note"))
                .click();

        test.pass("Clicked on Save Note button");

      
        test.pass("Edit Note Test Completed Successfully");
        
//        Git practice by Nimra
//       nimra project
    }
}