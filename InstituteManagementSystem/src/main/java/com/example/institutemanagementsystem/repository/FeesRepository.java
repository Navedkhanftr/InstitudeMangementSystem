package com.example.institutemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.institutemanagementsystem.entity.FeesEntity;

@Repository
public interface FeesRepository extends JpaRepository<FeesEntity, Long> {

}
