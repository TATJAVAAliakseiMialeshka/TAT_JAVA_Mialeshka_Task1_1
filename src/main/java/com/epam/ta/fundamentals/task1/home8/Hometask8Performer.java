package com.epam.ta.fundamentals.task1.home8;

import com.epam.ta.fundamentals.task1.performer.AbstractPerformer;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask8Performer extends AbstractPerformer {

	private static final String EXPLANATION = "Calculation array: ";
	private static final String RESULT = "\nSumm of elements multiple by ";

	public Hometask8Performer(String argsString[]) {
		super(new Hometask8ArgsValidator(argsString));
	}

	@Override
	public void performTask() {

		long[] fullArgsArray = getValidator().getLongArgsArr();
		long[] numbersArray = new long[fullArgsArray.length - 1];

		for (int i = 0; i < numbersArray.length; i++) {
			numbersArray[i] = fullArgsArray[i];
		}
		long division = fullArgsArray[fullArgsArray.length - 1];
		printArray(numbersArray);
		PrinterWorker.printString(RESULT + division + ": " + calcSumm(numbersArray, division));
	}

	public long calcSumm(long[] arr, long division) {
		long summ = 0;
		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % division == 0) {
					summ += arr[i];
				}
			}
		}
		return summ;
	}

	public void printArray(long[] arr) {
		if (arr != null) {
			PrinterWorker.printString(EXPLANATION);
			for (int i = 0; i < arr.length; i++) {
				PrinterWorker.printString(arr[i] + " ");
			}
			PrinterWorker.printString("");
		}
	}

}
