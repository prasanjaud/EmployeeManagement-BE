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
public class Employee {

    @Id
    @GeneratedValue
    private int emp_id;
    private String emp_name;
    private String emp_email;
    private String emp_photo;
    private String emp_address;
    @OneToMany(targetEntity = User.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "emp_id",referencedColumnName = "emp_id")
    private List<User> users;
}
