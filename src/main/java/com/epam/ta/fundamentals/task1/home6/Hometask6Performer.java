package com.epam.ta.fundamentals.task1.home6;

import com.epam.ta.fundamentals.task1.exception.ArgsValidationException;
import com.epam.ta.fundamentals.task1.exception.PerformerException;
import com.epam.ta.fundamentals.task1.performer.AbstractPerformer;
import com.epam.ta.fundamentals.task1.util.DoubleValidator;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask6Performer extends AbstractPerformer {

	public Hometask6Performer(String argsString[]) {
		super(new Hometask6ArgsValidator(argsString));
	}

	private static final String EXPLANATION = "Calculation using numbers: ";
	private static final String RESULT = "Max and min number sum: ";

	public void performTask() throws PerformerException {

		double num1 = getValidator().getDoubleArgsArr(0);
		double num2 = getValidator().getDoubleArgsArr(1);
		double num3 = getValidator().getDoubleArgsArr(2);

		PrinterWorker.printString(EXPLANATION + num1 + ", " + num2 + ", " + num3);

		// first variant
		double[] arraySortedFromMaxToMin = generateArraySortedFromMaxToMin(num1, num2, num3);
		PrinterWorker.printString("\n" + RESULT + calcMaxAndMinSumm(arraySortedFromMaxToMin));

		// uncomment to see second variant
		// System.out.println(RESULT + calcMaxAndMinSumm(num1, num2, num3));
	}

	public double[] generateArraySortedFromMaxToMin(double num1, double num2, double num3) throws PerformerException {
		try {
			DoubleValidator.checkDoubleValue(num1);
			DoubleValidator.checkDoubleValue(num2);
			DoubleValidator.checkDoubleValue(num3);
		} catch (ArgsValidationException e) {
			throw new PerformerException(e.getClass() + "\n" + e.getMessage());
		}
		double[] sortedArray = { num1, num2, num3 };

		for (int i = 0; i < sortedArray.length; i++) {
			for (int j = i; j < sortedArray.length; j++) {
				if (sortedArray[j] > sortedArray[i]) {
					double tmp = sortedArray[i];
					sortedArray[i] = sortedArray[j];
					sortedArray[j] = tmp;
				}
			}
		}
		return sortedArray;
	}

	public double calcMaxAndMinSumm(double[] arraySortedFromMaxToMin) throws PerformerException {
		// max - 1st array element, min - last array element
		try {
			DoubleValidator.checkDoubleArray(arraySortedFromMaxToMin);
		} catch (ArgsValidationException e) {
			throw new PerformerException(e.getClass() + "\n" + e.getMessage());
		}
		double result = arraySortedFromMaxToMin[0] + arraySortedFromMaxToMin[arraySortedFromMaxToMin.length - 1];
		return result;
	}

	public double calcMaxAndMinSumm(double num1, double num2, double num3) throws PerformerException {
		try {
			DoubleValidator.checkDoubleValue(num1);
			DoubleValidator.checkDoubleValue(num2);
			DoubleValidator.checkDoubleValue(num3);
		} catch (ArgsValidationException e) {
			throw new PerformerException(e.getClass() + "\n" + e.getMessage());
		}
		double result = 0;
		if (num1 > num2) {
			if (num1 > num3) {
				if (num2 > num3) {
					result = num1 + num3;
				} else {
					result = num1 + num2;
				}
			} else {
				result = num3 + num2;
			}
		} else {
			if (num2 > num3) {
				if (num1 > num3) {
					result = num2 + num3;
				} else {
					result = num2 + num1;
				}
			} else {
				result = num3 + num1;
			}
		}
		return result;
	}
}
