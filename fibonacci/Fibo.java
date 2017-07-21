public class Fibo{
	public static int fibonacciRecursive(int i){
		if (i == 0){
			return 0;
		}
		if (i == 1){
			return 1;
		}
		if (i >= 2){
			return fibonacciRecursive(i - 1) + fibonacciRecursive(i - 2);
		}
		return -1;
	}
	
	public static int fibonacciIncremental(int i){
		if (i == 0){
			return 0;
		}
		if (i == 1){
			return 1;
		}
		if (i >= 2){
			int firstElement = 0;
			int secondElement = 1;
			int sum = firstElement + secondElement;
			for (int j = 2; j <= i; j++){
			 	sum = firstElement + secondElement;
				firstElement = secondElement;
				secondElement = sum;
			}
			return sum;
		}
		return -1;
	}
}
