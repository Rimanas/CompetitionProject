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
                "SELECT id, participant_id, points_one, points_two, points_three FROM competition ORDER BY id LIMIT 50",
                rowMapper
        );
    }


    public List<Competition> getPointsById(long participant_id) {
        return template.query(
                "SELECT id, participant_id, points_one, points_two, points_three FROM competition WHERE participant_id = :participant_id",
                new MapSqlParameterSource("participant_id", participant_id),
                rowMapper
        );
    }



}
