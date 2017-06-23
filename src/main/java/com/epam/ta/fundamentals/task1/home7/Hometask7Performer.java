package com.epam.ta.fundamentals.task1.home7;

import java.util.TreeMap;
import java.util.Map.Entry;

import com.epam.ta.fundamentals.task1.exception.ArgsValidationException;
import com.epam.ta.fundamentals.task1.exception.PerformerException;
import com.epam.ta.fundamentals.task1.performer.AbstractPerformer;
import com.epam.ta.fundamentals.task1.util.DoubleValidator;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask7Performer extends AbstractPerformer {

	public Hometask7Performer(String argsString[]) {
		super(new Hometask7ArgsValidator(argsString));
	}

	@Override
	public void performTask() throws PerformerException {

		TreeMap<Double, Double> funcMap = null;

		double start = getValidator().getDoubleArgsArr(0);
		double end = getValidator().getDoubleArgsArr(1);
		double step = getValidator().getDoubleArgsArr(2);
		funcMap = createFunctionMap(start, end, step);
		printMap(funcMap);
	}

	public TreeMap<Double, Double> createFunctionMap(double start, double end, double step) throws PerformerException {
		try {
			DoubleValidator.checkDoubleValue(start);
			DoubleValidator.checkDoubleValue(end);
			DoubleValidator.checkDoubleValue(step);
		} catch (ArgsValidationException e) {
			throw new PerformerException(e.getClass() + "\n" + e.getMessage());
		}
		TreeMap<Double, Double> funcMap = new TreeMap<>();
		if (start < end) {
			for (double i = start; i <= end; i += step) {
				double funcValue = (Math.pow(Math.sin(i), 2)) - Math.cos(i * 2);
				funcMap.put(i, funcValue);
			}
		} else {
			for (double i = start - 1; i >= end; i -= step) {
				double funcValue = (Math.pow(Math.sin(i), 2)) - Math.cos(i * 2);
				funcMap.put(i, funcValue);
			}
		}

		return funcMap;
	}

	public void printMap(TreeMap<Double, Double> map) {
		if (null != map && map.size() > 0) {
			PrinterWorker.printString("**********************************************\n");
			for (Entry<Double, Double> entry : map.entrySet()) {
				PrinterWorker.printFormatString("**  %10f" + "   **   % .16f" + "   **\n", entry.getKey(),
						entry.getValue());
			}
			PrinterWorker.printString("**********************************************");
		}
	}

}
