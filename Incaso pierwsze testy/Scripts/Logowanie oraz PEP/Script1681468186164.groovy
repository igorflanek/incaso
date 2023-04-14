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

WebUI.navigateToUrl('https://app.aml.pl/users/sign_in')

WebUI.setText(findTestObject('Object Repository/Page_Skaner iAML/input_Adres email_useremail'), 'igorflaa@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Skaner iAML/input_Haso_userpassword'), 'qkbgkkpiYHBfEXlvDrrjww==')

WebUI.click(findTestObject('Object Repository/Page_Skaner iAML/input_Zapamitaj moje dane_commit'))

WebUI.click(findTestObject('Object Repository/Page_Skaner iAML/a_OSOBA'))

WebUI.click(findTestObject('Object Repository/Page_Skaner iAML/input_Wpisz co najmniej jedn z poniszych da_d007f2'))

WebUI.setText(findTestObject('Object Repository/Page_Skaner iAML/input_Wpisz co najmniej jedn z poniszych da_e6a9c4'), 'Andrzej')

WebUI.setText(findTestObject('Object Repository/Page_Skaner iAML/input_Wpisz co najmniej jedn z poniszych da_d007f2'), 'Duda')

WebUI.click(findTestObject('Object Repository/Page_Skaner iAML/span_search Szukaj'))

WebUI.rightClick(findTestObject('Object Repository/Page_Skaner iAML/th_Andrzej Duda'))

WebUI.click(findTestObject('Object Repository/Page_Skaner iAML/th_Andrzej Duda'))

WebUI.click(findTestObject('Object Repository/Page_Skaner iAML/th_Andrzej Duda'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Skaner iAML/th_Andrzej Duda'))

