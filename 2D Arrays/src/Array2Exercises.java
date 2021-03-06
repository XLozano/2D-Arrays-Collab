public class Array2Exercises {

	// return the total of all the values in the array.
	public static int getTotal(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
		}
		return sum;
	}

	// 136
	// return the average of all the values in the array. Same as Total but
	// counter
	public static double getAverage(int[][] a) {
		int sum = 0;
		double average;
		double counter = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
				counter++;
			}
		}
		average = sum / counter;
		return average;
	}

	// return the total of the values in the specified row.
	public static int getRowTotal(int[][] a, int row) {
		int sum = 0;

		for (int i = 0; i < a[row].length; i++) {

			sum += a[row][i];

		}
		return sum;
	}

	// return the total of the values in the specified column.
	public static int getColumnTotal(int[][] a, int column) {
		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum += a[i][column];

		}

		return sum;
	}

	// return the highest value in the specified row of the array.
	public static int getHighestInRow(int[][] a, int row) {
		int num = 0;

		num = a[row][0];

		for (int i = 1; i < a[row].length; i++) {

			if (num < a[row][i]) {

				num = a[row][i];

			} else {
			}

		}

		return num;
	}

	// return the lowest value in the specified row of the array.
	public static int getLowestInRow(int[][] a, int row) {
		int num = 0;

		num = a[row][0];

		for (int i = 1; i < a[row].length; i++) {

			if (num > a[row][i]) {

				num = a[row][i];

			} else {
			}

		}

		return num;
	}

	// return the lowest value in the specified column of the array
	public static int getHighestInColumn(int[][] a, int column) {
		int num = 0;

		num = a[0][column];

		for (int i = 1; i < a.length; i++) {

			if (num < a[i][column]) {

				num = a[i][column];

			} else {
			}

		}

		return num;
	}

	// return the highest value in the specified column of the array
	public static int getLowestInColumn(int[][] a, int column) {
		int num = 0;

		num = a[0][column];

		for (int i = 1; i < a.length; i++) {

			if (num > a[i][column]) {

				num = a[i][column];

			} else {
			}

		}

		return num;
	}

	// return the diagonal sum, bottom left to top right
	public static int getBottomLeftToTopRightDiagonalSum(int[][] a) {
		int sum = 0;
		int column = 0;

		for (int i = (a.length - 1); i >= 0; i--) {

			sum += a[i][column];

			column++;

		}
		return sum;

	}

	// return the diagonal sum, top left to bottom right
	public static int getTopLeftToBottomRightDiagonalSum(int[][] a) {
		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum += a[i][i];

		}
		return sum;
	}

	// return true if the array is sorted low to high
	public static boolean isArraySorted(int[][] a) {

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[0].length; j++) {

				if (j < 3) {
					if (a[i][j] > (a[i][j + 1])) {

						return false;

					}
				} else if (i < 3 && j == 3) {

					if (a[i][j] > a[i + 1][0]) {

						return false;

					}

				}

			}

		}

		return true;

	}

	// return true if array is sorted high to low
	public static boolean isArrayReversed(int[][] a) {
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[0].length; j++) {

				if (j < 3) {
					if (a[i][j] < (a[i][j + 1])) {

						return false;

					}
				} else if (i < 3 && j == 3) {

					if (a[i][j] < a[i + 1][0]) {

						return false;

					}

				}

			}

		}

		return true;

	}

	// return true if array is jagged
	public static boolean isJaggedArray(int[][] a) {

		for (int i = 1; i < a.length; i++) {

			if (a[i].length != a[0].length) {

				return true;

			}

		}

		return false;

	}

	// return true if array is square (n x n)
	public static boolean isSquareArray(int[][] a) {
		int rows = a.length;
		for (int i = 1; i < a.length; i++) {

			if (a[i].length != a[0].length) {

				return false;

			}

		}

		if (rows == a[0].length) {

			return true;

		} else {

			return false;

		}
	}

	// return true if array is rectangular (n x m)
	public static boolean isRectangularArray(int[][] a) {
		for (int i = 1; i < a.length; i++) {

			if (a[i].length != a[0].length) {

				return false;

			}

		}

		return true;
	}

}
