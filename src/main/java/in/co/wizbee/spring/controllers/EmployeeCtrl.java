package in.co.wizbee.spring.controllers;

import in.co.wizbee.spring.Employee;
import in.co.wizbee.spring.models.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeCtrl {

    @Autowired
    EmployeeModel employeeModel;

    @RequestMapping("employees")
    public List<Employee> getEmployees(){
        return employeeModel.getEmployees();
    }


    @RequestMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable String id){
        return employeeModel.employeeList(id);
    }
}
