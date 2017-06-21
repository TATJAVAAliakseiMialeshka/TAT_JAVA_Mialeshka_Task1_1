package com.epam.ta.fundamentals.task1.home4;

import com.epam.ta.fundamentals.task1.exception.PerformerException;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask4Runner {

	private static final String USAGE = " \nProgram usage:\nRun with: <x_coord> <y_coord>";
	
	public static void main(String[] args) {

		Hometask4Performer performer = new Hometask4Performer(args);
		try {
			performer.initArgsForCalculation();
			performer.performTask();
		} catch (PerformerException e) {
			PrinterWorker.printErrorString(e.getClass() + ":\n" + e.getMessage() + USAGE);
		}
	}
}
