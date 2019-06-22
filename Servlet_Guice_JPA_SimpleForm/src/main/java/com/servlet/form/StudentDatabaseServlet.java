package com.servlet.form;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.service.StudentService;

@Singleton
public class StudentDatabaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private StudentService st;
	@Inject
    public StudentDatabaseServlet(StudentService st) {
        this.st=st;
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		int flag=0;
		String action = request.getParameter("action");
		if (action.equals("Register")) {
			// forward = index.jsp;
			flag = 2;
			try{
				String name = request.getParameter("sName");
				String email = request.getParameter("sEmail");
				String address = request.getParameter("sAddress");
				String department = request.getParameter("sDepartment");
				long contact = Long.parseLong(request.getParameter("sContact"));
				
				if(name.equals(""))
				{response.getWriter().write("Enter the Student Name."); flag=1;}
				if(email.equals(""))
				{response.getWriter().write("Enter The Email-Id."); flag=1;}
				if(department.equals("default"))
				{response.getWriter().write("Please Select Department of The Student."); flag=1;}
				if(flag==2)
				{
					String message = st.insertData(name, address, email, contact, department);
					response.getWriter().write(message);
				}
			}
			catch(Exception e)
			{
				flag=1;
				response.getWriter().write("Please Enter Contact Number. It is Neccessary.");
			}
			
		}
		else if(action.equals("Click Here To See All Data"))
		{
			List result = st.fetchData();
			request.setAttribute("myname",result);
			request.getRequestDispatcher("FetchRecord.jsp").forward(request, response); 
		}
		else if(action.equals("Delete"))
		{
			String del = request.getParameter("delete");
			String result = st.deleteData(del);
			response.getWriter().write(result);
		}
		else if(action.equals("Search")) {
			List result = st.searchData(request.getParameter("searchName"));
			request.setAttribute("my",result);
			request.getRequestDispatcher("UpdateForm.jsp").forward(request, response); 
		}
		else if(action.equals("Update")) {
			int abc = Integer.parseInt(request.getParameter("sId"));
			String name = request.getParameter("sName");
			String email = request.getParameter("Email");
			String address = request.getParameter("Address");
			String department = request.getParameter("sDepartment");
			long contact = Long.parseLong(request.getParameter("sContact"));
			
			String execution = st.updateData(abc, name, address, email, contact, department);
			response.getWriter().write(execution);
		}
		if(flag==0 || flag==2)
		{
			response.setContentType("text/html");
			response.getWriter().write("<form action='index.jsp'><input type='submit' value='Click Here' /></form>");
		}
		
	}

}
