package com.customer.information.domain.model.customer.gateways;

import com.customer.information.domain.model.customer.Customer;
import com.customer.information.domain.model.customer.CustomerRequest;

public interface CustomerRepository {
    Customer getCustomerInformationById(CustomerRequest customerRequest);
}
