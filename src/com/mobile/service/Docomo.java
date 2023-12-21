package com.mobile.service;

public class Docomo implements Sim {
	public String sendSMS(String msg, long mobileNumber) {
		return "Docomo : Your SMS Send Successfully";
	}

	public String dialCall(long mobileNumber) {
		return "Docomo: The number you are dialing is switched off, please dial afer some time";
	}
}