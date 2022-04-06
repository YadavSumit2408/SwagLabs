//same
package cucumberOptions;

import com.aventstack.extentreports.*;
import extentReports.*;
import org.testng.*;


public class testNgListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        extentTestManager.startTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("HOORRAAYYY! :D");
        extentTestManager.getTest().log(Status.PASS, "Test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("SAAADDD :(");

        extentTestManager.getTest().log(Status.FAIL, "Test Failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        extentTestManager.getTest().log(Status.SKIP, "Test Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
        extentTestManager.endTest();
        extentReportManager.getInstance().flush();
    }
}
