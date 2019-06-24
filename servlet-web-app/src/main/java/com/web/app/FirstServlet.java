package com.web.app;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.google.inject.Singleton;

// @WebServlet("/FirstServlet")
@Singleton
public class FirstServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  private MyService myService;
  /** @see HttpServlet#HttpServlet() */
  @Inject
  public FirstServlet(MyService ms) {
    super();
    this.myService = ms;
  }

  /** @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response) */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    ServletConfig con = getServletConfig();

    response.getWriter().append("Served at: ").append(request.getContextPath());
    response.getWriter().write("\n" + myService.hello("Guice"));
    response.getWriter().write("\n" + con.getInitParameter("site"));
    response.getWriter().write("\n" + con.getServletContext());
  }

  /** @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response) */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    doGet(request, response);
  }
}
