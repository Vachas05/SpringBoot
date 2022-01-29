package in.allamvachaspati.springRestApi.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
	
	private String name;
	private Long age;
	private String location;
	private String email;
	private String department;
	
}
