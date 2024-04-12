package rikkei.academy.service.impl;

import org.springframework.stereotype.Service;
import rikkei.academy.model.Employee;
import rikkei.academy.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> fillAll() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Nam","0987654321","Ha Noi",true));
        employees.add(new Employee(2,"Minh","0987654123","TP HCM",false));
        employees.add(new Employee(3,"Linh","0987654999","Ha Noi",true));
        return employees;
    }
}
