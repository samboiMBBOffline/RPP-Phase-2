import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData as ft
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject as fo
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
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.my.android.keyword.tapNo as tapNo
import com.my.android.keyword.password as password

'Tap DuitNowRequest'
Mobile.tap(fo('Text', [('Verify') : ft('TestData').getValue(4, 5)]), 0)

password.setText(ft('UserID').getValue(2, ID))

'verify land duitnow request page'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(1, 8)]), 0),ft('TestData').getValue(1, 8) )

Mobile.takeScreenshot('Screenshot/DRR/2.png')

'ID type'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 8)]), 0),ft('TestData').getValue(4, 8) )

Mobile.tap(fo('Object Repository/DuitNowRequest/IDtype'),0)

for(i=1;i<7;i++) {
	
	Mobile.scrollToText(ft('Dropdown').getValue(2, i),FailureHandling.CONTINUE_ON_FAILURE)
	
	'Verify ID type'
	Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('Dropdown').getValue(2, i)]), 0),ft('Dropdown').getValue(2, i))
}
Mobile.takeScreenshot('Screenshot/DDR/3.png')

Mobile.scrollToText(ft('Dropdown').getValue(2, 1),FailureHandling.CONTINUE_ON_FAILURE)

'tap Account Number'
Mobile.tap(fo('Text',[('Verify'):ft('Dropdown').getValue(2, 1)]),0)

'tap done'
Mobile.tap(fo('Text',[('Verify'):'Done']),0)

'Request via'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 9)]), 0),ft('TestData').getValue(4, 9))

'Please Select'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(5, 9)]), 0),ft('TestData').getValue(5, 9))

Mobile.takeScreenshot('Screenshot/DDR/4.png')

'tap Please Select'
Mobile.tap(fo('Text',[('Verify'):'Please Select']),0)

for(i=1;i<5;i++) {
	
	Mobile.scrollToText(ft('Dropdown').getValue(1, i),FailureHandling.CONTINUE_ON_FAILURE)
	
	'verify type of banks'
	Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('Dropdown').getValue(1, i)]), 0),ft('Dropdown').getValue(1, i))
	
}

Mobile.takeScreenshot('Screenshot/DDR/5.png')

Mobile.scrollToText(ft('Dropdown').getValue(1, 1),FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(fo('Text',[('Verify'):ft('Dropdown').getValue(1,1)]),0)

'tap done'
Mobile.tap(fo('Text',[('Verify'):'Done']),0)

Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('Dropdown').getValue(1, 1)]), 0),ft('Dropdown').getValue(1, 1))

Mobile.tap(fo('Object Repository/DuitNowRequest/IDtype'),0)

'tap mobile no'
Mobile.tap(fo('Text',[('Verify'):'Done']),0)













