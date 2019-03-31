package com.example.demojpahibernate.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demojpahibernate.model.Player;

@RestController
@RequestMapping("/rest/football")
public class ResourceController {

	@GetMapping("/get/players")
	public List<Player> getPlayers() {

		List<Player> playerList = new ArrayList<>();
		return playerList;
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to CICD";
	}

}
