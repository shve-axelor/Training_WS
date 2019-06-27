package com.axelor.web;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.axelor.service.AddressService;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
@Path("/")
public class AddressController {
  private AddressService as;

  @Inject
  public AddressController(AddressService as) {
    this.as = as;
  }

  @POST
  @Path("/insert")
  public void add(@FormParam("perName") String abc) {
    as.insertData(abc);
  }
}
