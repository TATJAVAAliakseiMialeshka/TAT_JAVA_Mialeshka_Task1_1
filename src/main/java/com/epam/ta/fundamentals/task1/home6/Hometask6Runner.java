package com.epam.ta.fundamentals.task1.home6;

import com.epam.ta.fundamentals.task1.exception.PerformerException;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask6Runner {

	private static final String USAGE = " \nProgram usage:\nRun with: <num> <num> <num>";
	
	public static void main(String[] args) {

		Hometask6Performer performer = new Hometask6Performer(args);
		try {
			performer.initArgsForCalculation();
			performer.performTask();
		} catch (PerformerException e) {
			PrinterWorker.printErrorString(e.getClass() + ":\n" + e.getMessage() + USAGE);
		}
	}
}
