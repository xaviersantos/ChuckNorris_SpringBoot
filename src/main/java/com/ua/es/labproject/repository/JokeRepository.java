package com.ua.es.labproject.repository;

import com.ua.es.labproject.domain.Joke;
import org.springframework.data.repository.CrudRepository;

public interface JokeRepository extends CrudRepository<Joke, Long> {

}
