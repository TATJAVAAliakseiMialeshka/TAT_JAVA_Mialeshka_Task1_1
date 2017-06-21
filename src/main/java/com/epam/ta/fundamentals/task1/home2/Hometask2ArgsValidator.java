package com.epam.ta.fundamentals.task1.home2;

import com.epam.ta.fundamentals.task1.exception.ArgsValidationException;
import com.epam.ta.fundamentals.task1.validator.AbstractArgsValidator;

public class Hometask2ArgsValidator extends AbstractArgsValidator {

	private static final String WRONG_ARGS_AMOUNT = "Incorrect amount of arguments.";
	private static final String WRONG_NUMBER_FORMAT = "Arguments should be numbers.";
	private static final int argsAmount = 3;

	public Hometask2ArgsValidator(String[] argsString) {
		super(argsString);
	}

	@Override
	public void checkArguments() throws ArgsValidationException {
		validateAmountOfArgsEqualTo(argsAmount, WRONG_ARGS_AMOUNT);
		extractDoubleArguments(WRONG_NUMBER_FORMAT);
	}

}
