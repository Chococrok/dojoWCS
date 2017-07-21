public class Rectangle extends Shape{

	private int height;
	private int width;

	public Rectangle(int x, int y, int height, int width){
		super(x, y);
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return this.height;
	}

	public int getWidth(){
		return this.width;
	}
	
	@Override
	public double getPerimeter(){
		return (this.height * 2) + (this.width * 2);
	}
	
	@Override
	public double getArea(){
		return this.height * this.width;
	}

	@Override
	public void draw(Canvas c, boolean filled){

		
		if (filled){

			for (int i = this.y + this.height; i > this.y; i-- ){
				//definition Rectangle
					for (int j = this.x; j < this.x + this.width; j++){
					
							c.drawPixel(i, j, '#');
					}								
			}
		}
		
		else{
		
			for (int i = this.y + this.height; i > this.y; i-- ){
					for (int j = this.x; j < this.x + this.width; j++){
						if( (j == this.x || j == this.x + this.width - 1) 
						|| (i == this.y + 1 || i == this.y + this.height) )
					
							c.drawPixel(i, j, '#');
					}				
			}
	
		}
	
	}

}
