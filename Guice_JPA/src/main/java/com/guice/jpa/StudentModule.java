package com.guice.jpa;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.persist.jpa.JpaPersistModule;

public class StudentModule extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		install(new JpaPersistModule("myFirstJpaUnit"));
		bind(Student.class).to(StudentImp.class).in(Singleton.class);
		bind(JPAInitializer.class);
	}

}
