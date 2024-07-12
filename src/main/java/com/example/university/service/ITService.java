package com.example.university.service;

import java.util.List;

import com.example.university.entity.ITStudent;

public interface ITService {

 public ITStudent saveITStudent(ITStudent itStudent);
 public List<ITStudent> getAllItStudents();
 public ITStudent getItStudent(long id);
 public ITStudent updateItStudent(ITStudent itStudent, long id);
 public void deleteItStudent(long id);
}
