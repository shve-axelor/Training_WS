package com.guice.gradle;



import com.google.inject.Binder;
import com.google.inject.Module;

public class AddMod implements Module {

  @Override
  public void configure(Binder binder) {
    // TODO Auto-generated method stub
    binder.bind(Sum.class).to(SimpleSum.class);
  }
}
