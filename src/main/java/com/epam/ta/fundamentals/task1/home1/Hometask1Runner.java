package com.epam.ta.fundamentals.task1.home1;

import com.epam.ta.fundamentals.task1.exception.PerformerException;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask1Runner {

	private static final String USAGE = "\nUsage:\nArguments: <4_digit_number>";
	
	public static void main(String args[]) {

		Hometask1Performer performer = new Hometask1Performer(args);
		try {
			performer.initArgsForCalculation();
			performer.performTask();
		} catch (PerformerException e) {
			PrinterWorker.printErrorString(e.getClass() + ":\n" + e.getMessage() + USAGE);
		}
	}

}
