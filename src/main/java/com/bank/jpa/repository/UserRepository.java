package com.bank.jpa.repository;

import com.bank.jpa.dto.AuthenticationUser;
import com.bank.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT new com.bank.jpa.dto.AuthenticationUser(user_name, password) FROM User")
    public List<AuthenticationUser> getAccess();

}
