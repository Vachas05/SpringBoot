package in.allamvachaspati.springRestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.allamvachaspati.springRestApi.model.Employee;
import in.allamvachaspati.springRestApi.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService eService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return eService.getEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return eService.getSingleEmployee(id);
	}
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return eService.saveEmployee(employee);
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		System.out.println("update the detailes of employee :  " + id);
		return employee;
	}
	
	@DeleteMapping("/employees")
	public String deleteEmployee(@RequestParam Long id) {
		return "deleting employee with id : " + id;
	}
	
}
