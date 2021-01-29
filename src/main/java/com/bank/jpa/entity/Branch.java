package com.bank.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
//import libraries

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class Branch {

    @Id
    @GeneratedValue
    private int branch_id;
    private String branch_name;
    private String branch_address;
    @OneToMany(targetEntity = Employee.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "branch_id_fk",referencedColumnName = "branch_id")
    private List<Employee> employees;
}
