package com.cloud.demo;

import com.cloud.demo.model.Department;
import com.cloud.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DepartmentServiceApplication implements CommandLineRunner {

	@Autowired
	private DepartmentService departmentService;

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Department department = new Department();
		department.setName("UHG");
		department.setAddress("BGC Uptown Mall");
		department.setCode("UHG 001");
		departmentService.addDepartment(department);
	}
}
