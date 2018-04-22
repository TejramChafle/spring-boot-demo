package in.co.wizbee.spring.models;

import in.co.wizbee.spring.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeModel {

    private List<Employee> employees = Arrays.asList(
            new Employee("E120", "Chetan Bhagat", 25),
            new Employee("E130", "Ramesh Kant", 34),
            new Employee("E140", "Pritam Patil", 29)
    );

    public List<Employee> getEmployees(){
        return employees;
    }

    public Employee employeeList(String id){
        return employees.stream().filter(e->e.getId().equals(id)).findFirst().get();
    }
}
