public class Sort{
	public static final String TAG = "Sort";
	public static int[] croissantSort(int[] tab) throws Exception {
		if(tab == null){
			throw new Exception(TAG);
		}
		int[] sortedTab = new int[tab.length];
		int min;
		for(int i = 0; i < tab.length; i++){
			min = Integer.MAX_VALUE;
			for (int j = 0; j < tab.length; j++){
				if(i == 0 && tab[j] <= min){
					min = tab[j];
				}
				else if(i != 0 && tab[j] > sortedTab[i - 1] && tab[j] < min){
					min = tab[j];

				} 
			}
			sortedTab[i] = min;
			System.out.println(min);
		}
		
		return sortedTab;
	}
}
