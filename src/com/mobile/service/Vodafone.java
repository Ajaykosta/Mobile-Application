package com.mobile.service;

public class Vodafone implements Sim {
	public String sendSMS(String msg, long mobileNumber) {
		return "Vodafone : Your SMS Send Successfully";
	}

	public String dialCall(long mobileNumber) {
		return "Vodafone: The number you are dialing is not reachable, please dial afer some time";
	}
}