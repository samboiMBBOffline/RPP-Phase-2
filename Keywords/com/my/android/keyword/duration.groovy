package com.my.android.keyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class duration {

	static void dropdownCheck(String text) {
		
		if (text == 'Anytime'||text =='Daily'||text == 'Weekly'||text =='Monthly'||text =='Quaterly'||text =='Yearly')
		{
		switch(text) {
			case 'Anytime':
				Mobile.verifyEqual(text,'Anytime')
			case 'Daily':
				Mobile.verifyEqual(text,'Daily')
			case 'Weekly':
				Mobile.verifyEqual(text,'Weekly')
			case 'Monthly':
				Mobile.verifyEqual(text,'Monthly')
			case 'Quaterly':
				Mobile.verifyEqual(text,'Quaterly')
			case 'Yearly':
				Mobile.verifyEqual(text,'Yearly')
		}
	}else {
		return 
	}
}
}