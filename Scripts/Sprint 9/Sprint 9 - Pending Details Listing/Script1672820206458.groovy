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

if(GlobalVariable.type =='ind'||GlobalVariable.type =='soleUR') {
	
	'youve received a request from'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,19)]),0),
		ft('TestData').getValue(4,19))
	
	Mobile.takeScreenshot('Screenshot/DetailsPending/1.png')
	
	VendorName = Mobile.getText(fo('FollowingText1',[('Verify'):ft('TestData').getValue(4,19)]),0)

	Status = Mobile.getText(fo('FollowingText2',[('Verify'):VendorName]),0)
	
	if (Status == 'Incoming') {
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Incoming']),0),'Incoming')
	}else {
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Expiring Soon']),0),'Expiring Soon')
	}
	
	'Requested on'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,20)]),0),ft('TestData').getValue(4,20))
	
	DateRequested = Mobile.getText(fo('FollowingText1',[('Verify'):ft('TestData').getValue(4,20)]),0)
	
	'Recipient ref'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,21)]),0),ft('TestData').getValue(4,21))
	
	RecipientRef = Mobile.getText(fo('FollowingText1',[('Verify'):ft('TestData').getValue(4,21)]),0)
	
	if(Mobile.verifyElementExist(fo('Text',[('Verify'):ft('TestData').getValue(4,22)]),5,FailureHandling.OPTIONAL)) {
		
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('TestData').getValue(4,22)]),0),ft('TestData').getValue(4,22))
		
		PaymentDeets = Mobile.getText(fo('FollowingText1',[('Verify'):ft('TestData').getValue(4,22)]),0)
	}
	
	
	
	
	
		
}else {
	
}















