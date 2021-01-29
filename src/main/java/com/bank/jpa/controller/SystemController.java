package com.bank.jpa.controller;

import com.bank.jpa.dto.AuthenticationUser;
import com.bank.jpa.dto.RetrieveData;
import com.bank.jpa.entity.Bank;
import com.bank.jpa.entity.Branch;
import com.bank.jpa.entity.Employee;
import com.bank.jpa.entity.User;
import com.bank.jpa.repository.BankRepository;
import com.bank.jpa.repository.BranchRepository;
import com.bank.jpa.repository.EmployeeRepository;
import com.bank.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SystemController {

    @Autowired
    private BankRepository bankRepository;

    @Autowired
    private BranchRepository branchRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/allBank")
    public List<Bank> findAllBank(){
        return bankRepository.findAll();
    }

    @GetMapping("/allBranch")
    public List<Branch> findAllBranch(){
        return branchRepository.findAll();
    }

    @GetMapping("/allEmployee")
    public List<Employee> findAllEmployee(){
        return employeeRepository.findAll();
    }

    @GetMapping("/retrieveUser")
    public List<User> getUser(){
        return userRepository.findAll();
    }

    @GetMapping("/user")
    public List<AuthenticationUser> getUserAccess(){
        return userRepository.getAccess();
    }

    @GetMapping("/retrieveUser/{id}")
    public User get(@PathVariable Integer id) {
        return userRepository.findById(id).get();
    }


    //Main Retrieve Part
    @GetMapping("/retrieveData")
    public List<RetrieveData> getInfo(){
        return bankRepository.getInfo();
    }

}
