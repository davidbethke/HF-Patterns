package com.bigshoulders.dbEnum;

public class EnumApp {

	/**
	 * @param args
	 */
	enum Names {
		JERRY("guitar") {public String sings(){return "silently";}},
		BOBBY("drums") {public String sings() { return "hoarsely";}},
		RICKY("bass"),
		BEN("Keyboard");
		private String instrument;
		Names(String instrument){
			this.instrument = instrument;
		}
		public String sings(){
			return "sometimes";
		}
		public String getInstrument(){
			return this.instrument;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Names n : Names.values()){
			System.out.print(n);
			System.out.print( " instrument: "+ n.getInstrument());
			System.out.print(", sings: " + n.sings());
			System.out.print("\n");
		}

	}

}
