/**
 * 
 */
package com.UST.EmployeeRegistration.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UST.EmployeeRegistration.model.Employee;
import com.UST.EmployeeRegistration.service.EmployeeServices;


/**
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/emp/registration")
public class EmployeeController {
	@Autowired
         private EmployeeServices  employeeservices;
	@PostMapping("/addemps")
	public Employee address(@RequestBody Employee employee) {
		return employeeservices.createEmployee(employee);
	}
	@GetMapping("/employee")
	public List <Employee> getAllEmployee(){
	     return employeeservices.getEmployees();
   }
   @GetMapping("/employees/(id)")
   public Employee getEmployeeById(@PathVariable int  id){
         return employeeservices.getEmployeeById(id);
   }
   @PutMapping("/updateemployee/(id)")
   public Employee updateEmployee(@RequestBody Employee employee) {
         return employeeservices.UpdateEmployee(employee);
   }
   @DeleteMapping("/deleteemployee/(id)")
   public String deleteEmployee(@PathVariable int  id){
       return employeeservices.deleteEmployee(id);
 }
   }
   

