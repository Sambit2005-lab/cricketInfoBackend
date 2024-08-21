package com.codexnovas.cricketInfoBackend.Serivices;


import com.codexnovas.cricketInfoBackend.entity.Matches;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MatchService {
    //get all matches
    List<Matches> getAllMatches();
    // get live matches
    List<Matches> getLiveMatches();

}
