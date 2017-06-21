package com.epam.ta.fundamentals.task1.home3;

import com.epam.ta.fundamentals.task1.exception.PerformerException;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask3Runner {
	
	private static final String USAGE = "\nUsage: \nArguments:  <digit_number_more_than_zero> <digit_number_more_than_zero>";
	
	public static void main(String[] args) {

		Hometask3Performer performer = new Hometask3Performer(args);
		try {
			performer.initArgsForCalculation();
			performer.performTask();
		} catch (PerformerException e) {
			PrinterWorker.printErrorString(e.getClass() + ":\n" + e.getMessage() + USAGE);
		}
	}
}
