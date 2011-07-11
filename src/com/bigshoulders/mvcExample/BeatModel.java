package com.bigshoulders.mvcExample;

import java.util.ArrayList;

public class BeatModel implements BeatModelInterface {
	private ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
	private ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
	private int bpm = 90;

	public void on() {
		// TODO Auto-generated method stub
		setBPM(90);
		System.out.println("I turned on, BPM:"+ bpm);
	}

	public void off() {
		// TODO Auto-generated method stub

		System.out.println("I turned off");
	}

	public void setBPM(int bpm) {
		// TODO Auto-generated method stub
		this.bpm = bpm;
		notifyBPMObservers();

	}

	public int getBPM() {
		// TODO Auto-generated method stub
		return bpm;
	}

	public void registerObserver(BeatObserver o) {
		// TODO Auto-generated method stub
		beatObservers.add(o);

	}

	public void removeObserver(BeatObserver o) {
		// TODO Auto-generated method stub
		beatObservers.remove(o);

	}

	public void registerObserver(BPMObserver o) {
		// TODO Auto-generated method stub
		bpmObservers.add(o);

	}

	public void removeObserver(BPMObserver o) {
		// TODO Auto-generated method stub
		bpmObservers.remove(o);

	}
	
	public void beatEvent(){
		notifyBeatObservers();
	}
	
	public void notifyBeatObservers(){
		for(BeatObserver beat : beatObservers){
			beat.updateBeat();
		}
	}
	
	public void notifyBPMObservers(){
		for(BPMObserver bpm : bpmObservers){
			bpm.updateBPM();
		}
	}

}
