package com.epam.ta.fundamentals.task1.home9;

import com.epam.ta.fundamentals.task1.exception.PerformerException;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask9Runner {

	private static final String USAGE = "\nProgram usage:\nRun with: <array1_int_num_1> ...<array1_int_num_n> <.> <array2_int_num_1> ...<array2_int_num_n> <int_num>";

	public static void main(String[] args) {

		Hometask9Performer performer = new Hometask9Performer(args);
		try {
			performer.initArgsForCalculation();
			performer.performTask();
		} catch (PerformerException e) {
			PrinterWorker.printErrorString(e.getClass() + ":\n" + e.getMessage() + USAGE);
		}

	}
}
