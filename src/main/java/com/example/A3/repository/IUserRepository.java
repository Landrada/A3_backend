package com.example.A3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.A3.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {

}
