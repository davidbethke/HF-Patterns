package com.bigshoulders.target;

public class Location {
	
	private String location;
	
	public String getLocation(){
		return location;
	}
	public void setLocation(String l){
		location = l;
	}
	public class LocationDecorator2 extends TargetDecorator {
		public LocationDecorator2(Target target){
			myTarget = target;
		}
		public String getDescription(){
			myTarget.getDescription();
			System.out.println("My Location:"+ location);
			return location;
		}
		
	}

}
