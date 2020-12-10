package tech.itpark.competition.model;

import lombok.Value;

@Value
public class ParticipantCompetition {
    long id;
    String name;
    String surname;
    int age;
    String competence;
    String competenceName;
    long participantId;
    int pointsOne;
    int pointsTwo;
    int pointsThree;
    int points;
}
