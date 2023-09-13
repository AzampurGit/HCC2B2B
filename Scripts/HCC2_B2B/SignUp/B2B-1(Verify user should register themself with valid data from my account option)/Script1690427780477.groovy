import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import testlink.api.java.client.TestLinkAPIClient
import testlink.api.java.client.TestLinkAPIException
import testlink.api.java.client.TestLinkAPIResults

  CustomKeywords.'hcc2_b2b.CreateAccount.RedirectToSignUpPage'()
  
  CustomKeywords.'hcc2_b2b.CreateAccount.CreateAccountWithValidData'()
 
TestLinkAPIClient api=new TestLinkAPIClient(GlobalVariable.ApiInterfaceGui, GlobalVariable.xmlUrl);

api.reportTestCaseResult(GlobalVariable.ProjectName, GlobalVariable.TestPlan_Sprint1, "TC-B2B-1", GlobalVariable.BuildName_Sprint1, GlobalVariable.Comment, GlobalVariable.Status)

TestLinkAPIResults.TEST_PASSED
  
/*
 * TestLinkAPIClient api=new TestLinkAPIClient(GlobalVariable.ApiInterfaceGui,
 * GlobalVariable.xmlUrl);
 * 
 * api.reportTestCaseResult(GlobalVariable.ProjectName, * GlobalVariable.TestPlan_Sprint1, "TC-B2B-1", * GlobalVariable.BuildName_Sprint1, GlobalVariable.Comment, * GlobalVariable.Status)
 * 
 * TestLinkAPIResults.TEST_PASSED
 */
//TestLinkAPIClient api=new TestLinkAPIClient(GlobalVariable.ApiInterfaceGui, GlobalVariable.xmlUrl);

/*
 * if(TestLinkAPIResults.TEST_PASSED == 'p') {
 * api.reportTestCaseResult(GlobalVariable.ProjectName,
 * GlobalVariable.TestPlan_Sprint1, "TC-B2B-1",
 * GlobalVariable.BuildName_Sprint1, GlobalVariable.Comment,
 * GlobalVariable.Status) println(TestLinkAPIResults.TEST_PASSED) } else {
 */
/*
 * TestLinkAPIResults.TEST_FAILED
 * api.reportTestCaseResult(GlobalVariable.ProjectName,
 * GlobalVariable.TestPlan_Sprint1, "TC-B2B-1",
 * GlobalVariable.BuildName_Sprint1, 'failed', 'f')
 */
	//println( TestLinkAPIResults.TEST_FAILED)
	 
	 //}




  



/*
 * TestLinkAPIResults.TEST_PASSED
 * 
 * api.reportTestCaseResult("HCC-HANCOCK2(B2B)", "Sprint1-Automation",
 * "TC-B2B-1", "Sprint1-Automation Build", "Passed through automation", "p")
 * 
 * TestLinkAPIResults.TEST_FAILED
 * 
 * api.reportTestCaseResult("HCC-HANCOCK2(B2B)", "Sprint1-Automation",
 * "TC-B2B-1", "Sprint1-Automation Build", "failed through automation", "f")
 */


/*
 * TestLinkAPIClient api = new
 * TestLinkAPIClient("3974fd9e71a1180289c2aa99c436f5e3",
 * "http://testlink.netsol.in/testlink/lib/api/xmlrpc.php"); println("Result" +
 * TestLinkAPIClient.TEST_PASSED)
 */
	/*
	 * @AfterTestCase def afterTestcase(TestCaseContext testCaseContext) { // def
	 * result = (testCaseContext.getTestCaseStatus() == 'FAILED') ?
	 * TestLinkAPIResults.TEST_FAILED : TestLinkAPIResults.TEST_PASSED;
	 * 
	 * }
	 */
  //api.reportTestCaseResult("HCC-HANCOCK2(B2B)", "Sprint1-Automation",  "TC-B2B-1", "Sprint1-Automation Build", "Passed through automation", result)
  //api.reportTestCaseResult("HCC-HANCOCK2(B2B)", "Sprint1-Automation",  "TC-B2B-1", "Sprint1-Automation Build", "failed through automation", result)
 
  
//  
//  boolean isTestPassed = true
//  
//  
//  if (isTestPassed) {
//  
//  api.reportTestCaseResult("HCC-HANCOCK2(B2B)", "Sprint1-Automation",  "TC-B2B-1", "Sprint1-Automation Build", "Passed through automation",  TestLinkAPIResults.TEST_PASSED) } 
//  else {
//  
//  api.reportTestCaseResult("HCC-HANCOCK2(B2B)", "Sprint1-Automation",  "TC-B2B-1", "Sprint1-Automation Build", "Failed through automation",  TestLinkAPIResults.TEST_FAILED) }
 