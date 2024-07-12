package com.example.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.university.entity.ITStudent;

public interface ITRepository extends JpaRepository<ITStudent, Long>{

}
