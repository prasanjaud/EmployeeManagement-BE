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
public class Bank {


    @Id
    @GeneratedValue
    private int bank_id;
    private String bank_name;
    @OneToMany(targetEntity = Branch.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "bank_id_fk",referencedColumnName = "bank_id")
    private List<Branch> branches;
}
