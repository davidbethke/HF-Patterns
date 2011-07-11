package com.bigshoulders.mvcExample;

public class BeatController implements ControllerInterface {
	BeatModelInterface model;
	//DJView view;
	
	public BeatController(BeatModelInterface model){
		this.model = model;
		
	}

	public void start() {
		// TODO Auto-generated method stub
		//do something to the model
		model.on();
		//do something to the view

	}

	public void stop() {
		// TODO Auto-generated method stub
		//do something to the model
		model.off();
		//do something to the view

	}

	public void increaseBPM() {
		// TODO Auto-generated method stub
		//do something to the model
		int bpm = model.getBPM();
		model.setBPM(bpm+1);

	}

	public void decreaseBPM() {
		// TODO Auto-generated method stub
		//do someting to the model
		int bpm = model.getBPM();
		model.setBPM(bpm-1);

	}

	public void setBPM(int bpm) {
		// TODO Auto-generated method stub
		model.setBPM(bpm);

	}

}
