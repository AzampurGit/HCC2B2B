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

public class AddToTrolley {

	@Keyword
	def AddProductIntoTrolley() {
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/AddToTrolley'))

		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Add_ToTrolley/TextBox_CheckAddedQuantityCart')) == true :"Assert passsed"
	}

	@Keyword
	def CheckQuantityPickerOptoinRemovedAfterAddproducts()
	
	{
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/AddToTrolley'))
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/Add_ToTrolley/Textbox_Quantity_Plp'), 3) == true  
		
	}
	@Keyword
	def CheckIncreaseDecreaseQuantityOfProducts()
	{
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/AddToTrolley'))
		
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_IncreaseQuantity'))
		
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/Add_ToTrolley/Textbox_CheckIncreasedQuantity'), 3) == true
		
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Textbox_decreasedQty'))
		
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/Add_ToTrolley/Textbox_CheckDecreasedQuantity'), 3) == true
		
	}
	
	@Keyword
	
	def AddproductInCartwithoutLoginFromHomePage()
	{
	   WebUI.click(findTestObject('Object Repository/Add_ToTrolley/AddToTrolley'))

		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Add_ToTrolley/TextBox_CheckAddedQuantityCart')) == true :"Assert passsed"
	}
		
	
	@Keyword
	
	def CheckUserNavigatesToAnyPageAfterAddingProducts()
	{
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/AddToTrolley'))
		
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
		
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Add_ToTrolley/TextBox_CheckAddedQuantityCart')) == true :"Assert passsed"
		
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_cross_minicart'))
		
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Favourite'))
		
	}
	
	
	
	
	
	}