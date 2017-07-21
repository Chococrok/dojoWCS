public class RomanToArab{

	public static int convert(String str) {
		int sum = 0;
		int value = 0;
		
		for (int i = 0; i < str.length() -1; i++){
			
			value = charToInt(str.charAt(i));		
			
			if (charToInt(str.charAt(i)) < charToInt(str.charAt(i + 1))){
				value = - value;
			}
			
			sum = sum + value;

		}
		sum = sum + charToInt(str.charAt(str.length() -1));
		return sum;
	}
	
	private static int charToInt(char ch){
		int value = 0;
		switch (ch){
		case 'I':
			value = 1;
			break;
		case 'V':
			value = 5;
			break;
		case 'X':
			value = 10;
			break;
		case 'L':
			value = 50;
			break;
		case 'C':
			value = 100;
			break;
		case 'D':
			value = 500;
			break;
		case 'M':
			value = 1000;
			break;
		}
		return value;
		
	}
	
}
