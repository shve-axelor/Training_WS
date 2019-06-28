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
  public List<Mobile> fetchMobile() {
    Query query = emp.get().createQuery("Select a from Mobile a");

    List<Mobile> a = query.getResultList();

    return a;
  }

  @Override
  @Transactional
  public List<Address> fetchAddress() {
    Query query = emp.get().createQuery("Select a from Address a");

    List<Address> a = query.getResultList();

    return a;
  }

  @Override
  @Transactional
  public AddressBook searchData(int name) {
    AddressBook que = emp.get().find(AddressBook.class, name);

    return que;
  }

  @Override
  @Transactional
  public String deleteData(String name) {
    Query qu = emp.get().createQuery("delete from AddressBook where perName = '" + name + "'");

    int execution = qu.executeUpdate();

    if (execution == 1) {
      return "The Record Is Deleted Successfully.";
    } else {
      return "The Record Of The Student Is Not Found.";
    }
  }

  @Override
  @Transactional
  public String updateData(
      int id, String state, String name, long contact, String city, String address) {

    AddressBook a1 = emp.get().find(AddressBook.class, id);
    a1.setPerState(state);
    a1.setPerName(name);
    // a1.setPerContact(contact);
    a1.setPerCity(city);
    //  a1.setPerAddress(address);

    return "The Data is Sucessfully Updated" + id;
  }
}
