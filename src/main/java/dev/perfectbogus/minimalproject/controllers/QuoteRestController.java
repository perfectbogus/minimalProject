package dev.perfectbogus.minimalproject.controllers;

import dev.perfectbogus.minimalproject.repositories.QuoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/quote")
public class QuoteRestController {

    private final QuoteRepository quoteRepository;

    public QuoteRestController(QuoteRepository quoteRepository){
        this.quoteRepository = quoteRepository;
    }

    @GetMapping(value = "/random")
    public ResponseEntity getRandomQuote(){
        return new ResponseEntity(quoteRepository.findById(1L), HttpStatus.OK);
    }

    @GetMapping(value = "/all")
    public ResponseEntity getAllQuotes(){
        return new ResponseEntity(quoteRepository.findAll(), HttpStatus.OK);
    }

}
