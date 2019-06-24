package com.service;

import java.util.List;

import com.entity.StudentDetail;

public interface StudentService {
  public String insertData(String name, String add, String email, long contact, String department);

  public List<StudentDetail> fetchData();

  public String deleteData(String del);

  public List<StudentDetail> searchData(String name);

  public String updateData(
      int dels, String namess, String address, String emails, long contacts, String departments);
}
