package com.bigshoulders.compare;

public class Shooter implements Comparable {
	private String name;
	private int score;
	public Shooter(String name, int score){
		this.name = name;
		this.score = score;
	}
	public String getName(){
		return name;
	}
	public int getScore(){
		return score;
	}
	public int compareTo(Object object){
		//Cast passed object as a shooter?
		Shooter otherShooter = (Shooter) object;
		if(this.score < otherShooter.score){
			return -1;
		}else if (this.score == otherShooter.score){
			return 0;
		}else // (this.score > otherShooter.score)
			return 1;
		}
	}
	


