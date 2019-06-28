package com.axelor.service;

import java.util.List;

import com.axelor.db.Address;
import com.axelor.db.AddressBook;
import com.axelor.db.Mobile;

public interface AddressService {
  public String insertData(
      String sate, String name, long contact, String city, String address, String type);

  public List<AddressBook> fetchData();

  public List<Mobile> fetchMobile();

  public List<Address> fetchAddress();

  public AddressBook searchData(int name);

  public String deleteData(String name);

  public String updateData(
      int id, String state, String name, long contact, String city, String address);
}
