package findRepeatingNumberInArray;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] numbers = { 3, 7, 3, 3, 2, 9, 10, 21, 1, 2, 10, 4, 33, 9, 1 };
		int[] dublicate = new int[numbers.length];
		int startIndex = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				for (int k = 0; k < numbers.length; k++) {
					if ((i != k) && (numbers[i] == numbers[k])) {
						if (isFind(dublicate, numbers[i])) {
							dublicate[startIndex++] = numbers[i];
							break;
						}
					}
				}

			}
		}

		for(int number : dublicate) {
			if(number!=0) {
				System.out.println(number);
			}
		}
	}

	static boolean isFind(int[] arr, int value) {
		for (int number : arr) {
			if (number == value) {
				return false;
			}
		}
		return true;
	}

}
