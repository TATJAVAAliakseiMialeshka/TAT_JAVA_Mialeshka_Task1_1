package com.epam.ta.fundamentals.task1.home7;

import com.epam.ta.fundamentals.task1.exception.PerformerException;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask7Runner {

	private static final String USAGE = " \nProgram usage:\nRun with: <start_num> <end_num> <step_num>";
	
	public static void main(String[] args) {

		Hometask7Performer performer = new Hometask7Performer(args);
		try {
			performer.initArgsForCalculation();
			performer.performTask();
		} catch (PerformerException e) {
			PrinterWorker.printErrorString(e.getClass() + ":\n" + e.getMessage() + USAGE);
		}
	}
}
