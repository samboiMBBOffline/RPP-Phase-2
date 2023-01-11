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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

'if start from Quick Actions'
if (Mobile.verifyElementExist(fo('Text', [('Verify') : 'Quick Actions']), 0, FailureHandling.OPTIONAL)) {
	if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 1)]), 0, FailureHandling.OPTIONAL)) {
		Mobile.tap(fo('Text', [('Verify') : ft('TestData').getValue(4, 3)]), 0)

		password.setText(ft('UserID').getValue(2, GlobalVariable.pass))
	} else {
		Mobile.tap(fo('Text', [('Verify') : 'Maybank2u']), 0)

		tapNo.pin(ft('UserID').getValue(4, GlobalVariable.pass))
	}
}

'in account selection screen'
if (Mobile.verifyElementExist(fo('Text', [('Verify') : 'ACCOUNTS']), 15, FailureHandling.OPTIONAL)) {
	Mobile.tap(fo('TextNo', [('No') : 8]), 0)

	Mobile.tap(fo('Text', [('Verify') : ft('TestData').getValue(4, 3)]), 0)

	password.setText(ft('UserID').getValue(2, GlobalVariable.pass))
}

'tap past'
Mobile.tap(fo('Text',[('Verify'):'PAST']),0)

Mobile.scrollToText(ft('TestData').getValue(4, 6), FailureHandling.CONTINUE_ON_FAILURE)

'tap view all'
Mobile.tap(fo('FollowingText2', [('Verify') : ft('TestData').getValue(4, 6)]), 0)

Mobile.delay(5)

'Past Activities'
Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Past Activities']),0),'Past Activities')

'DuitNow AutoDebit'
Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'DuitNow AutoDebit']),0),'DuitNow AutoDebit')

'type to search'
Mobile.verifyEqual(Mobile.getText(fo('Input',[('Verify'):'Type to search']),0),'Type to search')

Mobile.takeScreenshot('Screenshot/Past/1.png')

Mobile.tap(fo('ButtonNo',[('No'):3]),0)

if (GlobalVariable.type == 'soleR') {

Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Approved']),0),'Approved')

Mobile.verifyEqual(Mobile.getText(fo('FollowingText1',[('Verify'):'Approved']),0),'Rejected')

Mobile.verifyEqual(Mobile.getText(fo('FollowingText1',[('Verify'):'Rejected']),0),'Expired')

Mobile.verifyEqual(Mobile.getText(fo('FollowingText1',[('Verify'):'Expired']),0),'Blocked')

}else {
	
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Approved']),0),'Approved')
	
	Mobile.verifyEqual(Mobile.getText(fo('FollowingText1',[('Verify'):'Approved']),0),'Expired')
	
	Mobile.verifyEqual(Mobile.getText(fo('FollowingText1',[('Verify'):'Expired']),0),'Rejected')
	
	Mobile.verifyEqual(Mobile.getText(fo('FollowingText1',[('Verify'):'Rejected']),0),'Cancelled')
	
	Mobile.verifyEqual(Mobile.getText(fo('FollowingText1',[('Verify'):'Cancelled']),0),'Blocked')
	
}

Mobile.takeScreenshot('Screenshot/Past/2.png')

Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Apply']),0),'Apply')

Mobile.verifyElementNotExist(fo('Text',[('Verify'):'Clear All']),3)

Mobile.tap(fo('Text',[('Verify'):'Apply']),0)

'prove that apply cannot be tap'
Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Filter']),0),'Filter')

Mobile.tap(fo('Text',[('Verify'):'Approved']),0)

Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Clear All']),0),'Clear All')

Mobile.tap(fo('Text',[('Verify'):'Clear All']),0)

Mobile.verifyElementNotExist(fo('Text',[('Verify'):'Clear All']),3)

Mobile.tap(fo('Text',[('Verify'):'Approved']),0)

Mobile.tap(fo('Text',[('Verify'):'Apply']),0)

'Back to first screen'
Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Past Activities']),0),'Past Activities')

Mobile.takeScreenshot('Screenshot/Past/3.png')

if(Mobile.verifyElementExist(fo('Text',[('Verify'):'Approved']),0,FailureHandling.OPTIONAL)) {
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Approved']),0),'Approved')
}else {
	'User doesnt have approved'
}





















