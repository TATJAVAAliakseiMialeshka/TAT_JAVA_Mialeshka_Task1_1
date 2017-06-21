package com.epam.ta.fundamentals.task1.home3;

import com.epam.ta.fundamentals.task1.exception.ArgsValidationException;
import com.epam.ta.fundamentals.task1.validator.AbstractArgsValidator;

public class Hometask3ArgsValidator extends AbstractArgsValidator {

	private static final String WRONG_ARGS_AMOUNT = "Incorrect amount of arguments.";
	private static final String WRONG_NUMBER_FORMAT = "Triangle side should be a number.";
	private static final String NEGATIVE_SIDE_ERR = "Triangle side should be positive.";
	private static final int ARGS_AMOUNT = 2;

	public Hometask3ArgsValidator(String[] argsString) {
		super(argsString);
	}

	@Override
	public void checkArguments() throws ArgsValidationException {
		validateAmountOfArgsEqualTo(ARGS_AMOUNT, WRONG_ARGS_AMOUNT);
		extractDoubleArguments(WRONG_NUMBER_FORMAT);
		validateDoubleArrIsPositive(NEGATIVE_SIDE_ERR);
	}

}
