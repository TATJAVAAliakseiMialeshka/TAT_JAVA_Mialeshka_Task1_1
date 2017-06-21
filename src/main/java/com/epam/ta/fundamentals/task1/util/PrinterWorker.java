package com.epam.ta.fundamentals.task1.util;

public class PrinterWorker {

	public static void printErrorString(String errorStr) {
		if (errorStr != null && !errorStr.isEmpty()) {
			System.out.println(errorStr);
		}
	}

	public static void printString(String resutlStr) {
		if (resutlStr != null && !resutlStr.isEmpty()) {
			System.out.print(resutlStr);
		}
	}

	public static void printString(boolean result) {
		System.out.println(result);
	}

	public static void printFormatString(String string, Object... arg1) {
		System.out.printf(string, arg1);
	}
}
