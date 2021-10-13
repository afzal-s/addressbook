package com.bl.addressbook.service;

import java.util.List;

import com.bl.addressbook.model.Person;

public interface IAddressBookService {
	
	public void add(Person userDetails);
	public List<Person> findAll();
	public void update();
	public void delete(Person person);
}