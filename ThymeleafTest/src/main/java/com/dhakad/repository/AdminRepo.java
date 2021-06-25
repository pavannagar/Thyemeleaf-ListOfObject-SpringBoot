package com.dhakad.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dhakad.Admin;

@Repository
public interface AdminRepo extends CrudRepository<Admin, Integer>{

}
