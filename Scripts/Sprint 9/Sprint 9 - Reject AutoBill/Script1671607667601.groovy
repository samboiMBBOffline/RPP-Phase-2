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
import com.my.android.keyword.tapNo as tapNo
import com.my.android.keyword.password as password
import com.my.android.keyword.duration as duration


if(GlobalVariable.type=='soleR') {




'if start from Quick Actions'
if(Mobile.verifyElementExist(fo('Text',[('Verify'):'Quick Actions']),0,FailureHandling.OPTIONAL)) {
	
	if(Mobile.verifyElementExist(fo('Text',[('Verify'):ft('AutoBill').getValue(4,1)]),0,FailureHandling.OPTIONAL)) 
{
	Mobile.tap(fo('Text',[('Verify'):ft('TestData').getValue(4,3)]),0)	
	
	password.setText(ft('UserID').getValue(2,GlobalVariable.pass))
}	else {
	Mobile.tap(fo('Text',[('Verify'):'Maybank2u']),0)
	
	tapNo.pin(ft('UserID').getValue(4,GlobalVariable.pass))
}
}
if(Mobile.verifyElementExist(fo('Text',[('Verify'):'ACCOUNTS']),15,FailureHandling.OPTIONAL)) {
	Mobile.tap(fo('TextNo',[('No'):8]),0)
	
	Mobile.tap(fo('Text',[('Verify'):ft('TestData').getValue(4,3)]),0)	
	
	password.setText(ft('UserID').getValue(2,GlobalVariable.pass))
}

'id like to...'
Mobile.verifyElementExist(fo('Auto Billing/Id like to'),0)

Mobile.scrollToText(ft('TestData').getValue(4,6),FailureHandling.CONTINUE_ON_FAILURE)

'tap view all'
Mobile.tap(fo('FollowingText2',[('Verify'):ft('TestData').getValue(4,6)]),0)

Mobile.delay(5)

'land to page duitnow autodebit view all'
Mobile.verifyEqual(Mobile.getText(fo('FollowingText2',[('Verify'):ft('TestData').getValue(4,6)]),0),ft('TestData').getValue(4,6))

Mobile.takeScreenshot('Screenshot/Reject/1.png')

'tap incoming'
Mobile.tap(fo('Text',[('Verify'):'Incoming']),0)

if((Mobile.getText(fo('Auto Billing/Incoming'),0).substring(0,6)=='Pay to'){
	
	



	






























































}else {
	'NOT APPLICABLE FOR NON SOLE PROP REGISTERED'
}



















