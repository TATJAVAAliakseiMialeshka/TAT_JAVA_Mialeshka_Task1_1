package com.epam.ta.fundamentals.task1.home2;

import com.epam.ta.fundamentals.task1.exception.PerformerException;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask2Runner {

	public static final String USAGE = "\nUsage: \nArguments: <not_zero_number> <number> <number>";

	public static void main(String args[]) {

		Hometask2Performer performer = new Hometask2Performer(args);
		try {
			performer.initArgsForCalculation();
			performer.performTask();
		} catch (PerformerException e) {
			PrinterWorker.printErrorString(e.getClass() + ":\n" + e.getMessage() + USAGE);
		}
	}
}
