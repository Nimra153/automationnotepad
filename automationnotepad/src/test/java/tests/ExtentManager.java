package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if (extent == null) {
            createInstance();
        }
        return extent;
    }

    public static ExtentReports createInstance() {

        String reportPath = System.getProperty("user.dir") + "/reports/AutomationReport.html";

        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        spark.config().setReportName("Mobile Automation Report");
        spark.config().setDocumentTitle("Appium Test Execution Report");

        extent = new ExtentReports();
        extent.attachReporter(spark);

        return extent;
    }
}
