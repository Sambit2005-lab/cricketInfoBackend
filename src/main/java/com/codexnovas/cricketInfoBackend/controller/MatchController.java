package com.codexnovas.cricketInfoBackend.controller;


import com.codexnovas.cricketInfoBackend.Serivices.MatchService;
import com.codexnovas.cricketInfoBackend.entity.Matches;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchController {

    private MatchService matchService;
    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    public ResponseEntity<List<Matches>> getLiveMatches(){
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);

    }


}
