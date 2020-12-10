package tech.itpark.competition.manager;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tech.itpark.competition.mapper.CompetitionRowMapper;
import tech.itpark.competition.model.Competition;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CompetitionManager {
    private final NamedParameterJdbcTemplate template;
    private final CompetitionRowMapper rowMapper = new CompetitionRowMapper();

    public List<Competition> getAllComp() {
        return template.query(
                "SELECT id, participantId, pointsOne, pointsTwo, pointsThree FROM competition ORDER BY id LIMIT 50",
                rowMapper
        );
    }


    public List<Competition> getPointsById(long participantId) {
        return template.query(
                "SELECT id, participantId, pointsOne, pointsTwo, pointsThree FROM competition WHERE participantId = :participantId",
                new MapSqlParameterSource("participantId", participantId),
                rowMapper
        );
    }

    public List<Competition> getMaxPointsOne() {
        return template.query(
                "SELECT id, participantId, pointsOne as po, pointsTwo, pointsThree FROM competition WHERE pointsOne = (SELECT MAX(pointsOne) FROM competition) ",
                rowMapper
        );
    }



}
