package ATDevservices.Assignment.Repository;
import ATDevservices.Assignment.Model.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findStudentByEmail(String contact);
    //    void deleteStudentByEmail(String email);
    @Transactional
    @Modifying
    @Query("DELETE FROM Student s WHERE s.contact= :contactNumber")
    void deleteByContactNumber( String contactNumber);
}

