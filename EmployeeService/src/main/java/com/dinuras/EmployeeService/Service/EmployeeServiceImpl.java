package com.dinuras.EmployeeService.Service;

import com.dinuras.EmployeeService.Repository.EmployeeRepository;
import com.dinuras.EmployeeService.model.Allocation;
import com.dinuras.EmployeeService.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Override
    public Employee add(Employee employee) {

        return repository.save(employee);

    }

    @Override
    public void delete(Integer id) {

        repository.deleteById(id);

    }

    @Override
    public List<Employee> getEmployees() {

        return repository.findAll();

    }


    @Override
    public Employee getEmployeeById(int id) {
        Optional<Employee> employee = repository.findById(id);

        if (employee.isPresent()) {
            HttpEntity<String> httpEntity = new HttpEntity<>("", new HttpHeaders());

            Employee employee1 = employee.get();
            ResponseEntity<Allocation[]> responseEntity = restTemplate().exchange("localhost:8090" + id, HttpMethod.GET, httpEntity, Allocation[].class);
            return employee1;
        }
        return null;
    }
}
