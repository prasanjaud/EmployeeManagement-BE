package com.bank.jpa.repository;

import com.bank.jpa.dto.RetrieveData;
import com.bank.jpa.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BranchRepository extends JpaRepository<Branch, Integer> {


}
