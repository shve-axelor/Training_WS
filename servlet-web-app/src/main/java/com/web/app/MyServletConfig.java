package com.web.app;

import java.util.HashMap;
import java.util.Map;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

public class MyServletConfig extends GuiceServletContextListener {

  @Override
  protected Injector getInjector() {
    // TODO Auto-generated method stub

    // seted the initialize parameter for servlet which we set in <init-param> in web.xml file
    Map<String, String> params = new HashMap<String, String>();
    params.put("coffee", "StarBucks");
    params.put("site", "www.axelor.com");

    return Guice.createInjector(
        new ServletModule() {

          @Override
          protected void configureServlets() {

            //	  filter("/*").through(Key.get(Filter.class, Fave.class));
            //	  bind(Filter.class).annotatedWith(Fave.class).to(MyFilterImpl.class);
            serve("/*").with(FirstServlet.class, params);
            bind(MyService.class).to(MyServiceImp.class);
          }
        });
  }
}
