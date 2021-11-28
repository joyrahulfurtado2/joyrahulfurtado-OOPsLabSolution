package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {

	public String generateEmailAddress(String firstName, String lastName, String departmentName) {
		return firstName+lastName+"@"+departmentName+".greatLearning.com";
	}
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialCharacters="~`!@#$%^&*()-_=+|:\'\",<.>/?";
		String characters=capitalLetters+smallLetters+numbers+specialCharacters;
		Random random=new Random();
		char[] password=new char[8];
		for(int i=0;i<8;i++) {
			password[i]=characters.charAt(random.nextInt(characters.length()));
		}
		return String.valueOf(password);
	}
	public void showCredentials (Employee emp, String email, String password) {
		System.out.println("Hello "+ emp.getFirstName() +" your generated credentials");
		System.out.println("Email: "+ email);
		System.out.println("Password: "+ password);
	}
}
