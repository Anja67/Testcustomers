package com.werkbliq.customerfile;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<customers, String> {
	
/* public customers findAllById(String id);*/

 
}
