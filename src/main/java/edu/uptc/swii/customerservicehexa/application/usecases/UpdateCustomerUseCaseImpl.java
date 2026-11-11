package edu.uptc.swii.customerservicehexa.application.usecases;

import java.util.Optional;

import edu.uptc.swii.customerservicehexa.application.ports.in.UpdateCustomerUseCase;
import edu.uptc.swii.customerservicehexa.application.ports.out.CustomerRepositoryPort;
import edu.uptc.swii.customerservicehexa.domain.model.Customer;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {
    private final CustomerRepositoryPort customerRepositoryPort;

    public UpdateCustomerUseCaseImpl(CustomerRepositoryPort customerRepositoryPort) {
        this.customerRepositoryPort = customerRepositoryPort;
    }

    @Override
    public Optional<Customer> updateCustomer(Integer id, Customer customer) {
        return customerRepositoryPort.update(customer);
    }
}
