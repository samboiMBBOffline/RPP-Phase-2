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

VerifyFull = ft('UserID').getValue(6,1)

'Tap DuitNowRequest'
Mobile.tap(fo('Text', [('Verify') : ft('TestData').getValue(4, 5)]), 0)

password.setText(ft('UserID').getValue(2, ID))

'verify land duitnow request page'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(1, 8)]), 0),ft('TestData').getValue(1, 8) )

Mobile.takeScreenshot('Screenshot/DRR/2.png')

'ID type'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 8)]), 0),ft('TestData').getValue(4, 8) )

if(VerifyFull == 'Y') {

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

Mobile.tap(fo('Text',[('Verify'):ft('Dropdown').getValue(2,2)]),0)

'tap mobile no'
Mobile.tap(fo('Text',[('Verify'):'Done']),0)

'Mobile Number'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 10)]), 0),ft('TestData').getValue(4, 10))

'Enter Number'
Mobile.verifyEqual(Mobile.getText(fo('Input', [('Verify') : ft('TestData').getValue(5, 10)]), 0),ft('TestData').getValue(5, 10))

Mobile.tap(fo('Object Repository/DuitNowRequest/ContactNo Button'),0)

Mobile.takeScreenshot('Screenshot/DDR/6.png')

Mobile.pressBack()

Mobile.setText(fo('InputNo',[('No'):1]),ft('TestData').getValue(6,10),0)

'check format'
Mobile.verifyEqual(Mobile.getText(fo('InputNo',[('No'):1]),0),ft('TestData').getValue(7,10))

Mobile.tap(fo('Object Repository/DuitNowRequest/IDtype'),0)

Mobile.tap(fo('Text',[('Verify'):ft('Dropdown').getValue(2,3)]),0)

'tap mobile no'
Mobile.tap(fo('Text',[('Verify'):'Done']),0)

'NRIC Number'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 11)]), 0),ft('TestData').getValue(4, 11))

'Enter NRIC'
Mobile.verifyEqual(Mobile.getText(fo('Input', [('Verify') : ft('TestData').getValue(5, 11)]), 0),ft('TestData').getValue(5, 11))

Mobile.setText(fo('InputNo',[('No'):1]),ft('TestData').getValue(6,11),0)

'Check format'
Mobile.verifyEqual(Mobile.getText(fo('InputNo',[('No'):1]),0),ft('TestData').getValue(7,11))



Mobile.tap(fo('Object Repository/DuitNowRequest/IDtype'),0)

Mobile.tap(fo('Text',[('Verify'):ft('Dropdown').getValue(2,4)]),0)

'tap pass no'
Mobile.tap(fo('Text',[('Verify'):'Done']),0)

Mobile.hideKeyboard()

'NRIC Number'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 12)]), 0),ft('TestData').getValue(4, 12))

'Enter NRIC'
Mobile.verifyEqual(Mobile.getText(fo('Input', [('Verify') : ft('TestData').getValue(5, 12)]), 0),ft('TestData').getValue(5, 12))

'NRIC Number'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 13)]), 0),ft('TestData').getValue(4, 13))

'Enter NRIC'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(5, 13)]), 0),ft('TestData').getValue(5, 13))

'tap country'
Mobile.tap(fo('Text', [('Verify') : ft('TestData').getValue(5, 13)]), 0)

for(i=1;i<4;i++) {
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('Dropdown').getValue(3, i)]), 0),ft('Dropdown').getValue(3, i))
}
Mobile.tap(fo('Text',[('Verify'):'Done']),0)

Mobile.tap(fo('Object Repository/DuitNowRequest/IDtype'),0)

Mobile.tap(fo('Text',[('Verify'):ft('Dropdown').getValue(2,5)]),0)

'tap pass no'
Mobile.tap(fo('Text',[('Verify'):'Done']),0)

'Army Police ID'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 14)]), 0),ft('TestData').getValue(4, 14))

'Enter Army Police ID'
Mobile.verifyEqual(Mobile.getText(fo('Input', [('Verify') : ft('TestData').getValue(5, 14)]), 0),ft('TestData').getValue(5, 14))

Mobile.tap(fo('Object Repository/DuitNowRequest/IDtype'),0)

Mobile.tap(fo('Text',[('Verify'):ft('Dropdown').getValue(2,6)]),0)

'tap pass no'
Mobile.tap(fo('Text',[('Verify'):'Done']),0)

'Army Police ID'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 15)]), 0),ft('TestData').getValue(4, 15))

'Enter Army Police ID'
Mobile.verifyEqual(Mobile.getText(fo('Input', [('Verify') : ft('TestData').getValue(5, 15)]), 0),ft('TestData').getValue(5, 15))


}
Mobile.tap(fo('Object Repository/DuitNowRequest/IDtype'),0)

Mobile.scrollToText(ft('TestData').getValue(7,1),FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(fo('Text',[('Verify'):ft('TestData').getValue(7,1)]),0)

'tap pass no'
Mobile.tap(fo('Text',[('Verify'):'Done']),0)

if(Mobile.getText(fo('Object Repository/DuitNowRequest/IDtype'),0)=='Mobile Number'||
	Mobile.getText(fo('Object Repository/DuitNowRequest/IDtype'),0)=='NRIC Number'||
	Mobile.getText(fo('Object Repository/DuitNowRequest/IDtype'),0)=='Army/Police ID'||
	Mobile.getText(fo('Object Repository/DuitNowRequest/IDtype'),0)=='Business Registration Number') {
	
	Mobile.setText(fo('InputNo',[('No'):1]),ft('TestData').getValue(7,2),0)
	
	
}











