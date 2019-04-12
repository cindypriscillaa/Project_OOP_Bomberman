package game;

import java.util.Random;

public class Monster{
	private int coorX;
	private int coorY;
	private int locX;
	private int locY;
	private int health;
	
	public int getCoorX() {
		return coorX;
	}
	public void setCoorX(int coorX) {
		this.coorX = coorX;
	}
	public int getCoorY() {
		return coorY;
	}
	public void setCoorY(int coorY) {
		this.coorY = coorY;
	}
	public int getLocX() {
		return locX;
	}
	public void setLocX(int locX) {
		this.locX = locX;
	}
	public int getLocY() {
		return locY;
	}
	public void setLocY(int locY) {
		this.locY = locY;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	void move() {
		switch(new Random().nextInt(4)){
			case 0:
				coorX-=2;
				break;
			case 1:
				coorY-=2;
				break;
			case 2:
				coorX+=2;
				break;
			case 3:
				coorY+=2;
				break;
		}
		
	}
	
}
