package Utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import BaseClass.Base;
import io.qameta.allure.Attachment;

public class AllureListeners extends Base implements ITestListener {

    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] saveFailureScreenShots(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value = "{0}", type = "text/plain")
    public String saveTextingLog(String message) {
        return message;
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("In onStart method " + iTestContext.getName());
//         iTestContext.setAttribute("WebDriver", Base.driver);
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("In onFinish method " + iTestContext.getName());
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("In onTestStart method " + getTestMethodName(iTestResult) + " start");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("In onTestSuccess method " + getTestMethodName(iTestResult) + " success");
    }

    
//    public void onTestFailure(ITestResult iTestResult) {
//        System.out.println("In onTestFailure method " + getTestMethodName(iTestResult) + " failure");
//        Object testClass = iTestResult.getInstance();
//        WebDriver driver = Base.driver;
//        if (driver != null && driver instanceof TakesScreenshot) {
//            System.out.println("Screenshot captured for test case: " + getTestMethodName(iTestResult));
//            saveFailureScreenShots(driver);
//        } else {
//            System.err.println("WebDriver is not initialized or does not support screenshots.");
//        }
//
//        saveTextingLog(getTestMethodName(iTestResult) + " failed and Screenshot taken!");
//    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("In onTestSkipped method " + getTestMethodName(iTestResult) + " skipped");
      
    }
}
