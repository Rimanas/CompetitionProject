package tech.itpark.competition.model;

import lombok.Value;

@Value
public class Participant {
    long id;
    String name;
    String surname;
    String country;
    String city;
    int age;
    String gender;
    String competence;
    String competenceName;
    String urlImage;
}
