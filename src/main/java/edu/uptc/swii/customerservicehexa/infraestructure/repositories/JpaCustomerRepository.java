package edu.uptc.swii.customerservicehexa.infraestructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.uptc.swii.customerservicehexa.infraestructure.entities.CustomerEntity;

public interface JpaCustomerRepository extends JpaRepository<CustomerEntity, Integer> {

}
