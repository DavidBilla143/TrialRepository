package studentRegistrationService;

import studentRegistrationServiceDao.StudentDao;
import studentRegistrationServicedto.Student;

public class StudentService {
	public boolean saveStudent(Student student) {
		StudentDao dao = new StudentDao();
		return dao.saveStudent(student);
	}
	
	public Student getStudentById(int id) {
		StudentDao dao=new StudentDao();
		return dao.getStudentById(id);
	}
}