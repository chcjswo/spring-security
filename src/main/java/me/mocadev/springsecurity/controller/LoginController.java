package me.mocadev.springsecurity.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import me.mocadev.springsecurity.model.Customer;
import me.mocadev.springsecurity.repository.CustomerRepository;

@RequiredArgsConstructor
@RestController
public class LoginController {

	private final CustomerRepository customerRepository;

	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody Customer customer) {
		Customer savedCustomer;
		ResponseEntity response = null;
		try {
			savedCustomer = customerRepository.save(customer);
			if (savedCustomer.getId() > 0) {
				response = ResponseEntity
					.status(HttpStatus.CREATED)
					.body("Given user details are successfully registered");
			}
		} catch (Exception ex) {
			response = ResponseEntity
				.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body("An exception occured due to " + ex.getMessage());
		}
		return response;
	}
}
