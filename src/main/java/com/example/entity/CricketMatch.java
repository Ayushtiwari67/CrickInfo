package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cricket_matches")
public class CricketMatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long matchId;
    private String teamHeading;
    private String matchNumberVenue;
    private String battingTeamScore;
    private String battingTeam;
    private String bowlTeam;
    private String bowlTeamScore;
    private String liveText;
    private String matchLink;
    private String textComplete;

    //set the match status according to textCompleted
    public void setMatchStatus(){
        if (textComplete.isBlank()){
            this.status = MatchStatus.LIVE;
        }else {
            this.status = MatchStatus.COMPLETED;
        }
    }
    @Enumerated
    private MatchStatus status;

    private Date date = new Date();

}
