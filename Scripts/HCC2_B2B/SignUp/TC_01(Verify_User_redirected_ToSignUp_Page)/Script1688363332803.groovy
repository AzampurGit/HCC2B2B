import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

  import testlink.api.java.client.TestLinkAPIClient; import
  testlink.api.java.client.TestLinkAPIException; import
  testlink.api.java.client.TestLinkAPIResults;
 

CustomKeywords.'hcc2_b2b.CreateAccount.RedirectToSignUpPage'()

TestLinkAPIClient api=new TestLinkAPIClient("bbbc7b437b068d1b4e9aa9e705daa503", "http://testlink.netsol.in/testlink/lib/api/xmlrpc.php");

TestLinkAPIResults.TEST_PASSED

api.reportTestCaseResult("HCC2(B2B)", "B2B_TestPlan", "B2B-1", "B2B_Build", "Passed through automation", "p")