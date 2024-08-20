package com.project.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.register.model.RegisterClass;

public interface RegisterRepo extends JpaRepository<RegisterClass, Integer> {

}
