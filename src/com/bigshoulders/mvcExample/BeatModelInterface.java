package com.bigshoulders.mvcExample;

public interface BeatModelInterface {
	//interface to model
	public void on();
	public void off();
	public void setBPM(int bpm);
	public int getBPM();
	// Beat Observer- notified of every beat
	public void registerObserver(BeatObserver o);
	public void removeObserver(BeatObserver o);
	//BPM Observer if BPM change
	public void registerObserver(BPMObserver o);
	public void removeObserver(BPMObserver o);

}
