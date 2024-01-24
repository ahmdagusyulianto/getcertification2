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

WebUI.setText(findTestObject('Valid Login/input username for login'), 'admin@indocyber.com')

WebUI.setText(findTestObject('Valid Login/input password for login'), 'admin123')

WebUI.click(findTestObject('Valid Login/klik button login'))

WebUI.click(findTestObject('menu question/click menu question'))

WebUI.click(findTestObject('menu question/click tambah question'))

WebUI.click(findTestObject('menu question/click dropdown level'))

WebUI.scrollToElement(findTestObject('menu question/click item 4'), 0)

WebUI.click(findTestObject('menu question/click item 4'))

WebUI.back()

WebUI.click(findTestObject('Valid Login/click button logout'))

