public class Monster{

	private String name;
	private int life;
	private int power;
	private int speed;
	private int mId;
	private static int id;	

	public Monster(String name, int life, int power, int speed){
		id++;
		this.life = life;
		this.name = name;
		this.power = power;
		this.speed = speed;
		this.mId = id;
		
	}

	public String getName(){
		return this.name;	
	}
	public int getLife(){
		return this.life;	
	}
	public int getPower(){
		return this.power;	
	}
	public int getSpeed(){
		return this.speed;	
	}
	public int getId(){
		return this.mId;	
	}


}
