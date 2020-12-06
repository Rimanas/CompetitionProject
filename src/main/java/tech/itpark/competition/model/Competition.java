package tech.itpark.competition.model;

import lombok.Value;

@Value
public class Competition {
    long id;
    long participant_id;
    int points_one;
    int points_two;
    int points_three;

}
