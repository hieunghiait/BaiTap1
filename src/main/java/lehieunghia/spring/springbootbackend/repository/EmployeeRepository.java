package lehieunghia.spring.springbootbackend.repository;

import lehieunghia.spring.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    //all crud database method
}
