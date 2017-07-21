public class Ex {
	public static String fizzbuzz (int n){
		String fizzbuzz;
		
		if (n % 3 == 0 && n % 5 == 0){
			fizzbuzz = "fizzbuzz";
		}
		
		else if (n % 3 == 0){
			fizzbuzz = "fizz";
		}

		else if (n % 5 == 0){
			fizzbuzz = "buzz";
		}

		else{
			fizzbuzz = String.valueOf(n);
		}
		return fizzbuzz;
			
	}
}
