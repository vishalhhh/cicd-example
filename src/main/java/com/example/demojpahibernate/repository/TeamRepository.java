package com.example.demojpahibernate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demojpahibernate.model.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

	Team findOne(long l);

}
