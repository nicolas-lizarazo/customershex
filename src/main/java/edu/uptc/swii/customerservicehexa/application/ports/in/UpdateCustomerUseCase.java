package edu.uptc.swii.customerservicehexa.application.ports.in;

import java.util.Optional;

import edu.uptc.swii.customerservicehexa.domain.model.Customer;

public interface UpdateCustomerUseCase {
    Optional<Customer> updateCustomer(Integer id, Customer customer);
}
