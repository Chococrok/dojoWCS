/*une class abstraite ne pourra pas être instancié. 
D'autre part, si la class possède au moins une méthode abstraite cette classe devra être abstraite.
L'inverse n'est pas vrai.*/

public abstract class Shape {

	protected int x;
	protected int y;

	public Shape(int x, int y){

		this.x = x;
		this.y = y;
	}

	public int getX(){
		return this.x;
	}

	public int getY(){
		return this.y;
	}
	
	public abstract void draw(Canvas c, boolean bol);
	public abstract double getPerimeter();
	public abstract double getArea();
	
}
