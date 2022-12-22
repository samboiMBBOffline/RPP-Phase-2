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

'first page exist'
if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('TestData').getValue(4, 1)]), 3, FailureHandling.OPTIONAL)) {
    'Tap skip'
    Mobile.tap(fo('Text', [('Verify') : ft('TestData').getValue(4, 2)]), 0)

    'Tap Agree'
    Mobile.tap(fo('Text', [('Verify') : 'Agree']), 0)

    'verify send& request not visible for prelogin'
    Mobile.verifyElementNotExist(fo('Text', [('Verify') : ft('TestData').getValue(4, 3)]), 3)

    Mobile.takeScreenshot('Screenshot/MRPB35/1.png')

    Mobile.tap(fo('Text', [('Verify') : 'Transfer']), 0)

    if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('UserID').getValue(3, 1)]), 3, FailureHandling.OPTIONAL)) {
        Mobile.callTestCase(findTestCase('A. Start'), [('ID') : 2, ('NO') : 1], FailureHandling.STOP_ON_FAILURE)
    }
}

Mobile.tap(fo('Text', [('Verify') : 'Maybank2u']), 2)

tapNo.pin(ft('UserID').getValue(4, GlobalVariable.pass))

Mobile.delay(10)

Mobile.tap(fo('ButtonNo', [('No') : 2]), 0)

Mobile.tap(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 1)]), 0)

password.setText(ft('UserID').getValue(2, GlobalVariable.pass))

if ((GlobalVariable.type == 'ind') || (GlobalVariable.type == 'soleUR')) {
    Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 8)]), 0), ft('AutoBill').getValue(
            4, 8))
} else {
    Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 9)]), 0), ft('AutoBill').getValue(
            4, 9))
}

Mobile.takeScreenshot('Screenshot/1.png')

