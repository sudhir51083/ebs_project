package com.capgemini.ebs.utils;

import java.util.Base64;

public class PasswordUtils {
	public static String getEncryptedPassword(String password) {
		String encodedString = Base64.getEncoder().encodeToString(password.getBytes());
		return encodedString;
	}
	public static String getDecryptedPassword(String password) {
		byte[] decodedBytes = Base64.getDecoder().decode(password);
		String decodedString = new String(decodedBytes);
		return decodedString;
	}
}
