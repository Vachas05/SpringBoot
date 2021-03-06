package in.allamvachaspati.springRestApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.allamvachaspati.springRestApi.model.Employee;
import in.allamvachaspati.springRestApi.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository eRepository;
	
	@Override
	public List<Employee> getEmployees() {
		return eRepository.findAll() ;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return eRepository.save(employee);
	}

	@Override
	public Employee getSingleEmployee(Long id) {
		//System.out.println(eRepository.getById(id));
		Optional<Employee> employee = eRepository.findById(id);
	
		if(employee.isPresent()) {
			return employee.get();
		}
		throw new RuntimeException("Employee not found for the id : " + id);
	}

	@Override
	public void deleteEmployee(Long id) {
		eRepository.deleteById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return eRepository.save(employee);
	}

}   
