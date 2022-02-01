package in.allamvachaspati.springRestApi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tbl_employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	@NotNull(message="Name should not be NULL")
	private String name;
	
	@Column(name = "age")
	private Long age = 0L;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "email")
	@Email(message="Please enter a valid email address")
	private String email;
	
	@Column(name = "department")
	@NotNull(message="Department should not be NULL")
	private String department;
	
	@CreationTimestamp
	@Column(name = "created_at", nullable = false, updatable = false)
	private Date createdAt;
	
	@UpdateTimestamp
	@Column(name = "updated_at")
	private Date updatedAt;
}
