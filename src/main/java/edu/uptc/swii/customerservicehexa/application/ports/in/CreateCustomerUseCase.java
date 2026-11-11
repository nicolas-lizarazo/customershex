package edu.uptc.swii.customerservicehexa.application.ports.in;

import edu.uptc.swii.customerservicehexa.domain.model.Customer;

public interface CreateCustomerUseCase {
    Customer createCustomer(Customer customer);
}
