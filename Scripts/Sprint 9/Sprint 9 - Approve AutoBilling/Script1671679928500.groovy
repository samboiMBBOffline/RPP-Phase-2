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

if (GlobalVariable.type == 'soleR') {
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
	
	if (Mobile.verifyElementExist(fo('Text', [('Verify') : 'ACCOUNTS']), 15, FailureHandling.OPTIONAL)) {
		Mobile.tap(fo('TextNo', [('No') : 8]), 0)

		Mobile.tap(fo('Text', [('Verify') : ft('TestData').getValue(4, 3)]), 0)

		password.setText(ft('UserID').getValue(2, GlobalVariable.pass))
	}
	
	'id like to...'
	Mobile.verifyElementExist(fo('Auto Billing/Id like to'), 0)

	Mobile.scrollToText(ft('TestData').getValue(4, 6), FailureHandling.CONTINUE_ON_FAILURE)

	'tap view all'
	Mobile.tap(fo('FollowingText2', [('Verify') : ft('TestData').getValue(4, 6)]), 0)
	
	Mobile.delay(5)
	
	'land to page duitnow autodebit view all'
	Mobile.verifyEqual(Mobile.getText(fo('FollowingText2', [('Verify') : ft('TestData').getValue(4, 6)]), 0), ft('TestData').getValue(
			4, 6))
	
	Mobile.takeScreenshot('Screenshot/Reject/1.png')
	
	Mobile.scrollToText('Incoming', FailureHandling.OPTIONAL)
	
	A = Mobile.getText(fo('Auto Billing/Incoming'), 0)
	
	if (A.substring(0, 8) == 'Pay from') 
		{
			
		'tap the card'	
		Mobile.tap(fo('Auto Billing/Incoming'), 0)
		
		
		}else {
			while(A.substring(0, 8) != 'Pay from') {
				if(Mobile.verifyElementExist(fo('Auto Billing/IncomingNo',[('No'):2]),0,FailureHandling.OPTIONAL)) {
					A = Mobile.getText(fo('Auto Billing/IncomingNo',[('No'):2]),0)
				}else {
					Mobile.swipe(Mobile.getDeviceWidth()/2,Mobile.getDeviceHeight()*0.9,Mobile.getDeviceWidth()/2,Mobile.getDeviceHeight()*0.1)
					
					Mobile.scrollToText('Pay from:', FailureHandling.OPTIONAL)
					
					A = Mobile.getText(fo('Auto Billing/IncomingNo',[('No'):1]),0)
				}
			}
		}
		
		'youve received...'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(5,19)]),0),ft('TestData').getValue(5,19))
		
		'Requested on'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,20)]),0),ft('TestData').getValue(4,20))
		
		'date'
		DateRequested = Mobile.getText(fo('FollowingText1',[('Verify'):ft('TestData').getValue(4,20)]),0)
				
		'Recipient ref'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,21)]),0),ft('TestData').getValue(4,21))
		
		'Inv no'
		InvoiceNo = Mobile.getText(fo('FollowingText1',[('Verify'):ft('TestData').getValue(4,21)]),0)
		
		'payment details'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,22)]),0),ft('TestData').getValue(4,22))
		
		'deets pay'
		Deets = Mobile.getText(fo('FollowingText1',[('Verify'):ft('TestData').getValue(4,22)]),0)
		
		'Request expiry date'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,23)]),0),ft('TestData').getValue(4,23))
		
		'expiry date'
		ExpiryDate = Mobile.getText(fo('FollowingText1',[('Verify'):ft('TestData').getValue(4,23)]),0)
		
		'duitnow autodebit details'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,24)]),0),ft('TestData').getValue(4,24))
		
		'Product Name'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,25)]),0),ft('TestData').getValue(4,25))
		
		ProductName = Mobile.getText(fo('FollowingText1',[('Verify'):ft('TestData').getValue(4,25)]),0)
		
		PeriodPayment = Mobile.getText(fo('FollowingText1',[('Verify'):ProductName]),0)
		
		'Frequency'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,27)]),0),ft('TestData').getValue(4,27))
		
		Freq = Mobile.getText(fo('Auto Billing/Following2ndText',[('Verify'):ft('TestData').getValue(4,27)]),0)
		
		'Limit per trxn'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,28)]),0),ft('TestData').getValue(4,28))
		
		LPT = Mobile.getText(fo('Auto Billing/Following2ndText',[('Verify'):ft('TestData').getValue(4,28)]),0)
		
		'Duitnow auto ID'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,29)]),0),ft('TestData').getValue(4,29))
		
		DuitNowID = Mobile.getText(fo('FollowingText1',[('Verify'):ft('TestData').getValue(4,29)]),0)
	
		'Approve Now'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,30)]),0),ft('TestData').getValue(4,30))
		
		Mobile.tap(fo('Text',[('Verify'):ft('TestData').getValue(4,30)]),0)
		
		'Confirmation'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,31)]),0),ft('TestData').getValue(4,31))
		
		'duitnow autodebit details'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,24)]),0),ft('TestData').getValue(4,24))
		
		'Product Name'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,25)]),0),ft('TestData').getValue(4,25))
		
		'Product Name Compare'
		Mobile.verifyEqual(Mobile.getText(fo('FollowingText1',[('Verify'):ft('TestData').getValue(4,25)]),0),ProductName)
		
		'Period payment'
		Mobile.verifyEqual(Mobile.getText(fo('FollowingText1',[('Verify'):ProductName]),0),PeriodPayment)
		
		'Frequency'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,27)]),0),ft('TestData').getValue(4,27))
		
		'Frequency compare'
		Mobile.verifyEqual(Mobile.getText(fo('Auto Billing/Following2ndText',[('Verify'):ft('TestData').getValue(4,27)]),0),Freq)
		
		'Limit per trxn'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,28)]),0),ft('TestData').getValue(4,28))
		
		'LPT Compare'
		Mobile.verifyEqual(Mobile.getText(fo('Auto Billing/Following2ndText',[('Verify'):ft('TestData').getValue(4,28)]),0),LPT)
		
		'Duitnow auto ID'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,29)]),0),ft('TestData').getValue(4,29))
		
		DuitNowID = Mobile.getText(fo('FollowingText1',[('Verify'):ft('TestData').getValue(4,29)]),0)
		
		'Recipient ref'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,21)]),0),InvoiceNo)
		
		'inv no'
		Mobile.verifyEqual(Mobile.getText(fo('FollowingText1',[('Verify'):ft('TestData').getValue(4,21)]),0),ft('TestData').getValue(4,21))
		
		'payment details'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,22)]),0),ft('TestData').getValue(4,22))
		
		'deets pay'
		Mobile.verifyEqual(Mobile.getText(fo('FollowingText1',[('Verify'):ft('TestData').getValue(4,22)]),0),Deets)
	
		Mobile.scrollToText('Account to receive payment',FailureHandling.OPTIONAL)
		
		'Account to receive payment'
		Mobile.verifyEqual(Mobile.getText(fo('FollowingText1',[('Verify'):'Account to receive payment']),0),'Account to receive payment')
		
		Mobile.tap(fo('Text',[('Verify'):ft('TestData').getValue(4,30)]),0)
		
		Mobile.delay(10)
		
		if(Mobile.verifyElementExist(fo('Text',[('Verify'):'Secure2u Authorisation']),0,FailureHandling.OPTIONAL)) {
			
			'Approve duitnow autodebit request'
			Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Approval').getValue(3,1)]),0),ft('Approval').getValue(3,1))
			
			'Account to receive payment'
			Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Approval').getValue(3,2)]),0),ft('Approval').getValue(3,2))
			
			'Acc Chosen'
			AccountChosen = Mobile.getText(fo('FollowingText1',[('Verify'):ft('Approval').getValue(3,2)]),0)
			
			'From'
			Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Approval').getValue(3,3)]),0),ft('Approval').getValue(3,3))
			
			'debitor'
			From = Mobile.getText(fo('FollowingText1',[('Verify'):ft('Approval').getValue(3,3)]),0)
			
			'Recipient ref'
			Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Approval').getValue(3,4)]),0),ft('Approval').getValue(3,4))
			
			'RefS2U'
			RefS2U = Mobile.getText(fo('FollowingText1',[('Verify'):ft('Approval').getValue(3,4)]),0)
			
			'Date Time'
			Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Approval').getValue(3,5)]),0),ft('Approval').getValue(3,5))
			
			'Date Time'
			DateS2U = Mobile.getText(fo('FollowingText1',[('Verify'):ft('Approval').getValue(3,5)]),0)
			
			Mobile.takeScreenshot('Screenshot/Approve/S2U.png')
			
			'Approve'
			Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Approve']),0),'Approve')
			
			'Reject'
			Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Reject']),0),'Reject')
			
			if(ft('Approval').getValue(2,2)=='Y') {
				Mobile.tap(fo('Text',[('Verify'):'Approve']),0)
			}else {
				Mobile.tap(fo('Text',[('Verify'):'Reject']),0)
			}

		}else {
			'One Time Password'
			Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Approval').getValue(1,6)]),0),ft('Approval').getValue(1,6))
			
			OTPTEXT = Mobile.getText(fo('OTP1'),0)
			
			'Continue'
			Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Continue']),0),'Continue')
			
			'Not Now'
			Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Not Now']),0),'Not Now')
			
			Mobile.takeScreenshot('Screenshit/Approve/OTP.png')
			
			Mobile.tap(fo('Text',[('Verify'):'Continue']),0)
			
			OTPNo = (Mobile.getText(fo('Object Repository/OTP1'),0)).substring(12,6)
			if(ft('Approval').getValue(2,2)=='Y') {
				tapNo.otpApproval(OTPNo)
			}else {
				tapNo.otpApproval('111111')
			}
			
			
		}
		if(ft('Approval').getValue(2,2)=='Y') {
			Mobile
			
			
			
		}else {
			'duitnow unsuccessful'
			Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Approval').getValue(3,7)]),0),ft('Approval').getValue(3,7))
			
			if(Mobile.verifyElementExist(fo('Text',[('Verify'):ft('Approval').getValue(3,8)]),3,FailureHandling.OPTIONAL)) {
				Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Approval').getValue(3,8)]),0),
					ft('Approval').getValue(3,8))
				'OTP FAIL'
			}
			
			
			'Ref ID'
			Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Approval').getValue(3,9)]),0),ft('Approval').getValue(3,9))
			
			RefIDFail = Mobile.getText(fo('FollowingText1',[('Verify'):ft('Approval').getValue(3,9)]),0)
			
			'Date & Time'
			Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Approval').getValue(3,10)]),0),ft('Approval').getValue(3,10))
			
			DateTimeFail = Mobile.getText(fo('FollowingText1',[('Verify'):ft('Approval').getValue(3,10)]),0)
			
			Mobile.takeScreenshot('Screenshot/Approve/FailApproval.png')
			}
		
}