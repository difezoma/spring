package com.difezoma.backend.service;

import java.util.List;

import com.difezoma.backend.model.ContactModel;

public interface ContactService {
	
	public abstract ContactModel addContact(ContactModel contactModel);
	public abstract List<ContactModel> listAllContacts();
	public abstract void removeContact(int id);
	public abstract ContactModel findContactModelById(int id);

}
