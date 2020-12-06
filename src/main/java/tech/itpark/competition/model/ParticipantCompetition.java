package tech.itpark.competition.model;

import lombok.Value;

@Value
public class ParticipantCompetition {
    long id;
    String name;
    String surname;
    int age;
    String competence;
    String competence_name;
    long participant_id;
    int points_one;
    int points_two;
    int points_three;
}
