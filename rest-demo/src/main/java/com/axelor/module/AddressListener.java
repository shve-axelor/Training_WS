package com.axelor.module;

import java.util.Arrays;
import java.util.List;

import javax.inject.Singleton;
import javax.servlet.ServletContext;

import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;

import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;

@Singleton
public class AddressListener extends GuiceResteasyBootstrapServletContextListener {

  @Override
  protected List<? extends Module> getModules(ServletContext context) {
    return Arrays.asList((Module) new JpaPersistModule("addressbook"), new AddressModule());
  }

  @Override
  public void withInjector(Injector injector) {
    injector.getInstance(PersistService.class).start();
  }
}
