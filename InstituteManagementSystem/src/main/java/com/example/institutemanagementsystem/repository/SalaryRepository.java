package com.example.institutemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.institutemanagementsystem.entity.SalaryEntity;

@Repository
public interface SalaryRepository extends JpaRepository<SalaryEntity, Long> {

}
