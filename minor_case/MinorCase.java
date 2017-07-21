public class MinorCase{

	public static int minorNumber(int[] tab){
		int minorNumber = 0;
		for(int i = 0; i < tab.length; i++){
			if (tab[i] < 18){
				minorNumber ++;
			}
		}
		return minorNumber;
	}
	
}
