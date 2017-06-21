package com.epam.ta.fundamentals.task1.home8;

import com.epam.ta.fundamentals.task1.exception.ArgsValidationException;
import com.epam.ta.fundamentals.task1.validator.AbstractArgsValidator;

public class Hometask8ArgsValidator extends AbstractArgsValidator {

	private static final String WRONG_ARGS_AMOUNT = "Wrong amount of arguments.";
	private static final String WRONG_NUMBER_FORMAT = "Argument should be an integer number.";
	private static final String NUMBER_SOULD_BE_POSITIVE = "Array numbers sould be positive.";
	private static int ARGS_AMOUNT = 2;

	public Hometask8ArgsValidator(String[] argsString) {
		super(argsString);
	}

	@Override
	public void checkArguments() throws ArgsValidationException {
		validateAmountOfArgsLessThan(ARGS_AMOUNT, WRONG_ARGS_AMOUNT);
		extractLongArguments(WRONG_NUMBER_FORMAT);
		validateLongArrIsPositive(NUMBER_SOULD_BE_POSITIVE);
	}

}
