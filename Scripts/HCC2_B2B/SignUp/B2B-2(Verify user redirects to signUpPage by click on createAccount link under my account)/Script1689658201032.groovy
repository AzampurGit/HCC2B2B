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


TestLinkAPIClient api=new TestLinkAPIClient(GlobalVariable.ApiInterfaceGui, GlobalVariable.xmlUrl);

api.reportTestCaseResult(GlobalVariable.ProjectName, GlobalVariable.TestPlan_Sprint1, "TC-B2B-2", GlobalVariable.BuildName_Sprint1, GlobalVariable.Comment, GlobalVariable.Status)

TestLinkAPIResults.TEST_PASSED

  
  
 // api.reportTestCaseResult('HCC-HANCOCK2(B2B)', 'Hancocks2(B2B)Plan', 'B2B-1',  'Hcc2-Build(B2B)', 'failed', 'f')
 
