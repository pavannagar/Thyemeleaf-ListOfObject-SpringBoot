package com.dhakad.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dhakad.User;

@Repository
public interface UserRepo extends CrudRepository<User, String> {

}
