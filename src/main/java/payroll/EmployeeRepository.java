package payroll;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;

interface EmployeeRepository extends JpaRepository<Employee, Long>{
}