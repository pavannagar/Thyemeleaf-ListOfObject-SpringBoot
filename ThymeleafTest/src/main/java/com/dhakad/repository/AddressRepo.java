package com.dhakad.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dhakad.Address;

@Repository
public interface AddressRepo extends CrudRepository<Address, Integer> {

}
