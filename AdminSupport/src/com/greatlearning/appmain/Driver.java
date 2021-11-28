package com.greatlearning.appmain;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First Name:");
		String firstName=scanner.next();
		
		System.out.println("Enter Last Name:");
		String lastName=scanner.next();
		
		System.out.println("Enter Department Name:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int choice=scanner.nextInt();
		String departmentName=null;
		CredentialService credentialService=new CredentialService();
		switch(choice) {
			case 1: departmentName="Technical";
					break;
			case 2: departmentName="Admin";
					break;
			case 3: departmentName="Human Resource";
					break;
			case 4: departmentName="Legal";
					break;
			default:
					System.out.println("Invalid Input");
					break;
		}
		Employee employee=new Employee(firstName, lastName, departmentName);
		String email=credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(), employee.getDepartmentName());
		String password=credentialService.generatePassword();
		credentialService.showCredentials(employee, email, password);
	}

}
