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

WebUI.openBrowser('https://chercher.tech/practice/practice-pop-ups-selenium-webdriver')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Alert/Page_Practice handling Alerts in selenium webdriver/input_Practice Alerts_alert'))

WebUI.verifyAlertPresent(0)

WebUI.waitForAlert(40)

String Alert = WebUI.getAlertText()

println(Alert)

WebUI.acceptAlert()

WebUI.delay(4)

WebUI.click(findTestObject('Alert/Page_Practice handling Alerts in selenium webdriver/input_Practice Alerts_confirmation'))

WebUI.waitForAlert(40)

String confirmAlert = WebUI.getAlertText()

println(confirmAlert)

WebUI.dismissAlert()

WebUI.delay(4)

WebUI.click(findTestObject('Alert/Page_Practice handling Alerts in selenium webdriver/input_Practice Alerts_prompt'))

WebUI.verifyAlertPresent(0)

WebUI.waitForAlert(40)

String sendAlert = WebUI.getAlertText()

WebUI.setAlertText('Victor')

WebUI.delay(4)

WebUI.click(findTestObject('Alert/Page_Practice handling Alerts in selenium webdriver/input_Practice Alerts_download'))

WebUI.verifyAlertNotPresent(0)

WebUI.delay(4)

WebUI.closeBrowser()

