package com.bl.addressbook.serviceimpl;

import java.util.List;

import com.bl.addressbook.model.Person;
import com.bl.addressbook.repository.AddressBookRepository;
import com.bl.addressbook.service.IAddressBookService;

public class AddressBookServiceImpl implements IAddressBookService {
	AddressBookRepository addressBookRepo = new AddressBookRepository();

	@Override
	public void add(Person userDetails) {
		addressBookRepo.add(userDetails);		
	}

	@Override
	public List<Person> findAll() {
		List<Person> personList = addressBookRepo.findAll();
		return personList;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Person person) {
		
	}
	
}
