public class Canvas{
	
	private int height;
	private int width;
	private char[][] buffer;

	public Canvas(int height, int width){
		this.height = height;
		this.width = width;
		this.buffer = new char[height][width];
	}
	
	public void drawPixel(int x, int y, char pixel){
		if (x <= width && y <= height){
			buffer [x][y] = pixel;
		}
	}
	
	public char getPixel(int x, int y){
		return buffer[x][y];
	}
	
	public void dump(){
		for(int i = this.height -1 ; i >= 0; i--){
			for(int j = 0; j < this.width; j++){
				if(getPixel(i, j) == 0){
					System.out.print('.');
				}
				else{
					System.out.print(getPixel(i, j));
				}
			}
			System.out.println("");
		}
	}
}
