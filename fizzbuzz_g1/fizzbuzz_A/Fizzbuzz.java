public class Fizzbuzz{

	private static final String FIZZBUZZ = "fizzbuzz";
	private static final String FIZZ = "fizz";
	private static final String BUZZ = "buzz";
	private static final String ERROR = "error";

	public static String fizzbuzz(int n){
		if( n % 15 == 0) {
			return FIZZBUZZ;
		}
		
		if (n % 5 == 0) {
			return BUZZ;
		}
		
		if (n % 3 == 0) {
			return FIZZ;
		}
		return ERROR;
	}
}
