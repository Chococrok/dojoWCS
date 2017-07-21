public class Minmax {
	private int[] tab;
	
	public Minmax(int[] tab) {
		this.tab = tab;
	}
	
	public Minmax minmax(){
		int[] minMaxTab = {tab[0], tab[0]};
		for(int i = 0; i < tab.length; i++){
			if(tab[i] < tab[0]){
				minMaxTab[0] = tab[i];
			}
			else{
				minMaxTab[1] = tab[i];
			}
		}
		return new Minmax(minMaxTab);
	}
	
	public int[] getTab(){
		return tab;
	}
	
	@Override
	public boolean equals(Object obj){
		Minmax minmaxObj = (Minmax) obj;
		if(minmaxObj.getTab()[0] == this.tab[0] && minmaxObj.getTab()[0] == this.tab[0]){
			return true;
		}
		return false;
	}
}
