package edu.uptc.swii.customerservicehexa.application.usecases;

import java.util.List;
import java.util.Optional;

import edu.uptc.swii.customerservicehexa.application.ports.in.FindCustomerUseCase;
import edu.uptc.swii.customerservicehexa.application.ports.out.CustomerRepositoryPort;
import edu.uptc.swii.customerservicehexa.domain.model.Customer;

public class FindCustomerUseCaseImpl implements FindCustomerUseCase {
    private final CustomerRepositoryPort customerRepositoryPort;

    public FindCustomerUseCaseImpl(CustomerRepositoryPort customerRepositoryPort) {
        this.customerRepositoryPort = customerRepositoryPort;
    }

    @Override
    public Optional<Customer> getCustomerById(Integer id) {
        return customerRepositoryPort.findById(id);
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepositoryPort.findAll();
    }
}
