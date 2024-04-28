package edu.pja.sri.s32073.sri02.cwiczenie1.repo;

import edu.pja.sri.s32073.sri02.cwiczenie1.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findAll();
}
