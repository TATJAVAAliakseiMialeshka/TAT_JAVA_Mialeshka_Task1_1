package com.epam.ta.fundamentals.task1.home9;

import com.epam.ta.fundamentals.task1.exception.ArgsValidationException;
import com.epam.ta.fundamentals.task1.validator.AbstractArgsValidator;

public class Hometask9ArgsValidator extends AbstractArgsValidator {

	private static final String WRONG_ARGS_AMOUNT = "Wrong amount of arguments.";
	private static final String NOT_INT_ARG = "Argument should be an integer number.";
	private static final String ERROR_INDEX = "Insert index should be positive number and be less than array1 size.";

	private static int ARGS_AMOUNT = 4;

	private int dotPlace = 0;

	private int[] firstArray;

	private int[] secondArray;

	private int insertIndex;

	public int[] getFirstArray() {
		return firstArray;
	}

	public void setFirstArray(int[] firstArray) {
		this.firstArray = firstArray;
	}

	public int[] getSecondArray() {
		return secondArray;
	}

	public void setSecondArray(int[] secondArray) {
		this.secondArray = secondArray;
	}

	public int getInsertIndex() {
		return insertIndex;
	}

	public void setInsertIndex(int insertIndex) {
		this.insertIndex = insertIndex;
	}

	public int getDotPlace() {
		return dotPlace;
	}

	public void setDotPlace(int dotPlace) {
		this.dotPlace = dotPlace;
	}

	public Hometask9ArgsValidator(String[] argsString) {
		super(argsString);
	}

	@Override
	public void checkArguments() throws ArgsValidationException {
		validateAmountOfArgsLessThan(ARGS_AMOUNT, WRONG_ARGS_AMOUNT);
		findDotPlace();
		extractAndCheckFirstIntArray();
		extractAndCheckSecondIntArray();
		findInsertIndex(getFirstArray().length);
	}

	public void findDotPlace() {
		int dot = 0;
		for (int i = 0; i < getArgsString().length; i++) {
			if (getArgsString()[i].equals(".")) {
				dot = i;
			}
		}
		setDotPlace(dot);
	}

	public void findInsertIndex(int insertArrayLength) throws ArgsValidationException {
		int insertIndex = Integer.parseInt(getArgsString(getArgsString().length - 1));

		if (insertIndex < 0 || insertIndex > insertArrayLength) {
			throw new ArgsValidationException(ERROR_INDEX);
		}
		setInsertIndex(insertIndex);
	}

	public void extractAndCheckFirstIntArray() throws ArgsValidationException {
		int[] firstArray = new int[dotPlace];
		try {
			for (int i = 0; i < firstArray.length; i++) {
				firstArray[i] = Integer.parseInt(getArgsString(i));
			}
		} catch (NumberFormatException e) {
			throw new ArgsValidationException(NOT_INT_ARG);
		}
		setFirstArray(firstArray);
	}

	public void extractAndCheckSecondIntArray() throws ArgsValidationException {
		int[] secondArray = new int[getArgsString().length - dotPlace - 2];
		try {
			for (int i = 0; i < secondArray.length; i++) {
				secondArray[i] = Integer.parseInt(getArgsString(i + dotPlace + 1));
			}
		} catch (NumberFormatException e) {
			throw new ArgsValidationException(NOT_INT_ARG);
		}
		setSecondArray(secondArray);
	}

}
