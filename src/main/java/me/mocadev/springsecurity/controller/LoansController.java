package me.mocadev.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

	@GetMapping("/myLoan")
	public String getLoanDetail() {
		return "loan detail";
	}
}
