package com.example.demojpahibernate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demojpahibernate.model.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
	

}
