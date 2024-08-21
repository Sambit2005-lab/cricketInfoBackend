package com.codexnovas.cricketInfoBackend.Serivices.impl;

import com.codexnovas.cricketInfoBackend.Serivices.MatchService;
import com.codexnovas.cricketInfoBackend.entity.Matches;
import com.codexnovas.cricketInfoBackend.repository.MatchRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchServiceimpl implements MatchService {

    private MatchRepo matchRepo;
    public MatchServiceimpl(MatchRepo matchRepo) {
        this.matchRepo = matchRepo;
    }



    @Override
    public List<Matches> getAllMatches() {
        return null;
    }

    @Override
    public List<Matches> getLiveMatches() {
        return null;
    }
}
