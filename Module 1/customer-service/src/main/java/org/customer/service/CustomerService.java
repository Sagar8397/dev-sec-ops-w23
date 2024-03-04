package org.customer.service;

import java.util.List;

import org.customer.dto.CustomerRequest;
import org.customer.dto.CustomerResponse;
import org.customer.dto.SearchCustomerResponse;
import org.customer.entity.Customer;

public interface CustomerService {

	public CustomerResponse addCustomerDetails(CustomerRequest customerRequest);

	public CustomerResponse updateCustomerDetails(long id, CustomerRequest customerRequest) ;
	
	//public CustomerResponse findByEmailId(String email_id);
	
	public SearchCustomerResponse findByMobileNumber(String mobile_number);
	
	public List<Customer> getAllCustomer();
		
}
