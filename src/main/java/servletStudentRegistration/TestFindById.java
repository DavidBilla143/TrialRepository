package servletStudentRegistration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentRegistrationService.StudentService;
import studentRegistrationServicedto.Student;

public class TestFindById extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		
		StudentService service=new StudentService();
		Student stu=service.getStudentById(id);

		if(stu!=null) {
		PrintWriter out=resp.getWriter();
		out.println(stu.getId());
		out.println(stu.getName());
		out.println(stu.getEmail());
		out.println(stu.getGender());
		out.println(stu.getAge());
		out.println(stu.getQualification());
	}
		else {
			System.out.println("Data for the given Id is not present");
		}
		
		ServletContext context=getServletContext();
		System.out.println(context.getInitParameter("a1"));
		System.out.println(context.getInitParameter("a2"));
		
		ServletConfig config=getServletConfig();
		System.out.println(config.getInitParameter("xyz"));
	}
}