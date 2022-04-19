package com.ContactUs.utilities;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter
{
public ExtentSparkReporter spark;
    public ExtentReports extent;
    public ExtentTest logger;
    
public void onStart(ITestContext testContext)
    {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date(0));//time stamp
        String repName="Test-Report-"+timeStamp+".html";

        spark=new ExtentSparkReporter(System.getProperty("user.dir")+ "/test-output/"+repName);//specify location of the report
        //spark.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");

        extent=new ExtentReports();

        extent.attachReporter(spark);

        spark.config().setDocumentTitle("Test Project"); 
        spark.config().setReportName("Functional Test Automation Report"); 
       // spark.config().setTestViewChartLocation(ChartLocation.TOP); 
        spark.config().setTheme(Theme.DARK);
    }

public void onTestSuccess(ITestResult tr)
    {
        logger=extent.createTest(tr.getName()); 
        logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN)); 



    }
}