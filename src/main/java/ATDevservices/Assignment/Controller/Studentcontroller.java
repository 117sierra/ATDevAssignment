package ATDevservices.Assignment.Controller;
import ATDevservices.Assignment.Model.Student;
import ATDevservices.Assignment.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class Studentcontroller {
    @Autowired
    private StudentService studentservice;

    @GetMapping("/find")
    public Student find(@RequestBody Student student){
        return studentservice.find(student);
    }
    @PostMapping("/create")
    public Student create(@RequestBody Student student){
        return studentservice.save(student);
    }
    @PutMapping("/update")
    public Student update(@RequestBody Student student){
        return studentservice.update(student);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@RequestBody Student student){
//        String  = student.getEmail();
        studentservice.delete(student);
        return new ResponseEntity<>("Student Deleted Successfully with contact " +student.getContact(), HttpStatus.OK);
    }
}

