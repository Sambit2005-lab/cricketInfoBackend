package com.codexnovas.cricketInfoBackend.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.config.YamlProcessor;

import java.util.Date;

@Entity
@Table(name="cricket_matches")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Matches {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;


    private String teamHeading;
    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;
    private String bowlTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    @Enumerated
    private MatchStatus status;

    // Hum date ko bhi update karenge jab jab live match chal raha hoga

    private Date date= new Date();

    // setting the match status according to text complete

    public void setMatchStatus(){
        if(textComplete.isBlank()){
            this.status=MatchStatus.Live;
        }
        else {
            this.status=MatchStatus.completed;
        }

    }



}
