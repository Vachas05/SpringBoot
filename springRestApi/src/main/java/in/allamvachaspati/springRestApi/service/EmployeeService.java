package in.allamvachaspati.springRestApi.service;

import java.util.List;

import in.allamvachaspati.springRestApi.model.Employee;

public interface EmployeeService {
	
	List<Employee> getEmployees();
	
	Employee saveEmployee(Employee employee);
	
	Employee getSingleEmployee(Long id);
	
	void deleteEmployee(Long id);
	
	Employee updateEmployee(Employee employee);
}
