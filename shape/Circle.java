import java.lang.*;

public class Circle extends Shape{

	private int radius;

	public Circle(int x, int y, int radius){
		super(x,y);
		this.radius = radius;
	}

	public int getRadius(){
		return this.radius;
	}
	
	@Override
	public double getPerimeter(){
		return 2*Math.PI*this.radius;
	}

	@Override
	public double getArea(){
		return Math.PI*this.radius*this.radius;
	}

	@Override	
	public void draw(Canvas c, boolean filled){
		
		if(filled){
			for (int i = this.y + this.radius*2; i > this.y; i--){		
					for (int j = this.x; j < this.x + this.radius * 2; j++){
						if(norme(i, j) <= this.radius){
							c.drawPixel(i,j,'#');
						}
					}
			}	
		}
	}
	
	private double norme(int i, int j){
		return Math.sqrt( Math.pow(j - (this.radius + this.x), 2) + Math.pow( i - (this.radius + this.y), 2 ) );
	}
}
