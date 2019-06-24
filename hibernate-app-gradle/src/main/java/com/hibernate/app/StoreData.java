package com.hibernate.app;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Configuration con = new Configuration().configure();

    SessionFactory sf = con.buildSessionFactory();

    Session session = sf.openSession();

    Transaction t1 = session.beginTransaction();

    Answer ans1 = new Answer();
    ans1.setAnswername("Java is a programming language");
    ans1.setPostedBy("Ravi malik");

    Answer ans2 = new Answer();
    ans2.setAnswername("Java is a platform");
    ans2.setPostedBy("Sudhir Kumar");

    Answer ans5 = new Answer();
    ans2.setAnswername("Java is a platform independent");
    ans2.setPostedBy("Shubh Vegada");

    Answer ans6 = new Answer();
    ans2.setAnswername("Java is a world's most usable language");
    ans2.setPostedBy("Shubh Vegada");

    Answer ans3 = new Answer();
    ans3.setAnswername("Servlet is an Interface");
    ans3.setPostedBy("Jai Kumar");

    Answer ans4 = new Answer();
    ans4.setAnswername("Servlet is an API");
    ans4.setPostedBy("Arun");

    ArrayList<Answer> list1 = new ArrayList<Answer>();
    list1.add(ans1);
    list1.add(ans2);
    //	list1.add(ans5);
    //	list1.add(ans6);

    ArrayList<Answer> list2 = new ArrayList<Answer>();
    list2.add(ans3);
    list2.add(ans4);

    question question1 = new question();
    question1.setQname("What is java?");
    question1.setAnswers(list1);

    question question2 = new question();
    question2.setQname("What is Servlet");
    question2.setAnswers(list2);

    session.save(question1);
    session.save(question2);

    t1.commit();
    session.close();
    sf.close();
  }
}
