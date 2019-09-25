package com.javatraining.librarymanagementsystem.dao;

import org.springframework.data.repository.CrudRepository;

import com.javatraining.librarymanagementsystem.entities.Admin;

public interface AdminDAO extends CrudRepository<Admin, Integer> {

}
