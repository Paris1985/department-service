package com.cloud.demo.service;

import com.cloud.demo.model.Department;
import com.cloud.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;


    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department getDepartment(int id) {
        Optional<Department> department = departmentRepository.findById(id);
        return department.isPresent() ? department.get() : new Department();
    }
}
