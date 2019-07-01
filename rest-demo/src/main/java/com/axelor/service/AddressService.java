package com.axelor.service;

import java.util.List;

import com.axelor.db.AddressBook;
import com.axelor.db.Mobile;

public interface AddressService {
  public String insertData(
      String sate, String name, long contact, String city, String address, String type);

  public List<AddressBook> fetchData();

  public AddressBook searchData(int id);
  
  public Mobile searchMobile(int mid);

  public String deleteData(int id);
  
  public String deleteMobile(int id);

  public String addContact(int id, long contact, String contacttype);
  
  public String updateContact(int id, long contact, String contacttype);

  public String updateData(int id, String state, String name, String city);
  
  public List<AddressBook> serData(String abc);
}
