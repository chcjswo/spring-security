package me.mocadev.springsecurity.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import me.mocadev.springsecurity.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	List<Customer> findByEmail(String email);
}
