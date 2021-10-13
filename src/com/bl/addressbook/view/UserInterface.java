package com.bl.addressbook.view;

import java.util.List;

import com.bl.addressbook.model.Address;
import com.bl.addressbook.model.Person;
import com.bl.addressbook.utility.UtilScanner;

public class UserInterface {

	public int getChoice() {
		System.out.println("1. Add Contact \n"
						 + "2. Display Contact \n"
						 + "3. Delete Contact \n"
						 + "4. Update Display\n"
						 + "5. Exit \n");
		int choice = UtilScanner.getInt();
		return choice;
	}

	public static Person getUserDetails() {
		Person person = new Person();
		person.setFirstName(UtilScanner.getString("Enter First Name: "));
		person.setLastName(UtilScanner.getString("Enter Last Name: "));
		person.setEmail(UtilScanner.getString("Enter Email ID: "));
		person.setMobileNumber(UtilScanner.getString("Enter Mobile Number: "));
		
		Address address = new Address();
		address.setCity(UtilScanner.getString("Enter Land Mark:  "));
		address.setLandMark(UtilScanner.getString("Enter City: "));
		address.setState(UtilScanner.getStringLine("Enter State: "));
		address.setZipCode(UtilScanner.getString("Enter Pin Code: "));
		person.setAddress(address);
		
		return person;
	}

	public static void display(List<Person> personList) {
		System.out.println(personList);
	}

}