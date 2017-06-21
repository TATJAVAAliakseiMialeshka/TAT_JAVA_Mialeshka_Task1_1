package com.epam.ta.fundamentals.task1.home5;

import com.epam.ta.fundamentals.task1.exception.ArgsValidationException;
import com.epam.ta.fundamentals.task1.exception.PerformerException;
import com.epam.ta.fundamentals.task1.performer.AbstractPerformer;
import com.epam.ta.fundamentals.task1.util.DoubleValidator;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask5Performer extends AbstractPerformer {

	private static final String EXPLANATION = "Calculation using numbers: ";
	private static final String RESULT = "Number after transformation: ";

	public Hometask5Performer(String[] args) {
		super(new Hometask5ArgsValidator(args));
	}

	public void performTask() throws PerformerException {

		double num1 = getValidator().getDoubleArgsArr()[0];
		double num2 = getValidator().getDoubleArgsArr()[1];
		double num3 = getValidator().getDoubleArgsArr()[2];

		PrinterWorker.printString(EXPLANATION + num1 + ", " + num2 + ", " + num3);

		num1 = transformNumber(num1);
		num2 = transformNumber(num2);
		num3 = transformNumber(num3);

		PrinterWorker.printString(RESULT + num1 + ", " + num2 + ", " + num3);
	}

	public double transformNumber(double num) throws PerformerException {
		try {
			DoubleValidator.checkDoubleValue(num);
		} catch (ArgsValidationException e) {
			throw new PerformerException(e.getClass() + "\n" + e.getMessage());
		}
		if (num > 0) {
			num = Math.pow(num, 2);
		} else {
			num = Math.pow(num, 4);
		}
		return num;
	}
}
