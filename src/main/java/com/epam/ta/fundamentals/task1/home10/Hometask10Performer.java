package com.epam.ta.fundamentals.task1.home10;

import com.epam.ta.fundamentals.task1.performer.AbstractPerformer;
import com.epam.ta.fundamentals.task1.util.PrinterWorker;

public class Hometask10Performer extends AbstractPerformer {

	private static final String EXPLANATION = "Calculation matrix with size: ";

	public Hometask10Performer(String argsString[]) {
		super(new Hometask10ArgsValidator(argsString));
	}

	@Override
	public void performTask() {

		int matrix_size = getValidator().getIntArgsArr(0);
		PrinterWorker.printString(EXPLANATION + matrix_size + "\n");
		int matrix[][] = generateMatrix(matrix_size);
		printMatrix(matrix);

	}

	public int[][] generateMatrix(int matrix_size) {
		int matrix[][] = {};
		if (matrix_size > 0) {
			matrix = new int[matrix_size][matrix_size];

			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					if (i % 2 == 0) {
						matrix[i][j] = j + 1;
					} else {
						matrix[i][j] = matrix_size - j;
					}
				}
			}
		}
		return matrix;
	}

	public void printMatrix(int matrix[][]) {
		if (matrix != null) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					PrinterWorker.printFormatString("%3d ", matrix[i][j]);
				}
				PrinterWorker.printString("\n");
			}
		}
	}
}