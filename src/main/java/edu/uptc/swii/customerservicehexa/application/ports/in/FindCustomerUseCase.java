package edu.uptc.swii.customerservicehexa.application.ports.in;

import java.util.List;
import java.util.Optional;

import edu.uptc.swii.customerservicehexa.domain.model.Customer;

public interface FindCustomerUseCase {
    Optional<Customer> getCustomerById(Integer id);

    List<Customer> findAllCustomers();
}
