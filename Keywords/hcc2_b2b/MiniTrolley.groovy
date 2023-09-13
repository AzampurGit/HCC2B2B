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

public class MiniTrolley {

	@Keyword

	def AddProductsInCart() {

		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/AddToTrolley'))

		if(WebUI.verifyElementPresent(findTestObject('Object Repository/MiniTrolley/Message_ProductNotAvailable'), 2, FailureHandling.OPTIONAL)) {

			WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_AddSecondProduct_Home'))
		}
		else {

			WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
		}
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
	}

	@Keyword
	def AddItemsIntoCart() {
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_AddSecondProduct_Home'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
	}


	@Keyword

	def RemoveProductFromCart() {


		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_deleteFromMiniTrolley'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_YesRemoveFavouritePopUP'))

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MiniTrolley/Message_RemoveFromMinicart')) == true
	}

	@Keyword

	def ViewAddedProductsInMiniTrolley() {
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/My_Favourites/Count_addedProductCart')) == true : "Assertion passed."
	}

	@Keyword

	def ViewDetailsOfAddedProducts() {

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MiniTrolley/Image_Product_MiniCart')) == true

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MiniTrolley/Link_ProductName_minitrolley')) == true

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MiniTrolley/text_Vat_MiniTrolley')) == true
	}

	@Keyword
	def IncreaseDecreaseQtyInMiniCart() {
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_IncreaseQty_Minicart'))

		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_Decreaseqty_minicart'))

		def CheckQtyMiniCart = WebUI.getAttribute(findTestObject('Object Repository/MiniTrolley/Textbox_Qty_Minicart'), "value").toInteger()

		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_cross_minicart'))

		def CheckQtyHomePage = WebUI.getAttribute(findTestObject('Object Repository/MiniTrolley/Textbox_Qty_Home'),"value").toInteger()

		WebUI.verifyEqual(CheckQtyMiniCart, CheckQtyHomePage)
		
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
	}

	@Keyword

	def CheckLatestAddedproductInCart() {

		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_cross_minicart'))

		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_AddSecondProduct_Home'))

		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))

		assert WebUI.verifyElementPresent(findTestObject('Object Repository/MiniTrolley/Text_addeProductInMiniTrolley'), 2) == true
	}

	@Keyword

	def CheckMiniTrolleyUpdatedQty() {
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_cross_minicart'))

		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_AddThirdProduct_Home'))

		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))

		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_IncreaseQuantity'))

		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_IncreaseQty_SecondProduct'))

		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_deleteFromMiniTrolley'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_YesRemoveFavouritePopUP'))
	}
	@Keyword

	def CalculateAndRecalulatePORInMiniTrolley() {
		WebUI.clearText(findTestObject('Object Repository/MiniTrolley/Textbox_Qty_Minicart'))
		WebUI.sendKeys(findTestObject('Object Repository/MiniTrolley/Textbox_Qty_Minicart'), GlobalVariable.MiniCartQty)
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_IncreaseQty_Minicart'))
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Link_CalculatePOR_minicart'))
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_decrease_Qty_MiniCart'))
		//WebUI.click(findTestObject('Object Repository/MiniTrolley/Link_RecalculatePOR_MiniCart'))
	}
	@Keyword

	def RedirectToTrolleyPage() {
		WebUI.clearText(findTestObject('Object Repository/MiniTrolley/Textbox_Qty_Minicart'))
		WebUI.sendKeys(findTestObject('Object Repository/MiniTrolley/Textbox_Qty_Minicart'), GlobalVariable.MiniCartQty)

		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_IncreaseQty_Minicart'))

		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_GoToTRolley_MiniCart'))
	}

	@Keyword
	def AddProductFromQuickAdd() {
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_AddThirdProduct_Home'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_AddCart_First_QuickAdd'))

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MiniTrolley/Text_addeProductInMiniTrolley')) == true : "Assert Passed."
	}
	@Keyword
	def CheckTextOfEmptyMiniCart() {
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/MiniTrolley/Text_Empty_minicart'), 2) == true
	}
}
