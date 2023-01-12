package com.mobile.service;

public class Airtel implements Sim {
	public String sendSMS(String msg, long mobileNumber) {
		return "Airtel : Your SMS Send Successfully";
	}

	public String dialCall(long mobileNumber) {
		return "Airtel: The number you are dialing is busy, please dial afer some time";
	}
}