if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 6)]), 0, FailureHandling.OPTIONAL)) {
    'Manage your bills'
    Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 6)]), 0), ft('AutoBill').getValue(
            4, 6))

    'pay your bills..'
    Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 7)]), 0), ft('AutoBill').getValue(
            4, 7))
} else {
    'My Bills'
    Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(3, 5)]), 0), ft('EntryPoint').getValue(
            3, 5))

   

    Mobile.takeScreenshot('Screenshot/Entry/AutoBill1.png')
	
    if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 6)]), 0, FailureHandling.OPTIONAL)) {
        'Outgoing'
        Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 6)]), 0), ft('EntryPoint').getValue(
                4, 6))

        ReceiverSender1 = Mobile.getText(fo('FollowingText1', [('Verify') : ft('EntryPoint').getValue(4, 6)]), 0)

        Period1 = Mobile.getText(fo('FollowingText1', [('Verify') : ReceiverSender1]), 0)

        A1 = Period1.replaceAll('\\s.*', '')
		
        duration.dropdownCheck(A1)

        DateFull1 = Mobile.getText(fo('FollowingText1', [('Verify') : Period1]), 0)

		Format1 = DateFull1.substring(0,7)
		
		Mobile.verifyEqual(Format1, 'Created')
		
        DateFormat1 = DateFull1.substring(11)

        Mobile.takeScreenshot('Screenshot/Entry/AutoBill2.png')
		
		
    }
    
    if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 7)]), 0, FailureHandling.OPTIONAL)) {
        'Active'
        Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 7)]), 0), ft('EntryPoint').getValue(
                4, 7))

        ReceiverSender2 = Mobile.getText(fo('FollowingText1', [('Verify') : ft('EntryPoint').getValue(4, 7)]), 0)

        Period2 = Mobile.getText(fo('FollowingText1', [('Verify') : ReceiverSender2]), 0)

        A2 = Period2.replaceAll('\\s.*', '')

        duration.dropdownCheck(A2)

        DateFull2 = Mobile.getText(fo('FollowingText1', [('Verify') : Period2]), 0)

		Format2 = DateFull2.substring(0,9) 
		
		Mobile.verifyEqual(Format2,'Last Paid')
		
        DateFormat2 = DateFull2.substring(10)

        Mobile.takeScreenshot('Screenshot/Entry/AutoBill3.png')
		
		
    }
    
    if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 8)]), 0, FailureHandling.OPTIONAL)) {
        'Paused'
        Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 8)]), 0), ft('EntryPoint').getValue(
                4, 8))

        ReceiverSender3 = Mobile.getText(fo('FollowingText1', [('Verify') : ft('EntryPoint').getValue(4, 8)]), 0)

        Period3 = Mobile.getText(fo('FollowingText1', [('Verify') : ReceiverSender3]), 0)

        A3 = Period3.replaceAll('\\s.*', '')

        duration.dropdownCheck(A3)

        DateFull3 = Mobile.getText(fo('FollowingText1', [('Verify') : Period3]), 0)

		Format3 = DateFull3.substring(0,9)
		
		Mobile.verifyEqual(Format3,'Last Paid')
		
        DateFormat3 = DateFull3.substring(10)

        Mobile.takeScreenshot('Screenshot/Entry/AutoBill3.png')

		
    }
	
	if(Mobile.verifyElementExist(fo('Auto Billing/FollowingText0'),0,FailureHandling.OPTIONAL)) {
	
	'View All'
	Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 5)]), 0), ft('EntryPoint').getValue(
			4, 5))
	
	
	Mobile.tap(fo('Text',[('Verify'):'View All']),0)
	
	'Bill Status'
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('AutoBill').getValue(2,13)]),0),ft('AutoBill').getValue(2,13))
	
	Mobile.takeScreenshot('Screenshot/Entry/AutoBill7.png')
	
	'My Bills'
	Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(3, 5)]), 0), ft('EntryPoint').getValue(
			3, 5))
	
	
	
	if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 6)]), 0, FailureHandling.OPTIONAL)) {
		'Outgoing'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 6)]), 0), ft('EntryPoint').getValue(
				4, 6))

		ReceiverSender1 = Mobile.getText(fo('FollowingText1', [('Verify') : ft('EntryPoint').getValue(4, 6)]), 0)

		Period1 = Mobile.getText(fo('FollowingText1', [('Verify') : ReceiverSender1]), 0)

		A1 = Period1.replaceAll('\\s.*', '')
		
		duration.dropdownCheck(A1)

		DateFull1 = Mobile.getText(fo('FollowingText1', [('Verify') : Period1]), 0)

		Format1 = DateFull1.substring(0,7)
		
		Mobile.verifyEqual(Format1, 'Created')
		
		DateFormat1 = DateFull1.substring(11)

		Mobile.takeScreenshot('Screenshot/Entry/AutoBill2.png')
		
		
	}
	
	if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 7)]), 0, FailureHandling.OPTIONAL)) {
		'Active'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 7)]), 0), ft('EntryPoint').getValue(
				4, 7))

		ReceiverSender2 = Mobile.getText(fo('FollowingText1', [('Verify') : ft('EntryPoint').getValue(4, 7)]), 0)

		Period2 = Mobile.getText(fo('FollowingText1', [('Verify') : ReceiverSender2]), 0)

		A2 = Period2.replaceAll('\\s.*', '')

		duration.dropdownCheck(A2)

		DateFull2 = Mobile.getText(fo('FollowingText1', [('Verify') : Period2]), 0)

		Format2 = DateFull2.substring(0,9)
		
		Mobile.verifyEqual(Format2,'Last Paid')
		
		DateFormat2 = DateFull2.substring(10)

		Mobile.takeScreenshot('Screenshot/Entry/AutoBill3.png')
		
		
	}
	
	if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 8)]), 0, FailureHandling.OPTIONAL)) {
		'Paused'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 8)]), 0), ft('EntryPoint').getValue(
				4, 8))

		ReceiverSender3 = Mobile.getText(fo('FollowingText1', [('Verify') : ft('EntryPoint').getValue(4, 8)]), 0)

		Period3 = Mobile.getText(fo('FollowingText1', [('Verify') : ReceiverSender3]), 0)

		A3 = Period3.replaceAll('\\s.*', '')

		duration.dropdownCheck(A3)

		DateFull3 = Mobile.getText(fo('FollowingText1', [('Verify') : Period3]), 0)

		Format3 = DateFull3.substring(0,9)
		
		Mobile.verifyEqual(Format3,'Last Paid')
		
		DateFormat3 = DateFull3.substring(10)

		Mobile.takeScreenshot('Screenshot/Entry/AutoBill3.png')

		
	}

	}
	Mobile.tap(fo('ButtonNo',[('No'):1]),0)
}
	Mobile.delay(5)
	
	Mobile.tap(fo('Text',[('Verify'):'PAST']),0)
	
	
	
	
	
	
	
	
	
	
	
	
	if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 6)]), 0, FailureHandling.OPTIONAL)) {
		'Manage your bills'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 6)]), 0), ft('AutoBill').getValue(
				4, 6))
	
		'pay your bills..'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 7)]), 0), ft('AutoBill').getValue(
				4, 7))
	} else {
		'My Bills'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(3, 5)]), 0), ft('EntryPoint').getValue(
				3, 5))
	
	   
	
		Mobile.takeScreenshot('Screenshot/Entry/AutoBillPass1.png')
		
		if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 9)]), 0, FailureHandling.OPTIONAL)) {
			'Rejected'
			Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 9)]), 0), ft('EntryPoint').getValue(
					4, 9))
	
			ReceiverSender4 = Mobile.getText(fo('FollowingText1', [('Verify') : ft('EntryPoint').getValue(4, 9)]), 0)
	
			Period4 = Mobile.getText(fo('FollowingText1', [('Verify') : ReceiverSender4]), 0)
	
			A4 = Period1.replaceAll('\\s.*', '')
			
			duration.dropdownCheck(A4)
	
			DateFull4 = Mobile.getText(fo('FollowingText1', [('Verify') : Period4]), 0)
	
			Format4 = DateFull4.substring(0,7)
			
			Mobile.verifyEqual(Format4, 'Created')
			
			DateFormat4 = DateFull1.substring(11)
	
			Mobile.takeScreenshot('Screenshot/Entry/AutoBillPass2.png')
			
			
		}
		
		if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 10)]), 0, FailureHandling.OPTIONAL)) {
			'Ended'
			Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 10)]), 0), ft('EntryPoint').getValue(
					4, 10))
	
			ReceiverSender5 = Mobile.getText(fo('FollowingText1', [('Verify') : ft('EntryPoint').getValue(4, 10)]), 0)
	
			Period5 = Mobile.getText(fo('FollowingText1', [('Verify') : ReceiverSender5]), 0)
	
			A5 = Period5.replaceAll('\\s.*', '')
	
			duration.dropdownCheck(A5)
	
			DateFull5 = Mobile.getText(fo('FollowingText1', [('Verify') : Period5]), 0)
	
			Format5 = DateFull5.substring(0,9)
			
			Mobile.verifyEqual(Format5,'Last Paid')
			
			DateFormat5 = DateFull5.substring(10)
	
			Mobile.takeScreenshot('Screenshot/Entry/AutoBillPass3.png')
			
			
		}
		
		if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 11)]), 0, FailureHandling.OPTIONAL)) {
			'Cancelled'
			Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 11)]), 0), ft('EntryPoint').getValue(
					4, 11))
	
			ReceiverSender6 = Mobile.getText(fo('FollowingText1', [('Verify') : ft('EntryPoint').getValue(4, 11)]), 0)
	
			Period6 = Mobile.getText(fo('FollowingText1', [('Verify') : ReceiverSender6]), 0)
	
			A6 = Period6.replaceAll('\\s.*', '')
	
			duration.dropdownCheck(A6)
	
			DateFull6 = Mobile.getText(fo('FollowingText1', [('Verify') : Period6]), 0)
	
			Format6 = DateFull6.substring(0,9)
			
			Mobile.verifyEqual(Format6,'Last Paid')
			
			DateFormat6 = DateFull6.substring(10)
	
			Mobile.takeScreenshot('Screenshot/Entry/AutoBillPass3.png')
	
			
		}
		
		
		if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 12)]), 0, FailureHandling.OPTIONAL)) {
			'Expired'
			Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 12)]), 0), ft('EntryPoint').getValue(
					4, 12))
	
			ReceiverSender7 = Mobile.getText(fo('FollowingText1', [('Verify') : ft('EntryPoint').getValue(4, 12)]), 0)
	
			Period7 = Mobile.getText(fo('FollowingText1', [('Verify') : ReceiverSender7]), 0)
	
			A7 = Period7.replaceAll('\\s.*', '')
	
			duration.dropdownCheck(A7)
	
			DateFull7 = Mobile.getText(fo('FollowingText1', [('Verify') : Period7]), 0)
	
			Format7 = DateFull7.substring(0,9)
			
			Mobile.verifyEqual(Format7,'Last Paid')
			
			DateFormat7 = DateFull7.substring(10)
	
			Mobile.takeScreenshot('Screenshot/Entry/AutoBillPass3.png')
	
			
		}
		
		
		
		
		if(Mobile.verifyElementExist(fo('Auto Billing/FollowingText0'),0,FailureHandling.OPTIONAL)) {
		
		'View All'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 5)]), 0), ft('EntryPoint').getValue(
				4, 5))
		
		
		Mobile.tap(fo('Text',[('Verify'):'View All']),0)
		
		'Bill Status'
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('AutoBill').getValue(2,13)]),0),ft('AutoBill').getValue(2,13))
		
		Mobile.takeScreenshot('Screenshot/Entry/AutoBillPass7.png')
		
		'My Bills'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(3, 5)]), 0), ft('EntryPoint').getValue(
				3, 5))
		
		
		
		if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 6)]), 0, FailureHandling.OPTIONAL)) {
			'Outgoing'
			Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 6)]), 0), ft('EntryPoint').getValue(
					4, 6))
	
			ReceiverSender1 = Mobile.getText(fo('FollowingText1', [('Verify') : ft('EntryPoint').getValue(4, 6)]), 0)
	
			Period1 = Mobile.getText(fo('FollowingText1', [('Verify') : ReceiverSender1]), 0)
	
			A1 = Period1.replaceAll('\\s.*', '')
			
			duration.dropdownCheck(A1)
	
			DateFull1 = Mobile.getText(fo('FollowingText1', [('Verify') : Period1]), 0)
	
			Format1 = DateFull1.substring(0,7)
			
			Mobile.verifyEqual(Format1, 'Created')
			
			DateFormat1 = DateFull1.substring(11)
	
			Mobile.takeScreenshot('Screenshot/Entry/AutoBillPass2.png')
			
			
		}
		
		if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 7)]), 0, FailureHandling.OPTIONAL)) {
			'Active'
			Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 7)]), 0), ft('EntryPoint').getValue(
					4, 7))
	
			ReceiverSender2 = Mobile.getText(fo('FollowingText1', [('Verify') : ft('EntryPoint').getValue(4, 7)]), 0)
	
			Period2 = Mobile.getText(fo('FollowingText1', [('Verify') : ReceiverSender2]), 0)
	
			A2 = Period2.replaceAll('\\s.*', '')
	
			duration.dropdownCheck(A2)
	
			DateFull2 = Mobile.getText(fo('FollowingText1', [('Verify') : Period2]), 0)
	
			Format2 = DateFull2.substring(0,9)
			
			Mobile.verifyEqual(Format2,'Last Paid')
			
			DateFormat2 = DateFull2.substring(10)
	
			Mobile.takeScreenshot('Screenshot/Entry/AutoBillPass3.png')
			
			
		}
		
		if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 8)]), 0, FailureHandling.OPTIONAL)) {
			'Paused'
			Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 8)]), 0), ft('EntryPoint').getValue(
					4, 8))
	
			ReceiverSender3 = Mobile.getText(fo('FollowingText1', [('Verify') : ft('EntryPoint').getValue(4, 8)]), 0)
	
			Period3 = Mobile.getText(fo('FollowingText1', [('Verify') : ReceiverSender3]), 0)
	
			A3 = Period3.replaceAll('\\s.*', '')
	
			duration.dropdownCheck(A3)
	
			DateFull3 = Mobile.getText(fo('FollowingText1', [('Verify') : Period3]), 0)
	
			Format3 = DateFull3.substring(0,9)
			
			Mobile.verifyEqual(Format3,'Last Paid')
			
			DateFormat3 = DateFull3.substring(10)
	
			Mobile.takeScreenshot('Screenshot/Entry/AutoBillPass3.png')
	
			
		}
	
	
		}
	
	
	
	
	
	
	
	
}

