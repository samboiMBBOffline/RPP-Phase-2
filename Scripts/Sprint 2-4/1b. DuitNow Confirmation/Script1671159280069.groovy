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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


if (GlobalVariable.type == 'ind') {
	'Date'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,1)]),0),ft('Confirm').getValue(1,1))
	
	'Recipient reference'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,3)]),0),ft('Confirm').getValue(1,3))
	
	'Amount editable'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,4)]),0),ft('Confirm').getValue(1,4))
	
	'Payment details'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,5)]),0),ft('Confirm').getValue(1,5))
	
	'Notify via email'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,6)]),0),ft('Confirm').getValue(1,6))
	
	'Pay to'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,8)]),0),ft('Confirm').getValue(1,8))
	
	Mobile.scrollToText(ft('Confirm').getValue(1,13),FailureHandling.OPTIONAL)
	
	
	'Declaration'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,11)]),0),ft('Confirm').getValue(1,11))
	
	'i hereby...'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,12)]),0),ft('Confirm').getValue(1,12))
	
	'TnC'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,13)]),0),ft('Confirm').getValue(1,13))
	
	
}else if (GlobalVariable.type == 'soleR') {
	'Date'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,1)]),0),ft('Confirm').getValue(1,1))
	
	'Request expiry date'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,2)]),0),ft('Confirm').getValue(1,2))
	
	'Recipient reference'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,3)]),0),ft('Confirm').getValue(1,3))
	
	'Amount editable'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,4)]),0),ft('Confirm').getValue(1,4))
	
	'Payment details'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,5)]),0),ft('Confirm').getValue(1,5))
	
	'Notify via email'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,6)]),0),ft('Confirm').getValue(1,6))
	
	'enable duitnow autodebit'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,7)]),0),ft('Confirm').getValue(1,7))
	
	Mobile.scrollToText(ft('Confirm').getValue(1,12),FailureHandling.OPTIONAL)
	
	'Pay to'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,8)]),0),ft('Confirm').getValue(1,8))
	
	'Accepted payment methods'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,9)]),0),ft('Confirm').getValue(1,9))
	
	'Savings & current account'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(2,9)]),0),ft('Confirm').getValue(2,9))
	
	'E-wallet'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(2,10)]),0),ft('Confirm').getValue(2,10))
	
	'Declaration'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,11)]),0),ft('Confirm').getValue(1,11))
	
	'i hereby...'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,12)]),0),ft('Confirm').getValue(1,12))
	
	'TnC'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('Confirm').getValue(1,13)]),0),ft('Confirm').getValue(1,13))
	
	
	
	
	
	
	
	
	
}else if (GlobalVariable.type == 'soleUR') {
	
}



Mobile.tap(fo('Text',[('Verify'):'Send Now']),0)


if(Mobile.verifyElementExist(fo('Text',[('Verify'):'Request Successful']),0,FailureHandling.OPTIONAL))
{
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Request Successful']),0),'Request Successful')
	
	'successful request'
	
}else {
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Request unsuccessful']),0),'Request unsuccessful')
	
	'fail request'
}

Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Reference ID']),0),'Reference ID')

RefID = Mobile.getText(fo('FollowingText1',[('Verify'):'Reference ID']),0)

'contains M'
Mobile.verifyEqual(RefID.substring(RefID.length()-1), 'M')

Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Date & time']),0),'Date & time')

DateTime = Mobile.getText(fo('FollowingText1',[('Verify'):'Date & time']),0)

WebUI.takeScreenshot('Screenshot/Confirm.png')
if(Fav=='Y') {
	
	Mobile.tap(fo('Text',[('Verify'):'Add to Favourites']),0)
	
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Add as Favourites']),0),'Add as Favourites')
	
	'Registered Name'
	RegName = Mobile.getText(fo('InputNo',[('No'):1]),0)
	
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Registered name']),0),'Registered name')

	Mobile.verifyEqual(Mobile.getText(fo('FollowingText1',[('Verify'):'Registered name']),0),RegName)
	
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Proxy type']),0),'Proxy type')
	
	ProxyType = Mobile.getText(fo('FollowingText1',[('Verify'):'Proxy type']),0)
	
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Proxy ID']),0),'Proxy ID')
	
	ProxyID = Mobile.getText(fo('FollowingText1',[('Verify'):'Proxy ID']),0)
	
	
}
Mobile.tap(fo('Text',[('Verify'):'Done']),0)







Mobil






for(i=1;i<22;i++) {
	
	
	
	
}















