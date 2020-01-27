package pl.smandzich.javatask.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.smandzich.javatask.Model.Student;

public interface StudentRepo extends CrudRepository<Student, Long> {
}
