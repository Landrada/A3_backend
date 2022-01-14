package com.example.A3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.A3.model.Aspiration;

@Repository
public interface IAspirationRepository extends JpaRepository<Aspiration,Long>{

}
