package com.mobile.reception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.mobile.service.Mobile;

public class MobileUser {
	public static void main(String[] args) throws Exception {
		Mobile iPhone = new Mobile();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Insert Sim: ");
		String simName = br.readLine();
		iPhone.insertSim(simName);

		System.out.println();

		System.out.println("Type 1 and press <enter> key to send SMS");
		System.out.println("Type 2 and press <enter> key to make call\n");
		System.out.println("Enter option:");
		String option = br.readLine();

		String resp;
		if (option.contains("1")) {
			System.out.println("Type message and press <enter> key:");
			String msg = br.readLine();
			System.out.println("Type mobile number and press <enter> key:");
			String mobileNumber = br.readLine();
			resp = iPhone.sendSMS(msg, Long.parseLong(mobileNumber));
			System.out.println(resp);
		} else if (option.contains("2")) {
			System.out.println("Type mobile number nad press <enter> key:");
			String mobileNumber = br.readLine();
			resp = iPhone.dialCall(Long.parseLong(mobileNumber));
			System.out.println(resp);
		} else {
			System.out.println("Invalid Option");
		}
	}
}