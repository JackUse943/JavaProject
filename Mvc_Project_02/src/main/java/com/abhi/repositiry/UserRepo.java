package com.abhi.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.entity.AdminUser;

public interface UserRepo extends JpaRepository<AdminUser, Integer> {

}
