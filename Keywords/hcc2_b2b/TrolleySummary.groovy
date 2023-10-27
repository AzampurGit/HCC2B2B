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

public class TrolleySummary {
	@Keyword
	def CheckDetailsOfTrolleySummary() {
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/TrolleySummary/Text_TrolleySummary')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/TrolleySummary/Text_ApplyDiscountCoupon')) ==  true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_ProfitOnRetuen_RevisedTrolley'))== true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/TrolleySummary/Text_POR_TrolleySummary')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/TrolleySummary/Text_subtotal_trolleysummary')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/TrolleySummary/Text_vat_trolleySummary')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/TrolleySummary/Text_OrderTotal_TrolleySummary')) == true
	}

	@Keyword
	def CheckDiscountCouponCollapsedState() {
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/TrolleySummary/Dropdown_DiscountCoupon_TrolleySummary')) == true
		WebUI.click(findTestObject('Object Repository/TrolleySummary/Dropdown_DiscountCoupon_TrolleySummary'))
	}
	@Keyword
	def CheckValidAppliedCouponFunctionality() {
		WebUI.click(findTestObject('Object Repository/TrolleySummary/Dropdown_DiscountCoupon_TrolleySummary'))
		WebUI.sendKeys(findTestObject('Object Repository/TrolleySummary/Textbox_Couponcode_trolleySummary'), GlobalVariable.DiscountCoupon)
		WebUI.click(findTestObject('Object Repository/TrolleySummary/Button_Apply_discountcode'))
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/TrolleySummary/Text_Discountcode'), 4) ==  true
	}
	@Keyword
	def CheckValidationForInvalidDiscountCoupon()
	{
		WebUI.click(findTestObject('Object Repository/TrolleySummary/Dropdown_DiscountCoupon_TrolleySummary'))
		WebUI.sendKeys(findTestObject('Object Repository/TrolleySummary/Textbox_Couponcode_trolleySummary'),GlobalVariable.InvalidDiscountCoupon)
		WebUI.click(findTestObject('Object Repository/TrolleySummary/Button_Apply_discountcode'))
		//assert WebUI.verifyElementPresent(findTestObject('Object Repository/TrolleySummary/Message_InvalidDiscountCoupon'), 2) == true
			}
}
