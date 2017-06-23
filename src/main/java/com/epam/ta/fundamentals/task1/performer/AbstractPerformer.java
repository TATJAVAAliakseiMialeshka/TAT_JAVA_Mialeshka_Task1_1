package com.epam.ta.fundamentals.task1.performer;

import com.epam.ta.fundamentals.task1.exception.ArgsValidationException;
import com.epam.ta.fundamentals.task1.exception.PerformerException;
import com.epam.ta.fundamentals.task1.validator.AbstractArgsValidator;

public abstract class AbstractPerformer {

	private AbstractArgsValidator validator;

	private int[] numbersForCalculation;

	public AbstractPerformer(AbstractArgsValidator validator) {
		this.validator = validator;
	}

	public AbstractArgsValidator getValidator() {
		return validator;
	}

	public void checkAndExtractArguments() throws PerformerException {
		try {
			validator.checkArguments();
		} catch (ArgsValidationException e) {
			throw new PerformerException(e.getClass() + ":\n" + e.getMessage(), e);
		}
		numbersForCalculation = validator.getIntArgsArr();
	}

	public int[] getNumbersForCalculation() {
		return numbersForCalculation;
	}

	public void setNumbersForCalculation(int[] numbersForCalculation) {
		if (null != numbersForCalculation) {
			this.numbersForCalculation = numbersForCalculation;
		}
	}

	public abstract void performTask() throws PerformerException;

	public void initArgsForCalculation() throws PerformerException {
		try {
			getValidator().checkArguments();
		} catch (ArgsValidationException e) {
			throw new PerformerException(e.getClass() + ":\n" + e.getMessage(), e);
		}
	}

}
