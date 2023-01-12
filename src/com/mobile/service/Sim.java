package com.mobile.service;

public interface Sim {
	public String sendSMS(String msg, long mobileNumber);

	public String dialCall(long mobileNumber);
}