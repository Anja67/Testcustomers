package com.werkbliq.customerfile;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomersController {
	
	
	private static List<customers> customers = new ArrayList<>();
	
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@RequestMapping("/customers")
	public String customers() 
	{
			return "Liste Kunden";
}
	
@PostMapping("/details")
public String viewdetails(@RequestParam("id") String id,
		       @RequestParam("customer") String customer,
		       @RequestParam("adress") String adress,
		       @RequestParam("dogbreed") String dogbreed,
		       @RequestParam("finding") String finding, ModelMap modelMap)
{
	modelMap.put("id", id);
	modelMap.put("customer", customer);
	modelMap.put("adress", adress);
	modelMap.put("dogbreed", dogbreed);
	modelMap.put("finding", finding);
	
	  customers customerEntity = new customers();

 //No ID! It will be genereated
  customerEntity.setCustomer(customer);
  customerEntity.setCustomer(adress);
  customerEntity.setCustomer(dogbreed);
  customerEntity.setCustomer(finding);
  
  customerEntity = customerRepo.save(customerEntity);
 //Now , it is an ID in the entity
  
  return "Viewcustomers";
	 
}

@GetMapping("/Id")
/*public String viewcustomer(@RequestParam("id") String id,
	       @RequestParam("customer") String customer,
	       @RequestParam("adress") String adress,
	       @RequestParam("dogbreed") String dogbreed,
	       @RequestParam("finding") String finding, ModelMap modelMap)

{	
	modelMap.put("id", id);
	modelMap.put("customer", customer);
	modelMap.put("adress", adress);
	modelMap.put("dogbreed", dogbreed);
	modelMap.put("finding", finding);	
	
	customers customerEntity = new customers();
	//get all data 
	customerEntity.getId();
	customerEntity.getCustomer();
	customerEntity.getAdress();
	customerEntity.getDogbreed();
	customerEntity.getFinding();
	
/*	customerEntity = customerRepo.findAll(customerEntity);*/
	//all data 
	
/*	return "viewdatacustomer";*/

 public ResponseEntity<List<customers>> getCustomers()
 {
	return new ResponseEntity<>(customers,HttpStatus.OK);//OK = Status 200
}

@PostMapping("/details2")
		public ResponseEntity<customers>viewdetails2(@RequestBody customers customer)
		{
			
			//No ID! it will be generated
			customer = customerRepo.save(customer);
			//Now, it is an in the entity
			
			return new ResponseEntity<>(customer,HttpStatus.CREATED);//CREATED = Status 201
				
		}
		
@GetMapping("/{Id}")
@ResponseBody
public ResponseEntity<customers>getCustomerById(@PathVariable String Id)
{
	
			return customers.stream()
					.filter(customer -> customer.getId().equals(Id))
					.findFirst()
					.map(customer -> new ResponseEntity<>(customer,HttpStatus.OK))//OK = Status 200            
					.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));//NOT_FOUND = Status 404 
					
	
	}
	}
