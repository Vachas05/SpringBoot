package in.allamvachaspati.springRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.allamvachaspati.springRestApi.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
