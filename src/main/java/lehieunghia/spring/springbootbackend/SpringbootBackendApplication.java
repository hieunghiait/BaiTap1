package lehieunghia.spring.springbootbackend;

import lehieunghia.spring.springbootbackend.model.Employee;
import lehieunghia.spring.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication  implements CommandLineRunner {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setFirstName("Le");
		employee.setLastName("Hieu Nghia");
		employee.setEmailId("lehieunghia2402@gmail.com");
		employeeRepository.save(employee);
	}
}
