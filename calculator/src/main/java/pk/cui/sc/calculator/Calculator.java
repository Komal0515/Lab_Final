package pk.cui.sc.calculator;

public class Calculator {

	/**
	 * @author Komal
	 * This method is used to find the maximum value
	 * @param num1 first integer value
	 * @param num2 second integer value
	 * @param num3 third integer value
	 * @return maximum value
	 */
	
	public int findMax(int num1, int num2, int num3) {
		int[] arr = { num1, num2, num3 };
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
		if (arr[i] > max)
		max = arr[i];
		}
		return max;
		}
	/**
	 * This method is used to calculate square of positive integer value 
	 * whose value is less than 10
	 * @param num integer value
	 * @return square value
	 * @throws IllegalArgumentException when the input integer is not 
     * between <code>0</code> and <code>10</code>
     */
	
	public int square(int num) throws IllegalArgumentException {
		int result = 0;
		if (num > 0 && num < 10) {
		result = num * num;
		} else
		throw new IllegalArgumentException();
		return result;
		}
	/**
	 * This method is used to calculate cube of integer value
	 * @param num integer value
	 * @return cube value
	 */
	public int cube(int num){
		return num*num*num;
	}
}
