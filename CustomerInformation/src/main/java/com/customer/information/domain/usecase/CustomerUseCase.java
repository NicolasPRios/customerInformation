package com.customer.information.domain.usecase;

import com.customer.information.domain.model.customer.Customer;
import com.customer.information.domain.model.customer.CustomerRequest;
import com.customer.information.domain.model.customer.gateways.CustomerRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomerUseCase {

    private final CustomerRepository customerRepository;

    public Customer getCustomerInformationById(CustomerRequest customerRequest){
        return customerRepository.getCustomerInformationById(customerRequest);
    }
}
