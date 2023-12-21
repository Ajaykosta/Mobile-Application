package com.mobile.service;

public class Mobile {
	private Sim sim;

	public void insertSim(String simName) throws Exception {
		// reflection API
		Class simClass = Class.forName(simName);
		Object simObject = simClass.newInstance();
		if (simObject instanceof Sim) {
			sim = (Sim) simObject;
		} else {
			throw new Exception("Invalid Sim");
		}
	}

	public String sendSMS(String msg, long mobileNumber) {
		return sim.sendSMS(msg, mobileNumber);
	}

	public String dialCall(long mobileNumber) {
		return sim.dialCall(mobileNumber);
	}
}
