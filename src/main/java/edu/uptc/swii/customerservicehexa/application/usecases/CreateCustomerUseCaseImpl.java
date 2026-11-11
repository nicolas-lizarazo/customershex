package edu.uptc.swii.customerservicehexa.application.usecases;

import edu.uptc.swii.customerservicehexa.application.ports.in.CreateCustomerUseCase;
import edu.uptc.swii.customerservicehexa.application.ports.out.CustomerRepositoryPort;
import edu.uptc.swii.customerservicehexa.domain.model.Customer;

public class CreateCustomerUseCaseImpl implements CreateCustomerUseCase {
    private final CustomerRepositoryPort customerRepositoryPort;

    public CreateCustomerUseCaseImpl(CustomerRepositoryPort customerRepositoryPort) {
        this.customerRepositoryPort = customerRepositoryPort;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepositoryPort.save(customer);
    }
}
