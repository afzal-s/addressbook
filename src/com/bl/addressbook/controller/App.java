package com.bl.addressbook.controller;

import java.util.List;

import com.bl.addressbook.model.Person;
import com.bl.addressbook.serviceimpl.AddressBookServiceImpl;
import com.bl.addressbook.view.UserInterface;

public class App {

	public static void main(String[] args) {
		App app = new App();
		app.showOptionMenu();
	}

	private void showOptionMenu() {
		UserInterface userInterface = new UserInterface();
		AddressBookServiceImpl addressBookServiceImpl = new AddressBookServiceImpl();

		boolean flag = false;
		while (!flag) {
			int choice = userInterface.getChoice();
			switch (choice) {
			case 1:
				Person userDetails = UserInterface.getUserDetails();
				addressBookServiceImpl.add(userDetails);
				break;
			case 2:
				List<Person> personList = addressBookServiceImpl.findAll();
				UserInterface.display(personList);
				break;
			case 3:
				// update
				break;
			case 4:
				// delete
				break;
			case 5:
				flag = true;
				break;
			default:
				System.out.println("Error!! Invalid Input");
				break;
			}
		}
	}
}