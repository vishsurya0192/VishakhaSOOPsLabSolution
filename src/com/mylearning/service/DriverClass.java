package com.mylearning.service;
import java.util.Scanner;

import com.mylearning.model.Employee;


public class DriverClass {
	/* @author Vishakha
	 * Date: 11/27/21
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Vishakha","Suryawanshi");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		switch(option) {
		
		case 1: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "tech");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		}
		case 2: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "admn");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
			
			}
		case 3: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "hr");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
			
			}
		case 4: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "legal");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
			
			}
		default: {
			System.out.println("Invalid option. Please enter a valid option");
			break;
		}
		
		}
		sc.close();

	}

}
