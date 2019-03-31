package com.example.demojpahibernate.service;

import java.util.List;

public interface SoccerService {
	
	public List<String> getAllTeamPlayers(long teamId);
	
	public void addTeamPlayer(String name, String position, int number);
	
}
