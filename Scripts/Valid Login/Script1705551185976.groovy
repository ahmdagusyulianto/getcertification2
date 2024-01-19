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

WebUI.openBrowser('http://130.211.243.37:96/login')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Valid Login/element form login present'))

WebUI.click(findTestObject('Valid Login/input username for login'))

WebUI.setText(findTestObject('Valid Login/input username for login'), 'ahmad.yulianto@indocyber.id')

WebUI.click(findTestObject('Valid Login/input password for login'))

WebUI.setText(findTestObject('Valid Login/input password for login'), 'P@ssw0rd')

WebUI.check(findTestObject('Valid Login/check box remember me'))

WebUI.click(findTestObject('Valid Login/klik button login'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Valid Login/text username present after success login'), 0)

WebUI.click(findTestObject('Valid Login/click button logout'))

WebUI.verifyElementVisible(findTestObject('Valid Login/element form login present'))

WebUI.closeBrowser()

WebUI.dismissAlert()

