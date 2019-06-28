package com.axelor.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import com.axelor.db.Address;
import com.axelor.db.AddressBook;
import com.axelor.db.Mobile;
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
  public Response insert(
      @FormParam("perName") String name,
      @FormParam("perAddress") String address,
      @FormParam("perState") String state,
      @FormParam("perCity") String city,
      @FormParam("perContact") long contact, @FormParam("perType") String type) {
    String result = as.insertData(state, name, contact, city, address, type);
    return Response.status(200).entity(result).build();
  }

  @POST
  @Path("/fetch")
  public void fetch(@Context HttpServletResponse response, @Context HttpServletRequest request)
      throws ServletException, IOException {
    List<AddressBook> a1 = as.fetchData();
    List<Mobile> m1 = as.fetchMobile();
    List<Address> aa1 = as.fetchAddress(); 
    request.setAttribute("allmobile", m1);
    request.setAttribute("alladdress", aa1);
    request.setAttribute("allrecord", a1);
    request.getRequestDispatcher("FetchRecord.jsp").forward(request, response);
  }

  @GET
  @Path("/search/{id}")
  public void search(
      @PathParam("id") String name,
      @Context HttpServletResponse response,
      @Context HttpServletRequest request)
      throws ServletException, IOException {
    AddressBook result = as.searchData(Integer.parseInt(name));
    request.setAttribute("searchrecord", result);
    request.getRequestDispatcher("/UpdateForm.jsp").forward(request, response);
  }

  @POST
  @Path("/update")
  public Response update(
      @FormParam("perId") int id,
      @FormParam("perName") String name,
      @FormParam("perAddress") String address,
      @FormParam("perState") String state,
      @FormParam("perCity") String city,
      @FormParam("perContact") long contact) {
    String result = as.updateData(id, state, name, contact, city, address);
    return Response.status(200).entity(result).build();
  }

  @POST
  @Path("/delete")
  public Response delete(@FormParam("perName") String name) {
    String result = as.deleteData(name);
    return Response.status(200).entity(result).build();
  }
  
  @GET
  @Path("/param/{param}")
  public Response printMessage(@PathParam("param") String msg) {
    String result = "Restful example : " + msg;
    return Response.status(200).entity(result).build();
  }
}
