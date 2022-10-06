package servletStudentRegistration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentRegistrationService.StudentService;
import studentRegistrationServicedto.Student;

public class ServletStudentRegistration extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		int age = Integer.parseInt(req.getParameter("age"));
		String gender = req.getParameter("");
		String qualification = req.getParameter("qualiification");

//	PrintWriter out=resp.getWriter();
//	out.println(age);
//	out.println(name);
//	out.println(email);
//	out.println(gender);
//	out.println(qualification);

	
		Student student = new Student();
		student.setAge(age);
		student.setName(name);
		student.setEmail(email);
		student.setGender(gender);
		student.setQualification(qualification);

		StudentService service = new StudentService();
		service.saveStudent(student);
	}
}