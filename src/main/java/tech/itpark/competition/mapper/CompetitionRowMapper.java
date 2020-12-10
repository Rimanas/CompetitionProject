package tech.itpark.competition.mapper;

import org.springframework.jdbc.core.RowMapper;
import tech.itpark.competition.model.Competition;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CompetitionRowMapper implements RowMapper<Competition> {
    public Competition mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Competition(
                rs.getLong("id"),
                rs.getLong("participantId"),
                rs.getInt("pointsOne"),
                rs.getInt("pointsTwo"),
                rs.getInt("pointsThree")
        );
    }
}
