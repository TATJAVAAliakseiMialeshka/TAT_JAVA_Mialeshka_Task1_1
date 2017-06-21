package com.epam.ta.fundamentals.task1.home1;

import com.epam.ta.fundamentals.task1.exception.ArgsValidationException;
import com.epam.ta.fundamentals.task1.validator.AbstractArgsValidator;

public class Hometask1ArgsValidator extends AbstractArgsValidator {

	private static final String WRONG_ARGS_AMOUNT = "Incorrect amount of arguments.";
	private static final String WRONG_NUMBER_FORMAT = "Number should be an integer.";
	private static final String INCORRECT_NUMBER_LENGTH = "Incorrect number length.";
	private static final int minNumber = 1000;
	private static final int maxNumber = 9999;
	private static final int ARGS_AMOUNT = 1;

	public Hometask1ArgsValidator(String argsString[]) {
		super(argsString);
	}

	@Override
	public void checkArguments() throws ArgsValidationException {
		validateAmountOfArgsEqualTo(ARGS_AMOUNT, WRONG_ARGS_AMOUNT);
		extractIntArguments(WRONG_NUMBER_FORMAT);
		validateNumberLength();
	}

	public void validateNumberLength() throws ArgsValidationException {
		if (getIntArgsArr()[0] < minNumber || getIntArgsArr()[0] > maxNumber) {
			throw new ArgsValidationException(INCORRECT_NUMBER_LENGTH);
		}
	}

}
