package com.codexnovas.cricketInfoBackend.repository;

import com.codexnovas.cricketInfoBackend.entity.Matches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MatchRepo extends JpaRepository<Matches,Integer> {
    // phir hum chahte hain team ke naam pe saare live matches fetch ho jae
    // so hum optional use karenge kyunki yeh batayega humare pass wo data hai ki nahin jo hum dhund rahein hain
    Optional<Matches> findByTeamHeading(String teamHeading);
}
