package edu.uptc.swii.customerservicehexa.infraestructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.uptc.swii.customerservicehexa.infraestructure.entities.CustomerEntity;

public class JpaCustomerRespository extends JpaRepository<CustomerEntity, Integer> {

}
