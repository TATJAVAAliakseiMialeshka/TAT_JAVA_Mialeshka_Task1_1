package com.epam.ta.fundamentals.task1.home9;

import com.epam.ta.fundamentals.task1.performer.AbstractPerformer;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask9Performer extends AbstractPerformer {

	private static final String INITIAL = "Initial array ";
	private static final String RESULT = "Result array: ";
	private static final String INDEX = "Array1 insertion index: ";

	public Hometask9Performer(String argsString[]) {
		super(new Hometask9ArgsValidator(argsString));
	}

	@Override
	public void performTask() {

		Hometask9ArgsValidator validator = null;
		int[] arr1 = null;
		int[] arr2 = null;
		int insertIndex = 0;

		if (getValidator() instanceof Hometask9ArgsValidator) {
			validator = (Hometask9ArgsValidator) getValidator();
			arr1 = validator.getFirstArray();
			arr2 = validator.getSecondArray();
			insertIndex = validator.getInsertIndex();
		}

		printArray(generateResultArray(arr1, arr2, insertIndex));
	}

	private void initiateOutput(int[] arr1, int[] arr2, int insertIndex) {
		PrinterWorker.printString(INITIAL + "1: ");
		printArray(arr1);
		PrinterWorker.printString("\n" + INITIAL + "2: ");
		printArray(arr2);
		PrinterWorker.printString("\n" + INDEX + insertIndex);
		PrinterWorker.printString("\n" + RESULT);
	}

	private void printArray(int[] arr) {
		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				PrinterWorker.printString(arr[i] + " ");
			}
			PrinterWorker.printString("");
		}
	}

	public int[] generateResultArray(int[] arr1, int[] arr2, int insertIndex) {
		int[] resultArray = {};
		if (arr1 != null && arr2 != null) {
			initiateOutput(arr1, arr2, insertIndex);
			resultArray = new int[arr1.length + arr2.length];
			for (int i = 0; i < insertIndex; i++) {
				resultArray[i] = arr1[i];
			}
			for (int i = 0; i < arr2.length; i++) {
				resultArray[i + insertIndex] = arr2[i];
			}
			for (int i = 0 + insertIndex; i < arr1.length; i++) {
				resultArray[i + arr2.length] = arr1[i];
			}
		}
		return resultArray;
	}

}
