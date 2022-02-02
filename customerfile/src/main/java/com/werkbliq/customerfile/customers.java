package com.werkbliq.customerfile;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class customers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

		private String customer;
		private String adress;
		private String dogbreed;
		private String finding;
/*		private List<String> tags; */
		
		public void CustomerResponse(
				Long id,
				String customer,
				String adress,
				String dogbreed,
				String finding,
				List<String> tags) {
			this.id = id;
			this.customer = customer;
			this.adress = adress;
			this.dogbreed = dogbreed;
		    this.finding = finding;
	/*		this.tags = tags; */
		}

		public Long getId() {
			return id;
		}
		public void setId(Long id) {
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
/*		public List<String> getList() {
			return tags;
		}
		public void setList(List<String> tags) {
			this.tags = tags;
		} */
	
	}



