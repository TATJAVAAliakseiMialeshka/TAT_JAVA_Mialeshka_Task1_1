package com.epam.ta.fundamentals.task1.util;

import com.epam.ta.fundamentals.task1.exception.ArgsValidationException;

public class DoubleValidator {

	private static final String NUMBER_IS_NAN = "Reseived NaN number.";
	private static final String NUMBER_IS_INFINITY = "Reseived Infinity number.";

	public static void checkDoubleValue(double value) throws ArgsValidationException {
		if (value > 0) {
			if (value < Double.MIN_VALUE || value > Double.MAX_VALUE) {
				throw new ArgsValidationException(NUMBER_IS_INFINITY);
			}

		} else {
			if (value == Double.NEGATIVE_INFINITY) {
				throw new ArgsValidationException(NUMBER_IS_INFINITY);
			}
		}
		if (Double.isNaN(value)) {
			throw new ArgsValidationException(NUMBER_IS_NAN);
		}
	}

	public static void checkDoubleArray(double[] value) throws ArgsValidationException {
		if (value != null) {
			for (int i = 0; i < value.length; i++) {
				if (value[i] > 0) {
					if (value[i] < Double.MIN_VALUE || value[i] > Double.MAX_VALUE) {
						throw new ArgsValidationException(NUMBER_IS_INFINITY);
					}

				} else {
					if (value[i] == Double.NEGATIVE_INFINITY) {
						throw new ArgsValidationException(NUMBER_IS_INFINITY);
					}
				}
				if (Double.isNaN(value[i])) {
					throw new ArgsValidationException(NUMBER_IS_NAN);
				}
			}
		}
	}

}
