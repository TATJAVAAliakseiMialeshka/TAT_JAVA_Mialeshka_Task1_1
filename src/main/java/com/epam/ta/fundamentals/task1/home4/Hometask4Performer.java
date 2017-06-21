package com.epam.ta.fundamentals.task1.home4;

import com.epam.ta.fundamentals.task1.exception.ArgsValidationException;
import com.epam.ta.fundamentals.task1.exception.PerformerException;
import com.epam.ta.fundamentals.task1.performer.AbstractPerformer;
import com.epam.ta.fundamentals.task1.util.DoubleValidator;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask4Performer extends AbstractPerformer {

	private static final String EXPLANATION = "Running calculation for coords: ";

	public Hometask4Performer(String[] argsString) {
		super(new Hometask4ArgsValidator(argsString));
	}

	public void performTask() throws PerformerException {

		double x = getValidator().getDoubleArgsArr()[0];
		double y = getValidator().getDoubleArgsArr()[1];
		PrinterWorker.printString(EXPLANATION + " x = " + x + ", y = " + y + "\n");
		PrinterWorker.printString(isDotInArea(x, y));
	}

	public boolean isDotInArea(double x, double y) throws PerformerException {
		boolean isDotInArea = false;
		try {
			DoubleValidator.checkDoubleValue(x);
			DoubleValidator.checkDoubleValue(y);
		} catch (ArgsValidationException e) {
			throw new PerformerException(e.getClass() + "\n" + e.getMessage());
		}
		if ((x >= -2 && x <= 2 && y > 0 && y <= 4) || (x >= -4 && x <= 4 && y >= -3 && y <= 0)) {
			isDotInArea = true;
		}
		return isDotInArea;
	}
}
