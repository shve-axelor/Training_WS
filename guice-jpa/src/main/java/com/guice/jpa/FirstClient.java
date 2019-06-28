package com.guice.jpa;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class FirstClient {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Injector inject = Guice.createInjector(new StudentModule());
    JPAInitializer ps = inject.getInstance(JPAInitializer.class);
    Student st = inject.getInstance(Student.class);

    StudentEntity se = st.getsName(27);

    System.out.println(se.getsName());
  }
}
