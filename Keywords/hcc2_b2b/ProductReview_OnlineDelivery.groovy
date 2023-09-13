package hcc2_b2b

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class ProductReview_OnlineDelivery {
	@Keyword
	def CheckTrolleySummaryAtProductReviewPage() {
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryOption_Page/ValidationMessage_OnlineDelivery'), 2,FailureHandling.OPTIONAL)) {
			WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Link_ViewDetails_DeliveryOPtions'))
			assert WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryOption_Page/Text_outofStock_productReview'),2) == true
			assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_productReview')) == true
			assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_TrolleySummary_ProductReview')) == true
		}
		else {
			WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
			assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_Checkout')) == true
		}
	}
	@Keyword
	def CheckRemoveAllOutofStockProductsFromProductReview() {
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_RemoveAll'))
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_Yes_RemovePopUp'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_EmptyTrolley_TrolleyPage')) == true
	}
	@Keyword
	def CheckRemoveAllLinkAlongwithValidationMsg()
	{
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_RemoveAll')) ==  true
		
	}
}
