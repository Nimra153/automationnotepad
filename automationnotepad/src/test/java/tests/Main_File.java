package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Main_File {

    ExtentReports extent;
    ExtentTest test;

    @BeforeClass
    public void setup() {

        extent = ExtentManager.getInstance();

        AppOpen app = new AppOpen();
        app.launchApp();

        System.out.println("Application launched successfully");
    }

    @Test(priority = 1)
    public void createNoteTest() throws Exception {

        test = extent.createTest("Create Note Test");

        CreateNoteTest.CreateNote(test);

        test.pass("Create Note executed successfully");
    }

    @Test(priority = 2, dependsOnMethods = "createNoteTest")
    public void openNoteTest() throws Exception {

        test = extent.createTest("Open Note Test");

        OpenNoteTest open = new OpenNoteTest();
        open.OpenNote(test);

        test.pass("Open Note executed successfully");
    }

    @Test(priority = 3, dependsOnMethods = "openNoteTest")
    public void editNoteTest() throws Exception {

        test = extent.createTest("Edit Note Test");

        EditNoteTest.EditNoteTest(test);

        test.pass("Edit Note executed successfully");
    }

    @Test(priority = 4, dependsOnMethods = "editNoteTest")
    public void deleteNoteTest() throws Exception {

        test = extent.createTest("Delete Note Test");

        DeleteNote delete = new DeleteNote();
        delete.deleteNote(test);

        test.pass("Delete Note executed successfully");
    }

    @Test(priority = 5)
    public void searchNoteTest() throws Exception {

        test = extent.createTest("Search Note Test");

        SearchNoteTest search = new SearchNoteTest();
        SearchNoteTest.searchNote(test);

        test.pass("Search Note executed successfully");
    }

    @Test(priority = 6)
    public void sortNoteTest() throws Exception {

        test = extent.createTest("Sort Note Test");

        SortNote sort = new SortNote();
        sort.sortNote(test);

        test.pass("Sort Note executed successfully");
    }

    @Test(priority = 7)
    public void createMultipleNotesTest() throws Exception {

        test = extent.createTest("Create Multiple Notes Test");

        CreateMultipleNotes.createMultipleNotes(test);

        test.pass("Create Multiple Notes executed successfully");
    }

    @AfterClass
    public void tearDown() {

        extent.flush();

        try {
            if (AppOpen.driver != null) {
                AppOpen.driver.quit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Report Generated Successfully");
    }
}