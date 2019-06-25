package com.module;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.PersistFilter;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.service.StudentDetailImp;
import com.service.StudentService;
import com.servlet.form.StudentDatabaseServlet;

public class StudentModule extends GuiceServletContextListener {
  @Override
  protected Injector getInjector() {
    return Guice.createInjector(
        new ServletModule() {

          protected void configureServlets() {
            install(new JpaPersistModule("studentform"));
            //		bind(StudentServlet.class).in(Scopes.SINGLETON);
            filter("/*").through(PersistFilter.class);
            serve("/StudentDatabaseServlet").with(StudentDatabaseServlet.class);
            bind(StudentService.class).to(StudentDetailImp.class);
          }
        });
  }
}
