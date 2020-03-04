package com.ua.es.labproject.service;

import com.ua.es.labproject.domain.Joke;
import com.ua.es.labproject.repository.JokeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class JokeService {

    private static final Logger log = LoggerFactory.getLogger(JokeService.class);

    private JokeRepository jokeRepository;

    public JokeService(JokeRepository jokeRepository) {
        this.jokeRepository = jokeRepository;
    }

    public Iterable<Joke> list() {
        return jokeRepository.findAll();
    }

    public Joke save(Joke joke) {
        return jokeRepository.save(joke);
    }

    public void save(List<Joke> jokes) {
        jokeRepository.saveAll(jokes);
    }

    @Scheduled(fixedRate = 5000)
    public void getJson(){
        RestTemplate restTemplate = new RestTemplate();
        // pull data from REST API
        Joke joke = restTemplate.getForObject("https://api.chucknorris.io/jokes/random", Joke.class);
        jokeRepository.save(joke);
        log.info(joke.toString());
    }
}
