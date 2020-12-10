package tech.itpark.competition.model;

import lombok.Value;

@Value
public class Competition {
    long id;
    long participantId;
    int pointsOne;
    int pointsTwo;
    int pointsThree;

}
