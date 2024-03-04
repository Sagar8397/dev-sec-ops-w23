package org.customer.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SearchCustomerResponse {

	private String status;
	private String message;
	private long customer_id;
	private long customer_code;

	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	public long getCustomer_code() {
		return customer_code;
	}

	public void setCustomer_code(long customer_code) {
		this.customer_code = customer_code;
	}

	@Autowired
	private CustomerData customerData;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getCustomerId() {
		return customer_id;
	}

	public void setCustomerId(long customerId) {
		this.customer_id = customerId;
	}

	public CustomerData getCustomerData() {
		return customerData;
	}

	public void setCustomerData(CustomerData customerData) {
		this.customerData = customerData;
	}
}
