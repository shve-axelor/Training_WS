package com.axelor.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.axelor.db.Address;
import com.axelor.db.AddressBook;
import com.axelor.db.Mobile;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

public class AddressImp implements AddressService {

  @Inject Provider<EntityManager> emp;

  @Override
  @Transactional
  public String insertData(
      String sate, String name, long contact, String city, String address, String type) {
    Mobile m1 = new Mobile();
    Address aa1 = new Address();

    m1.setContact(contact);
    m1.setType(type);
    emp.get().persist(m1);
    aa1.setAddress(address);
    emp.get().persist(aa1);
    ArrayList<Mobile> li1 = new ArrayList<Mobile>();
    li1.add(m1);

    ArrayList<Address> li2 = new ArrayList<Address>();
    li2.add(aa1);

    AddressBook a1 = new AddressBook();
    a1.setPerName(name);
    a1.setPerState(sate);
    a1.setPerCity(city);
    a1.setMobile_numbers(li1);
    a1.setAddress(li2);
    try {
      emp.get().persist(a1);
    } catch (PersistenceException e) {
      return "Record Is Not Inserted Due To Some Error.  Please Try Again.";
    }

    return "Record inserted successfully";
  }

  @Override
  @Transactional
  public List<AddressBook> fetchData() {
    Query query = emp.get().createQuery("Select a from AddressBook a");
    List<AddressBook> a = query.getResultList();

    return a;
  }

  @Override
  @Transactional
  public AddressBook searchData(int id) {
    AddressBook que = emp.get().find(AddressBook.class, id);

    return que;
  }

  @Override
  @Transactional
  public String deleteData(int id) {
    AddressBook a1 = emp.get().find(AddressBook.class, id);
    emp.get().remove(a1);
    return "Record Sucessfully Deleted";
  }

  @Override
  @Transactional
  public String updateData(int id, String state, String name, String city) {

    AddressBook a1 = emp.get().find(AddressBook.class, id);
    a1.setPerState(state);
    a1.setPerName(name);
    a1.setPerCity(city);

    return "The Data is Sucessfully Updated" + id;
  }

  @Override
  @Transactional
  public String addContact(int id, long contact, String contacttype) {
    AddressBook a1 = emp.get().find(AddressBook.class, id);
    Mobile m1 = new Mobile();
    m1.setContact(contact);
    m1.setType(contacttype);
    emp.get().persist(m1);
    List<Mobile> li1 = a1.getMobile_numbers();
    li1.add(m1);
    a1.setMobile_numbers(li1);
    return "The Contact is Sucessfully Saved";
  }

  @Override
  @Transactional
  public String deleteMobile(int id) {
    Mobile a1 = emp.get().find(Mobile.class, id);
    emp.get().remove(a1);
    return "Mobile Number deleted Sucessfully";
  }

  @Override
  public Mobile searchMobile(int mid) {
    Mobile me = emp.get().find(Mobile.class, mid);
    return me;
  }

  @Override
  @Transactional
  public String updateContact(int id, long contact, String contacttype) {
    Mobile m1 = emp.get().find(Mobile.class, id);
    m1.setContact(contact);
    m1.setType(contacttype);
    return "Contact Detail Updated Sucessfully";
  }

  @Override
  public List<AddressBook> serData(String abc) {
    System.out.println(abc ); 
    Query query = emp.get().createQuery("Select a from AddressBook a where a.perName like '"+ abc +"%'");
    List<AddressBook> a = query.getResultList();
    return a;
  }
}
