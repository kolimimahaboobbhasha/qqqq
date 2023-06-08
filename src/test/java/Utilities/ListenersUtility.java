package Utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import StepDefenitions.NopCommerce;


public class ListenersUtility implements ITestListener {
	ExtentReports Reports;
	ExtentTest Test;
	ExtentSparkReporter htmlReport;
	Logutility log=new Logutility();
	public void onTestStart(ITestResult result) {
	
		String Methodname=result.getMethod().getMethodName();
		Test=Reports.createTest(Methodname);
		
	}

	public void onTestSuccess(ITestResult result) {
		String Methodname=result.getMethod().getMethodName();
		//Test.log(Status.PASS, Methodname+"SUCCESSFULLY PASSED");
		Test.log(Status.INFO, Methodname+"SUCCESSFULLY PASSED");
	}

	public void onTestFailure(ITestResult result) {
		WebDriverUtility wLib = new WebDriverUtility();
		JavaUtility jLib = new JavaUtility();
		String methodName = result.getMethod().getMethodName();//reflection api
		String screenShotName = methodName+"-"+jLib.getSystemDateInFormat();
		Test.log(Status.INFO, methodName+ "---> Failed");
		Test.log(Status.FAIL, result.getThrowable());
		try {
			String path = wLib.takeScreenShot(NopCommerce.sdriver, screenShotName);

		Test.addScreenCaptureFromPath(path); //Navigate to screenshot path and attach it to the report
      }  
		catch (IOException e)
		{
			e.printStackTrace();
			}
	}

	public void onTestSkipped(ITestResult result, String msg) {
		String MethodName = result.getMethod().getMethodName();
		Test.log(Status.SKIP, MethodName +" ---> Skipped");
		Test.log(Status.SKIP, result.getThrowable());
		Test.log(null, MethodName+" => is skipped because => "+msg);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
		Reports = new ExtentReports();
		File f=new File("ExtentReports.html");
		Reports.attachReporter(htmlReport);
		Reports.setSystemInfo("Base-Browser", "Chrome");
		Reports.setSystemInfo("Base-platform", "Windows");
		Reports.setSystemInfo("Base-URL", "http://localhost:8888");
		Reports.setSystemInfo("Reporter Name", "Basha");
		
		
		ExtentSparkReporter htmlReport = new ExtentSparkReporter(f);
		htmlReport.config().setDocumentTitle("Basha Cucumber FrameWork Execution Report");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setReportName("Project Execution Report");
	}
	
	 

		public static void main(String[] args) throws IOException {
			
	ExtentReports e=new ExtentReports();
	File file=new File("Proof.html");
	ExtentSparkReporter r=new ExtentSparkReporter(file);
	e.attachReporter(r);
	e.flush();
	Desktop.getDesktop().browse(new File("Proof.html").toURI());
		}
	}
