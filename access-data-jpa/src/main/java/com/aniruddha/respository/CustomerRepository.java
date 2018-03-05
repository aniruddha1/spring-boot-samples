package com.aniruddha.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aniruddha.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
	List<Customer> findByLastName(String lastName);

}
