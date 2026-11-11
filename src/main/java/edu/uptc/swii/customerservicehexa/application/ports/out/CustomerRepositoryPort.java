package edu.uptc.swii.customerservicehexa.application.ports.out;

import java.util.List;
import java.util.Optional;

import edu.uptc.swii.customerservicehexa.domain.model.Customer;

public interface CustomerRepositoryPort {
    Customer save(Customer customer);

    Optional<Customer> findById(Integer id);

    List<Customer> findAll();

    Optional<Customer> update(Customer customer);

    boolean deleteById(Integer id);
}
