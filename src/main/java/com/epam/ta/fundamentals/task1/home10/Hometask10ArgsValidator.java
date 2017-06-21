package com.epam.ta.fundamentals.task1.home10;

import com.epam.ta.fundamentals.task1.exception.ArgsValidationException;
import com.epam.ta.fundamentals.task1.validator.AbstractArgsValidator;

public class Hometask10ArgsValidator extends AbstractArgsValidator {

	private static final String WRONG_ARGS_AMOUNT = "Wrong amount of arguments.";
	private static final String WRONG_NUMBER_FORMAT = "Argument should be an integer number.";
	private static final String NEGATIVE_MATRIX_SIZE = "Matrix size sould be positive.";
	private static int ARGS_AMOUNT = 1;

	public Hometask10ArgsValidator(String[] argsString) {
		super(argsString);
	}

	@Override
	public void checkArguments() throws ArgsValidationException {
		validateAmountOfArgsEqualTo(ARGS_AMOUNT, WRONG_ARGS_AMOUNT);
		extractIntArguments(WRONG_NUMBER_FORMAT);
		checkFirstArgIsPositive();
	}

	public void checkFirstArgIsPositive() throws ArgsValidationException {
		if (getIntArgsArr(0) < 0) {
			throw new ArgsValidationException(NEGATIVE_MATRIX_SIZE);
		}
	}
}
