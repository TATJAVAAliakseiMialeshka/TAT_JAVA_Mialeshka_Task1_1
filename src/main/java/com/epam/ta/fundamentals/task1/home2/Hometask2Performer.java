package com.epam.ta.fundamentals.task1.home2;

import com.epam.ta.fundamentals.task1.exception.PerformerException;
import com.epam.ta.fundamentals.task1.performer.AbstractPerformer;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask2Performer extends AbstractPerformer {

	private static final String EXPLANATION = "Calculate formula for numbers: ";
	private static final String DIVIDE_BY_ZERO = "Can't divide by zero: ";

	public Hometask2Performer(String[] argsString) {
		super(new Hometask2ArgsValidator(argsString));
	}

	public void performTask() throws PerformerException {

		double a = getValidator().getDoubleArgsArr()[0];
		double b = getValidator().getDoubleArgsArr()[1];
		double c = getValidator().getDoubleArgsArr()[2];

		PrinterWorker.printString(EXPLANATION + a + " " + b + " " + c + "\n");
		PrinterWorker.printString("Result: " + calcExpression(a, b, c));
	}

	public double calcExpression(double a, double b, double c) throws PerformerException {
		if(a==0){
			throw new PerformerException(DIVIDE_BY_ZERO);
		} 
		
			return ((b + (Math.sqrt(Math.pow(b, 2) + 4 * a * c))) / (2 * a) - (Math.pow(a, 3)) * c + Math.pow(b, -2));
		} 
	
	}

