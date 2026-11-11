package edu.uptc.swii.customerservicehexa.application.services;

import java.util.List;
import java.util.Optional;

import edu.uptc.swii.customerservicehexa.application.ports.in.CreateCustomerUseCase;
import edu.uptc.swii.customerservicehexa.application.ports.in.DeleteCustomerUseCase;
import edu.uptc.swii.customerservicehexa.application.ports.in.FindCustomerUseCase;
import edu.uptc.swii.customerservicehexa.application.ports.in.UpdateCustomerUseCase;
import edu.uptc.swii.customerservicehexa.domain.model.Customer;

public class CustomerService
        implements CreateCustomerUseCase, FindCustomerUseCase, DeleteCustomerUseCase, UpdateCustomerUseCase {
    private final CreateCustomerUseCase createCustomerUseCase;
    private final FindCustomerUseCase findCustomerUseCase;
    private final DeleteCustomerUseCase deleteCustomerUserCase;
    private final UpdateCustomerUseCase updateCustomerUseCase;

    public CustomerService(CreateCustomerUseCase createCustomerUseCase,
            FindCustomerUseCase findCustomerUseCase,
            DeleteCustomerUseCase deleteCustomerUserCase,
            UpdateCustomerUseCase updateCustomerUseCase) {
        this.createCustomerUseCase = createCustomerUseCase;
        this.findCustomerUseCase = findCustomerUseCase;
        this.deleteCustomerUserCase = deleteCustomerUserCase;
        this.updateCustomerUseCase = updateCustomerUseCase;
    }

    @Override
    public Optional<Customer> updateCustomer(Integer id, Customer updateCustomer) {
        return updateCustomerUseCase.updateCustomer(id, updateCustomer);
    }

    @Override
    public Optional<Customer> getCustomerById(Integer id) {
        return findCustomerUseCase.getCustomerById(id);
    }

    @Override
    public boolean deleteCustomer(Integer id) {
        return deleteCustomerUserCase.deleteCustomer(id);
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return createCustomerUseCase.createCustomer(customer);
    }

    @Override
    public List<Customer> findAllCustomers() {
        return findCustomerUseCase.findAllCustomers();
    }
}
