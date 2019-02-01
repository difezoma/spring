package com.difezoma.backend.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.difezoma.backend.model.Person;
import com.difezoma.backend.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImplementation implements ExampleService {
	
	public static final Log LOGGER = LogFactory.getLog(ExampleServiceImplementation.class);

	@Override
	public List<Person> getPeople() {
		
		LOGGER.info("HELLO FROM SERVICE");
		
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Diego", 26));
		people.add(new Person("Myriam", 56));
		people.add(new Person("Luis", 58));
		
		return people;
	}

}
