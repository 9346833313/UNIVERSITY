package com.example.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.university.entity.studentece;

public interface ECERepository extends JpaRepository<studentece, Long> {

}
