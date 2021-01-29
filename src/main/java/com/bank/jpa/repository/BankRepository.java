package com.bank.jpa.repository;

import com.bank.jpa.dto.RetrieveData;
import com.bank.jpa.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BankRepository extends JpaRepository<Bank, Integer> {

    @Query("SELECT new com.bank.jpa.dto.RetrieveData(e.emp_id, e.emp_name, e.emp_email, e.emp_photo, b.branch_name ,a.bank_name) FROM Bank a JOIN a.branches b JOIN b.employees e")
    public List<RetrieveData> getInfo();

}
