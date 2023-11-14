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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Phones'))

WebUI.click(findTestObject('Object Repository/Page_STORE/img_CATEGORIES_card-img-top img-fluid'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Add to cart'))

not_run: WebUI.click(findTestObject('Object Repository/Page_STORE/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Cart'))

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Name_name'), 'Goushi')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Country_country'), 'Sri Lanka')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_City_city'), 'Colombo')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Credit card_card'), '123456789')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Month_month'), 'January')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Year_year'), '2023')

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Purchase'))

assert WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/button_OK')) == true : 'OK button is not present'

WebUI.click(findTestObject('Object Repository/Page_STORE/button_OK'))

WebUI.closeBrowser()

