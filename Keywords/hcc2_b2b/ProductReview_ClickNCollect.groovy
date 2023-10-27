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

public class ProductReview_ClickNCollect {
	@Keyword
	def CheckOutOfStockValidationForClickNCollect() {
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/radio_ClickNCollect'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Link_SelectStore_DeliveryOPtions'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_SelectStore_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_viewDetails_ClickNCollect'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/DeliveryOption_Page/Text_ProductReviewPage_DeliveryOptions')) == true
	}
	@Keyword
	def CheckValidatoinsForSelectStoreofClickNCollect() {
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/radio_ClickNCollect'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Link_SelectStore_DeliveryOPtions'))
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/ProductRewview_ClickNCollect/Message_Validation_SelectStore'), 2) == true
	}
	@Keyword
	def CheckTrolleySummaryAlongWithOrderTotal() {
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_SelectStore_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_Continue_TrolleyPage'))
		 WebUI.verifyElementPresent(findTestObject('Object Repository/TrolleySummary/Text_TrolleySummary_Checkout'),3)
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_OrderTotal_Checkout')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/TrolleySummary/Text_Vat_Percentage_TrolleySummary')) == true
	}
	@Keyword
	def CheckRemoveAllOptionAtProductReview() {
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_SelectStore_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_viewDetails_ClickNCollect'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_RemoveAll')) ==  true
	}
	@Keyword
	def CheckConfirmationpopUpwithDeleteAndCancelOption() {
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_SelectStore_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_viewDetails_ClickNCollect'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_RemoveAll'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewAddressBook/Button_Yes_RemovePopUp')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_Cancel_popup')) == true
	}
	@Keyword
	def CheckRemoveAllFunctionalityAtProductReview() {
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_SelectStore_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_viewDetails_ClickNCollect'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_RemoveAll'))
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_Yes_RemovePopUp'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_EmptyTrolley_TrolleyPage')) ==  true
	}
	@Keyword
	def CheckClosingConfirmationPopUP() {
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_SelectStore_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_viewDetails_ClickNCollect'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_RemoveAll'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_Cancel_popup'))
	}
	@Keyword
	def CheckOutOfStockProductListAtReviewPage() {
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_SelectStore_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_viewDetails_ClickNCollect'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductRewview_ClickNCollect/Text_ProductTitle_productReview')) ==  true
	}
	@Keyword
	def CheckAlternativeProducts() {
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_SelectStore_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_viewDetails_ClickNCollect'))
		WebUI.scrollToElement(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_TrolleySummary_ProductReview'), 2)
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_AlterbativeProducts'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductRewview_ClickNCollect/Text_Alternative_ProductReview')) == true
	}
	@Keyword
	def CheckNotifyMeAndRemoveRadioOptions() {
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_SelectStore_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_viewDetails_ClickNCollect'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductRewview_ClickNCollect/Text_NotifyMe_ProductReview')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_Remove_ProductReview')) == true
	}
	@Keyword
	def CheckApplyChangesAfterSelectingNotifyMe() {
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_SelectStore_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_viewDetails_ClickNCollect'))
		WebUI.scrollToElement(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_TrolleySummary_ProductReview'), 0)
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Radio_NotifyMeback_ProductReview'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_ApplyChanges_productreview'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_EmptyTrolley_TrolleyPage')) ==  true
	}
	@Keyword
	def CheckConfirmationMsgWithProceedToChekoutOPtion() {
	
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/radio_ClickNCollect'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Link_SelectStore_DeliveryOPtions'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_SelectStore_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_viewDetails_ClickNCollect'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_RemoveAll'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Button_Remove_PopUP_TrolleySection'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_ProceedtoCheckOut_productReview'),3)
		//WebUI.clearText(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'))
		
			/*WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_Add_FirstProduct'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_Add_SecondProduct'))
		WebUI.clearText(findTestObject('Object Repository/ProductRewview_ClickNCollect/Textbox_Clear_SecondProduct'))
		WebUI.sendKeys(findTestObject('Object Repository/ProductRewview_ClickNCollect/Textbox_Clear_SecondProduct'), GlobalVariable.MiniCartQty)
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Button_IncreaseQty_second'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_GoToTRolley_MiniCart'))
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/radio_ClickNCollect'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Link_SelectStore_DeliveryOPtions'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_SelectStore_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_viewDetails_ClickNCollect'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_RemoveAll'))
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_Yes_RemovePopUp'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_ProceedtoCheckOut_productReview'))*/
	}
	
	@Keyword
	def ClearSearchTextboxAtHomePage()
	{
		WebUI.waitForElementPresent(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'), 4)
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'))
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'),Keys.chord(Keys.CONTROL,'a'))
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'),Keys.chord(Keys.BACK_SPACE))
	}
	@Keyword
	def CheckCheckoutPageForClickNCollect() {
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/radio_ClickNCollect'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Link_SelectStore_DeliveryOPtions'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_SelectStore_DeliveryOptions'))
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_viewDetails_ClickNCollect'), 2,FailureHandling.OPTIONAL)) {
			WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_viewDetails_ClickNCollect'))
		}
		else {
			WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
			assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_Checkout')) == true
		}
	}
	@Keyword
	def CheckDisabledContinueButtonWhenConditionMet()
{
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/radio_ClickNCollect'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Link_SelectStore_DeliveryOPtions'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_SelectStore_DeliveryOptions'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_viewDetails_ClickNCollect'), 2,FailureHandling.OPTIONAL) 
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_viewDetails_ClickNCollect'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_Continue_Disabled'))
	}

	@Keyword
	def CheckValidationAlertMessageWhichNeedAttention() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductRewview_ClickNCollect/AlertMessage_AttentionRequired'), 2, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def CheckProductDetailsAtReViewPageForOutOfStock() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductRewview_ClickNCollect/Text_ProductTitle_productReview'),2)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_PackSize_ReviewPage'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductRewview_ClickNCollect/Text_Por_ReviewPage'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_youMake_productReview'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_SellAt_Review'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_CashReturn_Review'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_ProductPrice_ReviewPage'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryOption_Page/Text_outofStock_productReview'), 0)
	}

	@Keyword
	def VerifyApplyChangesWizardAfterSelectingRadioOptions() {
		WebUI.verifyElementNotClickable(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Continue_DeliveryOptionPage'))
		WebUI.scrollToPosition(80, 90)
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Radio_NotifyMeback_ProductReview'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_ApplyChanges_productreview'))
	}
	@Keyword
	def CheckAdjustAllValidationMessage() {
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'), GlobalVariable.ForAllOptions)
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Add_Search'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/TextBox_CheckAddedQuantityCart'))
		WebUI.sendKeys(findTestObject('Object Repository/Add_ToTrolley/TextBox_CheckAddedQuantityCart'), GlobalVariable.Quantity_AddedForAllOption)
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_IncreaseQty_SecondProduct'))
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_GoToTRolley_MiniCart'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Radio_ClickNCollect_DeliveryOPtions'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Link_SelectStore_DeliveryOPtions'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_SelectStore_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_Continue_TrolleyPage'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_AdjustAll'), 2)
	}
	@Keyword
	def VerifyConfirmationPopUpwhileClickingOnAdjustAllLink() {
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_AdjustAll'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductRewview_ClickNCollect/Text_Adjust_ConfirmationPopUP'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductRewview_ClickNCollect/Button_AdjustAll'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_Cancel_popup'), 0)
	}
	@Keyword
	def CheckAdjustedQuantityMessageForSelectedProduct() {
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Link_AdjustAll'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Button_AdjustAll'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductRewview_ClickNCollect/Text_AdjustedMQuantityMessage'), 2)
	}
	@Keyword
	def CheckRadioOptionsPickAvailableQtyDeliverOnlineAndRemoveAtProductReview() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductRewview_ClickNCollect/Text_PickAvailableAty'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductRewview_ClickNCollect/Text_DeliverOnline'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductRewview_ClickNCollect/Text_Remove_Radio'), 0)
	}
	@Keyword
	def CheckDeliverOnlineOptionInPlaceOfCNC() {
		WebUI.scrollToElement(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_TrolleySummary_ProductReview'), 2)
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/Text_DeliverOnline'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Button_ApplyChanges_productreview'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductRewview_ClickNCollect/Text_OnlineDeliverySelectedProduct'), 2)
	}
	@Keyword
	def CheckAddedProductDetailsUnderREvisedSummary() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_ProductTitle_Checkout'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductRewview_ClickNCollect/Text_packSize_AddedProductsUnderRevisedSummary'),0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductRewview_ClickNCollect/Text_Quantity_UnderRevised'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductRewview_ClickNCollect/Text_Price_UnderRevisedSummary'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductRewview_ClickNCollect/Text_Por_ReviewPage'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductRewview_ClickNCollect/Text_YouMake_UnderRevisedSummary'), 0)
	}
}



