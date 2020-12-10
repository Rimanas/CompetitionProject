package tech.itpark.competition.manager;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tech.itpark.competition.mapper.ParticipantCompetitionRowMapper;
import tech.itpark.competition.model.ParticipantCompetition;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ParticipantCompetitionManager {
    private final NamedParameterJdbcTemplate jdbcTemplate;
    private final ParticipantCompetitionRowMapper rowMapperGeneral = new ParticipantCompetitionRowMapper();

    public List<ParticipantCompetition> getPointsOfParticipantCompetition() {
        return jdbcTemplate.query
                (
                        "SELECT p.id,\n" +
                                "       p.name,\n" +
                                "       p.surname,\n" +
                                "       p.age,\n" +
                                "       p.competence,\n" +
                                "       p.competenceName,\n" +
                                "       c.participantId, c.pointsOne, c.pointsTwo, c.pointsThree, (c.pointsOne + c.pointsTwo + c.pointsThree) as points\n" +
                                "FROM participants p\n" +
                                "         JOIN competition c ON c.participantId = p.id;",
                        rowMapperGeneral
                );
    }

    public List<ParticipantCompetition> getParticipantCompetitionMaxPoint() {
        return jdbcTemplate.query
                (
                        "SELECT p.id,\n" +
                                "       p.name,\n" +
                                "       p.surname,\n" +
                                "       p.age,\n" +
                                "       p.competence,\n" +
                                "       p.competenceName,\n" +
                                "       c.participantId, c.pointsOne, c.pointsTwo, c.pointsThree, (c.pointsOne + c.pointsTwo + c.pointsThree) as points\n" +
                                "FROM participants p\n" +
                                "         JOIN competition c ON c.participantId = p.id ORDER BY points DESC LIMIT 5",
                        rowMapperGeneral
                );
    }

}
