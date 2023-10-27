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

public class ViewTrolleyPage {
	@Keyword
	def CheckGoToTrolleyOptionInMiniCart() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'), 6)
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'))
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'), GlobalVariable.SKUInStock)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Add_Search'), 8)
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Add_Search'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'), 5)
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
		WebUI.clearText(findTestObject('Object Repository/ViewTrolleyPage/Textbox_Quantity_minicart'))
		WebUI.sendKeys(findTestObject('Object Repository/ViewTrolleyPage/Textbox_Quantity_minicart'), GlobalVariable.MiniCartQty)
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_IncreaseQty_Minicart'))
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/MiniTrolley/Button_GoToTRolley_MiniCart'), 2) == true
	}
	@Keyword
	def CheckUserRedirectToTrolleyPage() {
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_GoToTRolley_MiniCart'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_MyTrolley')) == true
	}
	@Keyword
	def CheckfiveStepsAtTrolleyPage() {
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_trolley_TroleyPage')) ==  true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/text_recomendedProducts')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_DeliveryOPtions')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_productReview')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_Checkout')) == true
	}
	@Keyword
	def CheckDetailsOfAddedProductIntoTrolleyPage() {
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/ViewTrolleyPage/Image_AddedProduct_TrolleyPage'), 3) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Icon_Favourite_Addedproduct_trolleyPage')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_AddedProduct_TrolleyPage')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_porLabel_trolleyPage')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_DeliveryStatus_TrolleyPage')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_Price_AddedProduct_trolleyPage')) == true
	}
	@Keyword
	def RemoveProductFromTrolleyPage() {
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Remove_TrolleyPage'))
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/ViewTrolleyPage/Text_Item_RemovedFromTrolley'), 3) == true
	}
	@Keyword
	def CheckLatestProductDisplayAtTopInTrolleyPage() {
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/AddToTrolley'))
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_AddSecondProduct_Home'))
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_AddThirdProduct_Home'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
		WebUI.clearText(findTestObject('Object Repository/ViewTrolleyPage/Textbox_Quantity_minicart'))
		WebUI.sendKeys(findTestObject('Object Repository/ViewTrolleyPage/Textbox_Quantity_minicart'), GlobalVariable.MiniCartQty)
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_IncreaseQty_Minicart'))
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_GoToTRolley_MiniCart'))
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/ViewTrolleyPage/Text_LastestProductName_trolleyPage'), 2) == true
	}
	@Keyword
	def CheckUpdatedQuantityAtTrolleyPage() {
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_increase Quantity_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_decreaseQty_trolleyPage'))
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Remove_TrolleyPage'))
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/ViewTrolleyPage/Text_Item_RemovedFromTrolley'), 3) == true
	}
	@Keyword
	def AddProductInTrolleyPage() {
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'), GlobalVariable.SKUForOutOfStockOnline)
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Add_Search'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
		WebUI.clearText(findTestObject('Object Repository/ViewTrolleyPage/Textbox_Quantity_minicart'))
		WebUI.sendKeys(findTestObject('Object Repository/ViewTrolleyPage/Textbox_Quantity_minicart'), GlobalVariable.MiniCartQty)
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_IncreaseQty_Minicart'))
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_GoToTRolley_MiniCart'))
	}
	@Keyword
	def AddProductInTrolleyWithInStock() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'), 6)
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'))
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'), GlobalVariable.SKUInStock)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Add_Search'), 8)
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Add_Search'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'), 5)
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
		WebUI.clearText(findTestObject('Object Repository/ViewTrolleyPage/Textbox_Quantity_minicart'))
		WebUI.sendKeys(findTestObject('Object Repository/ViewTrolleyPage/Textbox_Quantity_minicart'), GlobalVariable.MiniCartQty)
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_IncreaseQty_Minicart'))
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_GoToTRolley_MiniCart'))
	}
	@Keyword
	def CheckRedirectiontoPDPfromTrolleyPage() {
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Link_productTitle_trolleyPage'))
		// assertion pending currently page redirecting to 404
	}
	@Keyword
	def CheckStatictextforEmptyTrolleyAtTrolleyPage() {
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/ViewTrolleyPage/Text_EmptyTrolley_TrolleyPage'), 3) == true
	}
	@Keyword
	def CheckAddThisUnderTextAtTrolleyPage() {
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/ViewTrolleyPage/Text_AddThisUnder_TrolleyPage'), 2) == true
	}
	@Keyword
	def CheckDeliveryAndPaymentMethodAtTrolleyPage() {
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_Delivered_TrolleyPage')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_PaymentMethods_TrolleyPage')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Icon_Visa_TrolleyPage')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Icon_Mastercard_TrolleyPage')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Icon_Paypal_TrolleyPage')) == true
	}
	@Keyword
	def CheckContinueButtonDisabledAtTrolleyPage() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/ViewTrolleyPage/Textbox_Quantity_TrolletPage'), 4)
		WebUI.clearText(findTestObject('Object Repository/ViewTrolleyPage/Textbox_Quantity_TrolletPage'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/ViewTrolleyPage/Textbox_Quantity_TrolletPage'), 5)
		WebUI.sendKeys(findTestObject('Object Repository/ViewTrolleyPage/Textbox_Quantity_TrolletPage'), GlobalVariable.Quantity_trolletyPage)
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_IncreaseQty_TrolleyPage'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_disabled_TrolleyPage')) == true
		/*WebUI.clearText(findTestObject('Object Repository/ViewTrolleyPage/Textbox_Quantity_TrolletPage'))
		WebUI.sendKeys(findTestObject('Object Repository/ViewTrolleyPage/Textbox_Quantity_TrolletPage'), GlobalVariable.MiniCartQty)
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_IncreaseQty_TrolleyPage'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage')) == true*/
	}
	@Keyword
	def DeleteProductInCartIfExistForLoggedUser()
	{
		WebUI.waitForElementVisible(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'), 12)
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
		if(WebUI.verifyElementVisible(findTestObject('Object Repository/MiniTrolley/Button_deleteFromMiniTrolley'), FailureHandling.OPTIONAL))
		{
			WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_deleteFromMiniTrolley'))
			WebUI.click(findTestObject('Object Repository/My_Favourites/Button_remove_popup'))
			WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_cross_minicart'))
		}
		else
		{
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_cross_minicart'))
			}
	}
		
	}
	

