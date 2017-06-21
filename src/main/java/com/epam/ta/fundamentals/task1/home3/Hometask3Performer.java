package com.epam.ta.fundamentals.task1.home3;

import com.epam.ta.fundamentals.task1.exception.ArgsValidationException;
import com.epam.ta.fundamentals.task1.exception.PerformerException;
import com.epam.ta.fundamentals.task1.performer.AbstractPerformer;
import com.epam.ta.fundamentals.task1.util.DoubleValidator;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask3Performer extends AbstractPerformer {

	private static final String EXPLANATION = "Calculate for triangle with sides: ";

	public Hometask3Performer(String[] argsString) {
		super(new Hometask3ArgsValidator(argsString));
	}

	public void performTask() throws PerformerException {

		double a = getValidator().getDoubleArgsArr()[0];
		double b = getValidator().getDoubleArgsArr()[1];
		double hypotenuse = 0;

		hypotenuse = findHypot(a, b);
		PrinterWorker.printString(EXPLANATION + a + " " + b);
		PrinterWorker.printString("\nPerimeter: " + findPerimeter(a, b, hypotenuse));
		PrinterWorker.printString("\nSquare: " + findSquare(a, b));
	}

	public double findHypot(double a, double b) throws PerformerException {
		try {
			a = Double.NaN;
			DoubleValidator.checkDoubleValue(a);
			DoubleValidator.checkDoubleValue(b);
		} catch (ArgsValidationException e) {
			throw new PerformerException(e.getClass() + "\n" + e.getMessage());
		}
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

	public double findSquare(double a, double b) throws PerformerException {
		try {
			DoubleValidator.checkDoubleValue(a);
			DoubleValidator.checkDoubleValue(b);
		} catch (ArgsValidationException e) {
			throw new PerformerException(e.getClass() + "\n" + e.getMessage());
		}
		return a * b;
	}

	public double findPerimeter(double a, double b, double hypotenuse) throws PerformerException {
		try {
			DoubleValidator.checkDoubleValue(a);
			DoubleValidator.checkDoubleValue(b);
			DoubleValidator.checkDoubleValue(hypotenuse);
		} catch (ArgsValidationException e) {
			throw new PerformerException(e.getClass() + "\n" + e.getMessage());
		}
		return a + b + hypotenuse;
	}

}
