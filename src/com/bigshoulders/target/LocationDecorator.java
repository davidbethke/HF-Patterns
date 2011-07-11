package com.bigshoulders.target;

public class LocationDecorator extends TargetDecorator {
	private static Location myLocation;
	public LocationDecorator(Target target ){
		this.myTarget = target;
		
	}
	@Override
	public String getDescription() {
		return myLocation.getLocation();
	}
	public static void setLocation(Location location){
		myLocation = location;
	}

}
