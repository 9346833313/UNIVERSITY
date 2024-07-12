package com.example.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.university.entity.StudentCse;

public interface CSERepository extends JpaRepository<StudentCse, Long> {

}
