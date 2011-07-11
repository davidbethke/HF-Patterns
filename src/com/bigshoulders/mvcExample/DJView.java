package com.bigshoulders.mvcExample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DJView implements BeatObserver, BPMObserver, ActionListener {
	BeatModelInterface model;
	ControllerInterface controller;
	JFrame viewFrame;
	JPanel viewPanel;
	JLabel bpmOutputLabel;
	
	public DJView(BeatModelInterface model, ControllerInterface controller){
		this.model = model;
		this.controller = controller;
		model.registerObserver((BeatObserver)this);
		model.registerObserver((BPMObserver)this);
		
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void updateBeat() {
		// TODO Auto-generated method stub

	}
	public void updateBPM() {
		// TODO Auto-generated method stub

	}

}
