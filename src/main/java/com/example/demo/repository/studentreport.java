package com.example.sql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.repository;

import com.example.sql.Entitydata.Student;

@Repository
public interface studentreport extends JpaRepository<student,Integer> {

    
}