package tests;

import org.openqa.selenium.By;
import com.aventstack.extentreports.ExtentTest;

public class SearchNoteTest {

    public static void searchNote(ExtentTest test) throws Exception {

        // Click Search Icon
        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/action_search_note"))
                .click();

        test.pass("Clicked on Search icon");

        Thread.sleep(2000);

        // Enter search text
        AppOpen.driver.findElement(
                By.id("com.atomczak.notepat:id/search_src_text"))
                .sendKeys("Note 1");

        test.pass("Entered search text: Note 1");

        Thread.sleep(2000);

        test.pass("Search Note Test Completed Successfully");
    }
}