package com.epam.ta.fundamentals.task1.validator;

import com.epam.ta.fundamentals.task1.exception.ArgsValidationException;

public abstract class AbstractArgsValidator {

	private static final String NUMBER_IS_NAN = "Reseived NaN number.";
	private static final String NUMBER_IS_INFINITY = "Reseived Infinity number.";

	private String[] argsString;

	private double[] doubleArgsArr;

	private int[] intArgsArr;

	private long[] longArgsArr;

	public AbstractArgsValidator(String[] argsString) {
		super();
		this.argsString = argsString;
	}

	public void setArgsString(String argsString[]) {
		if (argsString != null) {
			setArgsString(argsString);
		}
	}

	public String[] getArgsString() {
		return argsString;
	}

	public String getArgsString(int ind) {
		return argsString[ind];
	}

	public double[] getDoubleArgsArr() {
		return doubleArgsArr;
	}

	public double getDoubleArgsArr(int ind) {
		return doubleArgsArr[ind];
	}

	public void setDoubleArgsArr(double[] doubleArgsArr) {
		if (doubleArgsArr != null) {
			this.doubleArgsArr = doubleArgsArr;
		}
	}

	public int[] getIntArgsArr() {
		return intArgsArr;
	}

	public int getIntArgsArr(int ind) {
		return intArgsArr[ind];
	}

	public void setIntArgsArr(int[] intArgsArr) {
		if (intArgsArr != null) {
			this.intArgsArr = intArgsArr;
		}
	}

	public long[] getLongArgsArr() {
		return longArgsArr;
	}

	public void setLongArgsArr(long[] longArgsArr) {
		if (longArgsArr != null) {
			this.longArgsArr = longArgsArr;
		}
	}

	public abstract void checkArguments() throws ArgsValidationException;

	public void validateAmountOfArgsEqualTo(int amount, String errorMessage) throws ArgsValidationException {
		if (argsString.length != amount) {
			throw new ArgsValidationException(errorMessage);
		}
	}

	public void validateAmountOfArgsLessThan(int amount, String errorMessage) throws ArgsValidationException {
		if (argsString.length < amount) {
			throw new ArgsValidationException(errorMessage);
		}
	}

	public void extractIntArguments(String errMessage) throws ArgsValidationException {
		int[] argsArr = new int[argsString.length];
		try {
			for (int i = 0; i < argsString.length; i++) {
				argsArr[i] = Integer.parseInt(argsString[i]);
			}
			intArgsArr = argsArr;
		} catch (NumberFormatException e) {
			throw new ArgsValidationException(errMessage, e);
		}
	}

	public void extractLongArguments(String errMessage) throws ArgsValidationException {
		long[] argsArr = new long[argsString.length];
		try {
			for (int i = 0; i < argsString.length; i++) {
				argsArr[i] = Long.parseLong(argsString[i]);
			}
			setLongArgsArr(argsArr);
		} catch (NumberFormatException e) {
			throw new ArgsValidationException(errMessage, e);
		}

	}

	public void extractDoubleArguments(String errMessage) throws ArgsValidationException {
		double[] argsArr = new double[argsString.length];
		try {
			for (int i = 0; i < argsString.length; i++) {
				argsArr[i] = Double.parseDouble(argsString[i]);
				if (argsArr[i] == Double.NaN) {
					throw new ArgsValidationException(NUMBER_IS_NAN);
				}
				if (argsArr[i] == Double.NEGATIVE_INFINITY) {
					throw new ArgsValidationException(NUMBER_IS_INFINITY);
				}
				if (argsArr[i] > 0) {
					if (argsArr[i] < Double.MIN_VALUE || argsArr[i] > Double.MAX_VALUE) {
						throw new ArgsValidationException(NUMBER_IS_INFINITY);
					}
				}
			}
			setDoubleArgsArr(argsArr);
		} catch (NumberFormatException e) {
			throw new ArgsValidationException(errMessage, e);
		}

	}

	public void validateDoubleArrIsPositive(String errMessage) throws ArgsValidationException {
		if (doubleArgsArr.length != 0) {
			for (int i = 0; i < doubleArgsArr.length; i++) {
				if (doubleArgsArr[i] <= 0) {
					throw new ArgsValidationException(errMessage);
				}
			}
		}
	}

	public void validateLongArrIsPositive(String errMessage) throws ArgsValidationException {
		if (longArgsArr.length != 0) {
			for (int i = 0; i < longArgsArr.length - 1; i++) {
				if (longArgsArr[i] < 0) {
					throw new ArgsValidationException(errMessage);
				}
			}
		}
	}

	public void extractPositiveDoubleArguments(String errMessage1, String errMessage2) throws ArgsValidationException {
		double[] argsArr = new double[argsString.length];
		try {
			for (int i = 0; i < argsString.length; i++) {
				argsArr[i] = Double.parseDouble(argsString[i]);
				if (argsArr[i] < 0) {
					throw new ArgsValidationException(errMessage1);
				}
			}
			setDoubleArgsArr(argsArr);
		} catch (NumberFormatException e) {
			throw new ArgsValidationException(errMessage2, e);
		}

	}

}
