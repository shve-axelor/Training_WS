package com.guice.jpa;

import com.google.inject.Inject;
import com.google.inject.persist.*;
import com.google.inject.Singleton;

@Singleton
public class JPAInitializer {
	
	@Inject
	public JPAInitializer(PersistService service)
	{
		service.start();
	}
}
