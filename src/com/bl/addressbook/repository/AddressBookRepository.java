package com.bl.addressbook.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.bl.addressbook.model.Person;

public class AddressBookRepository {
	List<Person> personList = new ArrayList<>();
	
	public void add(Person userDetails) {
		personList.add(userDetails);
	}

	public List<Person> findAll() {
		return personList;
	}

	public void delete(Person person){
		personList.remove(person);
		System.out.println("Deleted");
	}
	
}
