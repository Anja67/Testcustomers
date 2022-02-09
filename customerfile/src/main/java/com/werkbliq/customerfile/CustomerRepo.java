package com.werkbliq.customerfile;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Long> {

	public List<Customer> findAll();

	Optional<Customer> findById(Long id);
}
