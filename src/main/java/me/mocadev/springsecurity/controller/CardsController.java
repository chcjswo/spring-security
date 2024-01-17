package me.mocadev.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

	@GetMapping("/myCard")
	public String getCardDetail() {
		return "card detail";
	}
}
