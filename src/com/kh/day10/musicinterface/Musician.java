package com.kh.day10.musicinterface;

public class Musician {
	//Instrument ins = new Piano(); ( O / X ) -> O
	/*
	public void playInstrument(Piano piano) {
		piano.play();
	}
	public void playInstrument(Guitar guitar) {  //�����ε�
		guitar.play();
	}
	public void playInstrument(Drum drum) {
		drum.play();
	}*/
	public void playInstrument(Instrument instrument) {
		instrument.play();
	}
}
