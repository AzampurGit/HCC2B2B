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
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable



public class ProductReview_OnlineDelivery {
	@Keyword
	def CheckTrolleySummaryAtProductReviewPage() {
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryOption_Page/ValidationMessage_OnlineDelivery'), 2,FailureHandling.OPTIONAL)) {
			WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryOption_Page/Link_ViewDetails_DeliveryOPtions'), 3)
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
	def CheckRemoveAllLinkAlongwithValidationMsg() {
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_RemoveAll')) ==  true
	}
	@Keyword
	def CheckoptionsRemoveAndCancelInPopup() {
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_RemoveAll'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewAddressBook/Button_Yes_RemovePopUp')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_Cancel_popup')) == true
	}
	@Keyword
	def CheckClosingConfimrationPopup() {
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_RemoveAll'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_Cancel_popup'))
	}
	@Keyword
	def CheckNotifyBackAndRemoveTextAtProductListing() {
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_NotifyBack_ProductListing')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_TrolleySummary_ProductReview')) == true
	}
	@Keyword
	def CheckApplyChnagesButtonFunctionality() {
		WebUI.scrollToElement(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_TrolleySummary_ProductReview'), 2)
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Radio_NotifyMeback_ProductReview'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_ApplyChanges_productreview'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_EmptyTrolley_TrolleyPage')) == true
	}
	@Keyword
	def CheckApplyChangesButton()
	{
		WebUI.scrollToElement(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_TrolleySummary_ProductReview'), 2)
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Radio_NotifyMeback_ProductReview'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_ApplyChanges_productreview')) == true
	}
	@Keyword
	def CheckApplyChangesForRadioRemoveOption() {
		
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Radio_Remove_productReview'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_ApplyChanges_productreview'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_EmptyTrolley_TrolleyPage')) == true
	}
	@Keyword
	def CheckConfimrationMessageWhenAllVaidationsMeet() {
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_HomePage_logo'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_Add_SecondProduct'))
		WebUI.clearText(findTestObject('Object Repository/ProductReview_OnlineDelivery/Textbox_SecondProduct'))
		WebUI.sendKeys(findTestObject('Object Repository/ProductReview_OnlineDelivery/Textbox_SecondProduct'), GlobalVariable.MiniCartQty)
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_IncreaseSecondProduct'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_Add_ThirdProduct'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_GoToTRolley_MiniCart'))
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_ValidationMessage_OutOfStock')) == true
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Link_ViewDetails_DeliveryOPtions'))
		WebUI.scrollToElement(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_TrolleySummary_ProductReview'), 2)
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Radio_NotifyMeback_ProductReview'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_ApplyChanges_productreview'))
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_ProceedtoCheckOut_productReview'), 5) ==  true
		//WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		//assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_Checkout')) ==  true
	}
	@Keyword
	def CheckRevisedSummaryAtProductReviewPage() {
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_DiscountCoupon_RevisedTrolleyPage'), 2) == true
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_ProfitOnRetuen_RevisedTrolley'), 2) ==  true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_Subtotal_RevisedTrolleySummary')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_OrderTotal_RevisedTrolley')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_productReview')) == true
	}
	@Keyword
	def CheckItemsInCartAccordion() {
		WebUI.scrollToPosition(300, 350)
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Accordion_NoOfItems_ProductReview'))
	}
	@Keyword
	def CheckDIsabledContinueButton() {
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_HomePage_logo'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_Add_SecondProduct'))
		WebUI.clearText(findTestObject('Object Repository/ProductReview_OnlineDelivery/Textbox_SecondProduct'))
		WebUI.sendKeys(findTestObject('Object Repository/ProductReview_OnlineDelivery/Textbox_SecondProduct'), GlobalVariable.MiniCartQty)
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_IncreaseSecondProduct'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_Add_ThirdProduct'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_GoToTRolley_MiniCart'))
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_ValidationMessage_OutOfStock')) == true
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Link_ViewDetails_DeliveryOPtions'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_disabled_TrolleyPage')) == true
	}
	@Keyword
	def CheckAlertMessageAtTrolleyPage()
	{
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/AlertMessage_TrolleyPage')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_TrolleySummary_ProductReview')) == true
	}
	@Keyword
	def CheckProductsUnderOutOfStockAlertMessageAtProductReview()
	{
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_ProductTitle_Trolley'))  == true
	}
	@Keyword
	def CheckProductDetailsAtProductReview()
	{
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_ProductTitle_Trolley'))  == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_PackSize_ReviewPage')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_Por_ReviewPage')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_youMake_productReview')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_SellAt_Review')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_CashReturn_Review')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_ProductPrice_ReviewPage')) == true
	}
	@Keyword
	def CheckShowAlternateProductsAndChooseProducts()
	{
		WebUI.scrollToElement(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_TrolleySummary_ProductReview'), 2)
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_AlterbativeProducts'))
		WebUI.scrollToElement(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_Add_AlternativePriducts'), 2)
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_Add_AlternativePriducts'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_ProceedtoCheckOut_productReview')) == true
	}
	@Keyword
	def SelectUnselectRadioOptions()
	{
		WebUI.scrollToElement(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_TrolleySummary_ProductReview'), 2)
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Radio_NotifyMeback_ProductReview'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Radio_Remove_productReview'))
	}
	@Keyword
	def CloseAlternativeProductsSection()
	{
		WebUI.scrollToElement(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_TrolleySummary_ProductReview'), 2)
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_AlterbativeProducts'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_Cross_Alternative'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_AlternativeProducts_Review')) == true
	}
	@Keyword
	def CheckRevisedSummaryForOnline()
	{
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_AlterbativeProducts'))
		WebUI.scrollToPosition(600, 650)
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_Add_AlternativePriducts'))
	}
}
