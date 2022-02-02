package com.werkbliq.customerfile;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomersController {
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
	return "Viewcustomers";
}

}
