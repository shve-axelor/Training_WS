package com.axelor.service;

import javax.persistence.EntityManager;

import com.axelor.db.AddressBook;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

public class AddressImp implements AddressService {

  @Inject Provider<EntityManager> emp;

  @Override
  @Transactional
  public String insertData(String name) {
    AddressBook a1 = new AddressBook();
    a1.setPerName(name);
    emp.get().persist(a1);
    return "Inserted Sucessfully";
  }
}
