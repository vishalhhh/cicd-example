package com.example.demojpahibernate.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demojpahibernate.model.Player;
import com.example.demojpahibernate.model.Team;
import com.example.demojpahibernate.repository.PlayerRepository;
import com.example.demojpahibernate.repository.TeamRepository;

public class SoccerServiceImpl implements SoccerService {

	@Autowired
	PlayerRepository playerRepo;

	@Autowired
	TeamRepository teamRepo;

	@Override
	public List<String> getAllTeamPlayers(long teamId) {
		List<String> result = new ArrayList<>();
		Optional<Player> optionalPlayerList = playerRepo.findById(teamId);

		optionalPlayerList.ifPresent(player -> result.add(player.getName()));

		return result;
	}

	@Override
	public void addTeamPlayer(String name, String position, int number) {

		Team barcelona = teamRepo.findOne(1l);
		Player newPlayer = new Player();
		newPlayer.setName(name);
		newPlayer.setPosition(position);
		newPlayer.setNum(number);
		newPlayer.setTeam(barcelona);
		playerRepo.save(newPlayer);

	}

}
