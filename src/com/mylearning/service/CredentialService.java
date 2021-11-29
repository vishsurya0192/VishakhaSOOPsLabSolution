package com.mylearning.service;
import java.util.Random;
import com.mylearning.model.Employee;

public class CredentialService {

	/* @author Vishakha
	 * Date: 11/27/21
	 */
	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		
		
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		
		Random random = new Random();
		char[] password = new char[8];
		for (int i = 0; i < 8; i++) {
			//use of charAt() method: for char values
			//use of nextInt() to scan the values as int
			password[i] = values.charAt(random.nextInt(values.length()));
			
		}
		return password;		
		
	}
	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName + "."+lastName + "@" + department + ".avishkha.com";
		
	}
	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		String pass = new String(generatedPassword);
		System.out.println("Dear Employee " + employee.getFirstName() + " your generated credentials are as follows ");
		System.out.println("Email-----> " + email);
		System.out.print("password----> " + pass);
		
	}

}
