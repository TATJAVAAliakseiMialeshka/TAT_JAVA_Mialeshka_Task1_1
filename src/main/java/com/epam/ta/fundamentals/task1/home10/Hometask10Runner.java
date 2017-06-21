package com.epam.ta.fundamentals.task1.home10;

import com.epam.ta.fundamentals.task1.exception.PerformerException;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask10Runner {

	private static final String USAGE = " \nProgram usage:\nRun with: <int_matrix_size>";

	public static void main(String[] args) {

		Hometask10Performer performer = new Hometask10Performer(args);
		try {
			performer.initArgsForCalculation();
			performer.performTask();
		} catch (PerformerException e) {
			PrinterWorker.printErrorString(e.getClass() + ":\n" + e.getMessage() + USAGE);
		}
	}

}
