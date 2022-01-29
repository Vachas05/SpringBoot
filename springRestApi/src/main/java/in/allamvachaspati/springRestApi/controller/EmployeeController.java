package in.allamvachaspati.springRestApi.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.allamvachaspati.springRestApi.model.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping("/employees")
	public String getEmployees() {
		return "displaying the list of employees!!";
	}
	
	@GetMapping("/employee/{id}")
	public String getEmployee(@PathVariable Long id) {
		return "fetching the details of the employee id : "+ id;
	}
	
	@PostMapping("/employees")
	public String saveEmployee(@RequestBody Employee employee) {
		return "saving the employee details." + employee;
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
