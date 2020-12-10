package tech.itpark.competition.model;

import lombok.Value;

@Value
public class PaidCompetition {
    long id;
    int teamNumber;
    int paymentPaid;
}
