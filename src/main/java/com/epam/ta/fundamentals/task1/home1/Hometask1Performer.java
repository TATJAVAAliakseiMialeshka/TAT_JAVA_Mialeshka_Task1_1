package com.epam.ta.fundamentals.task1.home1;

import com.epam.ta.fundamentals.task1.performer.AbstractPerformer;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask1Performer extends AbstractPerformer {

	public Hometask1Performer(String[] argsString) {
		super(new Hometask1ArgsValidator(argsString));
	}
	
	public void performTask() {

		int digit1, digit2, digit3, digit4;
		int initialNumber = getValidator().getIntArgsArr()[0];
		int numberForCalculation = initialNumber;
		digit4 = numberForCalculation % 10;
		numberForCalculation = numberForCalculation / 10;
		digit3 = numberForCalculation % 10;
		numberForCalculation = numberForCalculation / 10;
		digit2 = numberForCalculation % 10;
		numberForCalculation = numberForCalculation / 10;
		digit1 = numberForCalculation % 10;
		numberForCalculation = numberForCalculation / 10;

		if (digit1 + digit2 == digit3 + digit4) {
			PrinterWorker.printString(true);
		} else {
			PrinterWorker.printString(false);
		}
	}

}
