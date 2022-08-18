package com.cloud.demo.controller;

import com.cloud.demo.model.Department;
import com.cloud.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department addDepartment(@RequestBody Department department) {
        return departmentService.addDepartment(department);
    }
    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable int id){
        return departmentService.getDepartment(id);
    }
}
