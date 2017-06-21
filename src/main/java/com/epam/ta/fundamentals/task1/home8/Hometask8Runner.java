package com.epam.ta.fundamentals.task1.home8;

import com.epam.ta.fundamentals.task1.exception.PerformerException;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask8Runner {

	private static final String USAGE = " \nProgram usage:\nRun with: <array_int_num_1> ...<array_int_num_n> <division_int_num>";
	
	public static void main(String[] args) {

		Hometask8Performer performer = new Hometask8Performer(args);
		try {
			performer.initArgsForCalculation();
			performer.performTask();
		} catch (PerformerException e) {
			PrinterWorker.printErrorString(e.getClass() + ":\n" + e.getMessage() + USAGE);
		}
	}
}
