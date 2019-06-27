package com.axelor.module;

import com.axelor.service.AddressImp;
import com.axelor.service.AddressService;
import com.axelor.web.AddressController;
import com.google.inject.AbstractModule;

public class AddressModule extends AbstractModule {

  @Override
  protected void configure() {
    // TODO Auto-generated method stub
    bind(AddressController.class);
    bind(AddressService.class).to(AddressImp.class);
  }
}
