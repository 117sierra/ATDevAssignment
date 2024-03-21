package ATDevservices.Assignment.Service;
import ATDevservices.Assignment.Model.Student;
import ATDevservices.Assignment.Repository.PlayerRepository;
import ATDevservices.Assignment.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private PlayerRepository playerreposotory;



    public Student save(Student student){
        return studentRepository.save(student);
    }
    public Student find(Student student){
        return studentRepository.findStudentByEmail(student.getEmail());
    }

    public void delete(Student student){
        studentRepository.deleteByContactNumber(student.getContact());

    }
    public Student update(Student student){
        Student student1= studentRepository.findStudentByEmail(student.getEmail());
        student1.setContact(student.getContact());
        return studentRepository.save(student1);

    }

}

