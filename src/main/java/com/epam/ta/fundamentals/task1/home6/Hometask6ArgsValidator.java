package com.epam.ta.fundamentals.task1.home6;

import com.epam.ta.fundamentals.task1.exception.ArgsValidationException;
import com.epam.ta.fundamentals.task1.validator.AbstractArgsValidator;

public class Hometask6ArgsValidator extends AbstractArgsValidator {

	private static final String WRONG_ARGS_AMOUNT = "Wrong amount of arguments.";
	private static final String WRONG_NUMBER_FORMAT = "Argument should be a number.";
	private static int ARGS_AMOUNT = 3;

	public Hometask6ArgsValidator(String[] argsString) {
		super(argsString);
	}

	@Override
	public void checkArguments() throws ArgsValidationException {
		validateAmountOfArgsEqualTo(ARGS_AMOUNT, WRONG_ARGS_AMOUNT);
		extractDoubleArguments(WRONG_NUMBER_FORMAT);
	}
}
