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
      @FormParam("perContact") long contact,
      @FormParam("perType") String type) {
    String result = as.insertData(state, name, contact, city, address, type);
    result =
        result
            + "<br><br><form action='index.jsp'><input type='submit' value='Click Here To Go To Main Page' /></form> ";
    return Response.status(200).entity(result).build();
  }

  @GET
  @Path("/fetch")
  public void fetch(@Context HttpServletResponse response, @Context HttpServletRequest request)
      throws ServletException, IOException {
    List<AddressBook> a1 = as.fetchData();
    request.setAttribute("allrecord", a1);
    request.getRequestDispatcher("FetchRecord.jsp").forward(request, response);
  }

  @POST
  @Path("/ser")
  public void ser(
      @FormParam("serName") String abcd,
      @Context HttpServletResponse response,
      @Context HttpServletRequest request)
      throws ServletException, IOException {
    List<AddressBook> a1 = as.serData(abcd);
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

  @GET
  @Path("/addcon/{id}")
  public void addCon(
      @PathParam("id") String name,
      @Context HttpServletResponse response,
      @Context HttpServletRequest request)
      throws ServletException, IOException {
    AddressBook result = as.searchData(Integer.parseInt(name));
    request.setAttribute("searchrecord", result);
    request.getRequestDispatcher("/AddContact.jsp").forward(request, response);
  }

  @GET
  @Path("/updatecon/{id}")
  public void updateCon(
      @PathParam("id") int id,
      @Context HttpServletResponse response,
      @Context HttpServletRequest request)
      throws ServletException, IOException {
    Mobile result = as.searchMobile(id);
    request.setAttribute("searchrecord", result);
    request.getRequestDispatcher("/UpdateContact.jsp").forward(request, response);
  }

  @GET
  @Path("/add/{id}")
  public void add(
      @PathParam("id") String name,
      @Context HttpServletResponse response,
      @Context HttpServletRequest request)
      throws ServletException, IOException {
    AddressBook result = as.searchData(Integer.parseInt(name));
    request.setAttribute("searchrecord", result);
    request.getRequestDispatcher("/AddAddress.jsp").forward(request, response);
  }

  @POST
  @Path("search/update")
  public Response update(
      @FormParam("perId") int id,
      @FormParam("perName") String name,
      @FormParam("perState") String state,
      @FormParam("perCity") String city) {
    String result = as.updateData(id, state, name, city);
    result =
        result
            + "<br><br><form action='/rest-demo/fetch'><input type='submit' value='Click Here' /></form> ";
    return Response.status(200).entity(result).build();
  }

  @POST
  @Path("/addcon/addcontact")
  public Response addCon(
      @FormParam("perId") int id,
      @FormParam("addCon") long con,
      @FormParam("addConType") String contype) {
    String result = as.addContact(id, con, contype);
    result =
        result
            + "<br><br><form action='/rest-demo/fetch'><input type='submit' value='Click Here' /></form> ";
    return Response.status(200).entity(result).build();
  }

  @POST
  @Path("/updatecon/contact")
  public Response updateCon(
      @FormParam("perId") int id,
      @FormParam("addCon") long con,
      @FormParam("addConType") String contype) {
    String result = as.updateContact(id, con, contype);
    result =
        result
            + "<br><br><form action='/rest-demo/fetch'><input type='submit' value='Click Here' /></form> ";
    return Response.status(200).entity(result).build();
  }

  @GET
  @Path("/delete/{id}")
  public Response delete(@PathParam("id") int id) {
    String result = as.deleteData(id);
    result =
        result
            + "<br><br><form action='/rest-demo/fetch'><input type='submit' value='Click Here' /></form> ";
    return Response.status(200).entity(result).build();
  }

  @GET
  @Path("/del/{id}")
  public Response deleteMobile(@PathParam("id") int id) {
    String result = as.deleteMobile(id);
    result =
        result
            + "<br><br><form action='/rest-demo/fetch'><input type='submit' value='Click Here' /></form> ";
    return Response.status(200).entity(result).build();
  }
}
