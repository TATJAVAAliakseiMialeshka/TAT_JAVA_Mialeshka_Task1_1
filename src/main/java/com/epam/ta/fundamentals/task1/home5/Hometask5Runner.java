package com.epam.ta.fundamentals.task1.home5;

import com.epam.ta.fundamentals.task1.exception.PerformerException;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask5Runner {

	private static final String USAGE = " \nProgram usage:\nRun with: <number> <number> <number>";
	
	public static void main(String[] args) {
		Hometask5Performer performer = new Hometask5Performer(args);
		try {
			performer.initArgsForCalculation();
			performer.performTask();
		} catch (PerformerException e) {
			PrinterWorker.printErrorString(e.getClass() + ":\n" + e.getMessage() + USAGE);
		}
	}
}
