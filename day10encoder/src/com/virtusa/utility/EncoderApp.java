package com.virtusa.utility;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncoderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String encoded=new BCryptPasswordEncoder().encode("123root");
		System.out.println(encoded);
	

	}

}
