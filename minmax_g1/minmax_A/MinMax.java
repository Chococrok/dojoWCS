public class MinMax{
	private static int min;
	private static int max;

	public static Pair minMax(int[] tab){
		if (tab.length != 0) {
			min = tab[0];
			max = tab[0];
			for (int i = 0; i < tab.length; i++){
				if ( tab[i] >= max){
					max = tab[i];				
				}
				else {
					min = tab[i];
				}
			}
		}
		else{
			min = 0;
			max = 0;		
		}
		return new Pair(min, max);
	}
}
