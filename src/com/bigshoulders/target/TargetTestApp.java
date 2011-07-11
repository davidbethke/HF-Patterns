package com.bigshoulders.target;

public class TargetTestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Target target1 = new BaseTarget1();
		target1.getDescription();
		Target target1Rings = new ScoreRings(target1);
		target1Rings.getDescription();
		Target target1RingsBullet = new BulletHoles(target1Rings);
		target1RingsBullet.getDescription();
		Target target2 = new BaseTarget2();
		Target target2Rings = new ScoreRings(target2);
		target2Rings.getDescription();
			//location
			Location location = new Location();
			location.setLocation("Austin");
			//extra set location line
			LocationDecorator.setLocation(location);
			//standard decorating
			Target target2RingsLocation = new LocationDecorator(target2Rings);
			System.out.println(target2RingsLocation.getDescription());
		//try an inner class
		Location locationHouston = new Location();
		locationHouston.setLocation("Houston");
		Target target1Houston =  locationHouston.new LocationDecorator2(target1);
		target1Houston.getDescription();
		//

	}

}
