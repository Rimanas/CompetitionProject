package tech.itpark.competition.manager;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tech.itpark.competition.mapper.CompetitionRowMapper;
import tech.itpark.competition.mapper.GeneralRowMapper;
import tech.itpark.competition.model.ParticipantCompetition;

import java.util.Collections;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ParticipantCompetitionManager {
    private final NamedParameterJdbcTemplate template;
    private final GeneralRowMapper rowMapperGeneral = new GeneralRowMapper();

    public List<ParticipantCompetition> getAllDataFromTwoTable() {
        return template.query
                (
                        "SELECT p.id,\n" +
                                "       p.name,\n" +
                                "       p.surname,\n" +
                                "       p.age,\n" +
                                "       p.competence,\n" +
                                "       p.competence_name,\n" +
                                "       c.participant_id, c.points_one, c.points_two, c.points_three\n" +
                                "FROM participants p\n" +
                                "         JOIN competition c ON c.participant_id = p.id;",
                        rowMapperGeneral
                );
    }

}
