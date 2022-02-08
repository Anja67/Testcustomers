package com.werkbliq.customerfile;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class customers {
	
	private static List<customers> customers = new ArrayList<>();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

		private String customer;
		private String adress;
		private String dogbreed;
		private String finding;/*
    	private List<String> customers;*/
		
		@SuppressWarnings("static-access")
		public void CustomersResponse(
				String id,
				String customer,
				String adress,
				String dogbreed,
				String finding,
				List<customers> customers) {
			this.id = id;
			this.customer = customer;
			this.adress = adress;
			this.dogbreed = dogbreed;
		    this.finding = finding;
			this.customers = customers;
		}

		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		
		public String getCustomer() {
			return customer;
		}
		public void setCustomer(String customer) {
			this.customer = customer;
		}
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		public String getDogbreed() {
			return dogbreed;
		}
		public void setDogbreed(String dogbreed) {
			this.dogbreed = dogbreed;
		}
		public String getFinding() {
			return finding;
		}
		public void setFinding(String finding) {
			this.finding = finding;
		}

		public List<customers> filter(String id) {
			return (getCustomers());
		}
		
		public customers stream() {

			return (customers) getCustomers();
		}

		public static List<customers> getCustomers() {
			return customers;
		}

		public static void setCustomers(List<customers> customers) {
			customers = customers;
		}

		}

	



