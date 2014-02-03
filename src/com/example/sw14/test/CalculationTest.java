package com.example.sw14.test;

import com.example.sw14.Calculator;
import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class CalculationTest extends
		ActivityInstrumentationTestCase2<Calculator> {
	
	private Solo solo;

	public CalculationTest() {
		super(Calculator.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	public void testButtons() {
		
		solo.clickOnButton("0");
		solo.clickOnButton("1");
		solo.clickOnButton("2");
		solo.clickOnButton("3");
		solo.clickOnButton("4");
		solo.clickOnButton("+");
		solo.clickOnButton("5");
		solo.clickOnButton("6");
		solo.clickOnButton("=");
		solo.clickOnButton("-");
		solo.clickOnButton("7");
		solo.clickOnButton("=");
		solo.clickOnButton("/");
		solo.clickOnButton("8");
		solo.clickOnButton("=");
		solo.clickOnButton("x");
		solo.clickOnButton("9");
		solo.clickOnButton("=");
		solo.clickOnButton("C");
	}
	
	public void testInputField() {
		
		solo.clickOnButton("4");
		solo.clickOnButton("2");
		
		solo.getText("42");
	}
	
	public void testAddition() {
		
		solo.clickOnButton("9");
		solo.clickOnButton("+");
		solo.clickOnButton("2");
		solo.clickOnButton("=");
		
		solo.getText("11");
		
	}
	
	public void testSubtraction() {
		
		solo.clickOnButton("9");
		solo.clickOnButton("+");
		solo.clickOnButton("9");
		solo.clickOnButton("=");
		solo.clickOnButton("-");
		solo.clickOnButton("3");
		solo.clickOnButton("=");
		
		solo.getText("15");
		
	}
	
	public void testMultiplication() {
		
		solo.clickOnButton("9");
		solo.clickOnButton("x");
		solo.clickOnButton("2");
		solo.clickOnButton("=");
		
		solo.getText("18");
		
	}
	
	public void testDivision() {
		
		solo.clickOnButton("9");
		solo.clickOnButton("+");
		solo.clickOnButton("2");
		solo.clickOnButton("=");
		solo.clickOnButton("+");
		solo.clickOnButton("9");
		solo.clickOnButton("=");
		solo.clickOnButton("/");
		solo.clickOnButton("2");
		solo.clickOnButton("=");
		
		solo.getText("10");
		
	}
	
	

}
