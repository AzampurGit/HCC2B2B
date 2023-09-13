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

public class ClickNCollect_DeliveryOPtions {
	@Keyword
	def CheckClickNCollectStorePopup()
	{
		WebUI.sendKeys(findTestObject('Object Repository/DeliveryOption_Page/Textbox_SearchLocation_deliveryOption'), GlobalVariable.CityName)
		WebUI.sendKeys(findTestObject('Object Repository/DeliveryOption_Page/Textbox_SearchLocation_deliveryOption'),Keys.chord(Keys.ENTER))
	    assert WebUI.verifyElementVisible(findTestObject('Object Repository/DeliveryOption_Page/Text_Searchedlocation_deliveryoption')) == true
		}
		@Keyword
		def RedirectionToStoreInformationPage()
		{
			WebUI.sendKeys(findTestObject('Object Repository/DeliveryOption_Page/Textbox_SearchLocation_deliveryOption'), GlobalVariable.CityName)
			WebUI.sendKeys(findTestObject('Object Repository/DeliveryOption_Page/Textbox_SearchLocation_deliveryOption'),Keys.chord(Keys.ENTER))
			WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Link_StoreInformation_DeliveryOptions'))
			WebUI.switchToWindowUrl('https://hcc2-fe-qc.hancocks.co.uk/cash-carries/Hull', FailureHandling.STOP_ON_FAILURE)
			assert WebUI.verifyElementVisible(findTestObject('Object Repository/DeliveryOption_Page/Text_StoreDetails_Delivery')) ==  true
		}
}
