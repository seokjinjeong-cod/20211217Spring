package com.yedam.app;

public class SamsungTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("SamsungTV powerOn");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV powerDown");
	}
	@Override
	public void volumeUp() {
		System.out.println("SamsungTV volumeUp");
	}
	@Override
	public void volumeDown() {
		System.out.println("SamsungTV volumeDown");
	}	
}
