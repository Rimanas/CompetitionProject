package tech.itpark.competition.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.object.MappingSqlQuery;
import tech.itpark.competition.model.Competition;
import tech.itpark.competition.model.Participant;
import tech.itpark.competition.model.ParticipantCompetition;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GeneralRowMapper implements RowMapper<ParticipantCompetition> {

    public ParticipantCompetition mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new ParticipantCompetition(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("surname"),
                rs.getInt("age"),
                rs.getString("competence"),
                rs.getString("competence_name"),
                rs.getLong("participant_id"),
                rs.getInt("points_one"),
                rs.getInt("points_two"),
                rs.getInt("points_three")
        );
    }
}
