package com.bigshoulders.target;

public abstract class BaseTarget extends Target {
    private int targetID;
	@Override
	public abstract String getDescription();
	public int getTargetID(){
		return targetID;
	}
	public void setTargetID(int ID){
		targetID= targetID;
	}

	
	

}
