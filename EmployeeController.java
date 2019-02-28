package com.business.world.controller;

import com.business.world.dao.DatabaseAccess;
import com.business.world.dto.Employee;
import com.business.world.entity.EmployeeEntity;
import com.business.world.util.JsonReader;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
public class EmployeeController {

@GetMapping("/hello")
public String hello(){
    return "Welcome to Spring Boot Project";
}

    @PostMapping(value = "/insertEmployee")
    @ResponseBody
    public String insertRecord(@RequestBody String json){
        System.out.println("------------Inside insertRecord----------");
        EmployeeEntity emp = JsonReader.jsonToEmployee(json);
        System.out.println ("Employee created : " + emp.getFirstname());
        new DatabaseAccess().createEmployee(emp);
        return "Employee " + emp.getEmployeeId() + " Inserted Successfully";
    }

   @GetMapping(value = "/getEmployee")
	public void getRecord() {
		System.out.println("-----------Inside getRecord------------");
		List<EmployeeEntity> empList = new DatabaseAccess().getEmployees();
       List<String> emp = JsonReader.employeeToJson(empList);

	}

   @PutMapping(value = "/updateEmployee")
    public String updateRecord(@RequestBody String json) {
        System.out.println("---------Inside update Record-----------");
        EmployeeEntity emp = JsonReader.jsonToEmployee(json);
       new DatabaseAccess().updateEmployee(emp);
        return "Employee -" + emp.getEmployeeId() + "- Update";
    }


    @DeleteMapping(value = "/deleteEmployee/{employeeId}")
    public String deleteRecord(@PathVariable("employeeId") String employeeId) throws Exception {
        System.out.println("---------Inside delete Record-----------");
        new DatabaseAccess().deleteEmployee(employeeId);
        return "Employee -" + employeeId + "- deleted";



    }
}



